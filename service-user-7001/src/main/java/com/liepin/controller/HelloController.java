package com.liepin.controller;

import com.imooc.grace.result.GraceJSONResult;
import com.imooc.grace.result.IMOOCJSONResult;
import com.imooc.grace.result.ResponseStatusEnum;
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

    @GetMapping("hello2")
    public IMOOCJSONResult hello2() {
        Stu stu = new Stu(1001, "imooc", 18);

        return IMOOCJSONResult.ok(stu);
//        return IMOOCJSONResult.ok("添加成功！");
//        return IMOOCJSONResult.errorMsg("修改出错，请联系管理员");
//        return IMOOCJSONResult.errorMap(map)
//        return IMOOCJSONResult.errorUserTicket("用户会话校验失败！");
    }

    @GetMapping("hello3")
    public GraceJSONResult hello3() {
        Stu stu = new Stu(1001, "imooc", 18);

//        return GraceJSONResult.ok(stu);
//        return IMOOCJSONResult.ok("添加成功！");
//        return IMOOCJSONResult.errorMsg("修改出错，请联系管理员");
//        return IMOOCJSONResult.errorMap(map)
        return GraceJSONResult.errorCustom(ResponseStatusEnum.SYSTEM_IO);
    }

}
