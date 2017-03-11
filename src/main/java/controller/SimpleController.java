package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;d
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 全鹏飞 on 2017/3/11.
 */
@Controller
@EnableAutoConfiguration
public class SimpleController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleController.class, args);
    }
}
