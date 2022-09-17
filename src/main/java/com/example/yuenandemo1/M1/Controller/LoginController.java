package com.example.yuenandemo1.M1.Controller;

import com.example.yuenandemo1.M1.Service.logintest;
import com.example.yuenandemo1.M1.common.Contants;
import com.example.yuenandemo1.M1.common.ReturnObject;
import com.example.yuenandemo1.M1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * isRemPwd 前端勾选的是否记住密码选项
 */
@RestController
@RequestMapping("/loginuser")
public class LoginController {
    @Autowired
     private logintest userService;
    @PostMapping ("/{isRemPwd}")
    @CrossOrigin("Access-Control-Allow-Origin: *")

    public Object login(@RequestBody User loginuser, @PathVariable("isRemPwd") String isRemPwd, HttpServletResponse response, HttpSession session){
        //封装参数
        System.out.println("开始登录"+loginuser);
        Map<String,Object> map=new HashMap<>();
        map.put("username",loginuser.getUsername());
        map.put("password",loginuser.getPassword());
        //调用service层方法，查询用户 是否纯在
        /**
         * MY 可以传参数 也可以传输封装后的map 也可以直接传输对象
         */
        User user=userService.queryUserByLoginActAndPwd(map);

        //根据查询结果，生成响应信息
        ReturnObject returnObject=new ReturnObject();
        if(user==null){
            //登录失败,用户名或者密码错误
            returnObject.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
            returnObject.setMessage("用户名或者密码错误");
            System.out.println(isRemPwd);
        }else{
             if("0".equals(user.getStatus())){
                //登录失败，状态被锁定 0即为不能登录
                returnObject.setCode(Contants.RETURN_OBJECT_CODE_FAIL);
                returnObject.setMessage("状态被锁定");
            }else{
                //登录成功
                returnObject.setCode(Contants.RETURN_OBJECT_CODE_SUCCESS);

                //把user保存到session中
                session.setAttribute(Contants.SESSION_USER,user);

                //如果需要记住密码，则往外写cookie
                if("true".equals(isRemPwd)){
                    Cookie c1=new Cookie("username",user.getUsername());
                    c1.setMaxAge(10*24*60*60);//cookie存在最大时间
                    response.addCookie(c1);
                    Cookie c2=new Cookie("password",user.getPassword());
                    c2.setMaxAge(10*24*60*60);
                    response.addCookie(c2);
                }else{
                    //把没有过期cookie删除
                    Cookie c1=new Cookie("username","1");
                    c1.setMaxAge(0);
                    response.addCookie(c1);
                    Cookie c2=new Cookie("password","1");
                    c2.setMaxAge(0);
//                    cookie是写在响应体中的
                    response.addCookie(c2);
                }
            }
        }

        return returnObject;
    }
}
