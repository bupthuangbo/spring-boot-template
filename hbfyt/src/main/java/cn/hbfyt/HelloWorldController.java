package cn.hbfyt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("/")
    public String helloWorld() {
        return "你好啊，婷儿！快下班了，哈哈哈哈哈哈哈哈哈";
    }
}
