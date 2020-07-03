package top.glkj.service.impl;

import org.springframework.stereotype.Service;
import top.glkj.service.HelloService;

/**
 * @author : null
 * @date : 2020/7/4 0:55
 * @Description :
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello world";
    }
}
