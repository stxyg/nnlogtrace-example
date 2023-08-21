package cn.cnn.nnlogtraceexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * @author stxyg
 * @since 2022/12/29
 **/
@Slf4j
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/")
    public String hello(){
        log.info("hello");
        return "hello";
    }
}
