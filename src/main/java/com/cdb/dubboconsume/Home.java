package com.cdb.dubboconsume;

import com.cdb.dubbodemo.dubboapi.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class Home {

    @Resource(name = "demoService")
    private DemoService demoService;
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        List<String> list=demoService.getPermissions(4L);
        System.out.println("---------------------");
        System.out.println(list);
        return "home";
    }

}
