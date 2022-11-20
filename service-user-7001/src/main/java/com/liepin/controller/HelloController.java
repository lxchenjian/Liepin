package com.liepin.controller;

import com.imooc.pojo.test.Stu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("u")
@Slf4j
public class HelloController {

    @GetMapping("hello")
    public Object hello() {

        Stu stu = new Stu(1001, "imooc", 18);

//        System.out.println(stu.toString());
        log.info("info：" + stu.toString());
        log.debug("debug：" + stu.toString());
        log.warn("warn：" + stu.toString());
        log.error("error：{}", stu.toString());

        return "Hello UserService~~~";
    }

}
