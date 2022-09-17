package com.example.yuenandemo1.M1.Controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.yuenandemo1.M1.Service.LocationService;
import com.example.yuenandemo1.M1.entity.FacebookData;
import com.example.yuenandemo1.M1.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *T_location 对应处理器
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/location")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @GetMapping("/{currentpage}/{pageSize}")
    public IPage getallorpage(@PathVariable("currentpage") Integer currentpage, @PathVariable("pageSize") Integer pageSzie){
//创建 ipage对象获取当前页 和大小 封装入page对象
        IPage page = new Page(currentpage,pageSzie);
        IPage iPage = locationService.page(page, null);
        if (currentpage >iPage.getPages()){
            page = new Page(iPage.getPages(),pageSzie);
            iPage = locationService.page(page, null);
        }

        return iPage;
    }
    @DeleteMapping("/{locationCode}")
    public boolean delete(@PathVariable("locationCode") int id){

        if (id!=0){
            if( locationService.removeById(id)==true){
                boolean r =true;
                return r;
            }
        }
        return  false;
    }
    @GetMapping("/{localtionCode}")
    public Location getbyid(@PathVariable("localtionCode")Integer id ){
        Location byId = locationService.getById(id);
        return byId;
    }
    @PutMapping("/")
    public boolean update(@RequestBody Location location){

        boolean b = locationService.updateById(location);
        if (b==true){
            return  b;

        }else {
            return  b;

        }

    }
    @PostMapping("/")
    public  boolean save(@RequestBody Location location){
        boolean save = locationService.save(location);
        return save;
    }
}
