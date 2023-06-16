package com.family.message.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author family
 * @since 2023-06-05
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @GetMapping("test")
    public String test() {
        return "build success";
    }
}

