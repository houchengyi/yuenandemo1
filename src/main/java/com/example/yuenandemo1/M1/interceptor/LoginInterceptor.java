package com.example.yuenandemo1.M1.interceptor;


import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.example.yuenandemo1.M1.common.Contants;
import com.example.yuenandemo1.M1.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@Component
/**
 * HandlerInterceptor
 * springboot的拦截器接口
 */
public class LoginInterceptor implements HandlerInterceptor {
    /**请求处理前
     * 目标资源前 过后post after渲染完了后
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //session 从request域中获取
        // 如果用户没有登录成功,则跳转到登录页面
        HttpSession session=httpServletRequest.getSession();
        /**
         * 判定session 是否出存放user
         * SESSION_USER 这个session域内对象作为标识
         */
        User user=(User) session.getAttribute(Contants.SESSION_USER);
        if(user==null){
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath());//重定向时，url必须加项目的名称
            return false;
        }
        return true;
    }

    /**
     * 请求处理后
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 整个请求视图渲染完
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
