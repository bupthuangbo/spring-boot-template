package cn.hbfyt;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
    @RequestMapping("/world")
    public String helloWorld() {
        return "helloWorld";
    }
}
