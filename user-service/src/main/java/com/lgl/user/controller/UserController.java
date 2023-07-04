package com.lgl.user.controller;

import com.lgl.user.config.PatternProperties;
import com.lgl.user.pojo.User;
import com.lgl.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestController
@RequestMapping("/user")
@RefreshScope //配置热更新方式一
public class UserController {

    @Autowired
    private UserService userService;

    //配置热更新方式一
//    @Value("${pattern.dateformat}")
//    private String dateformat;

    //配置热更新方式二
    @Autowired
    private PatternProperties patternProperties;

    @GetMapping("prop")
    public PatternProperties prop(){
        return patternProperties;
    }

    @GetMapping("now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(patternProperties.getDateformat()));
    }


    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        return userService.queryById(id);
    }
}
