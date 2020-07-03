package top.glkj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.glkj.service.HelloService;

/**
 * @author : null
 * @date : 2020/7/4 0:48
 * @Description :
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;
    @RequestMapping("/index")
    public String getIndex(){
        System.out.println(helloService.sayHello());
        return "index";
    }
}
