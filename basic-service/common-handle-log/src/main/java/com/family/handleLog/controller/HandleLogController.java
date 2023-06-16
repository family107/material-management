package com.family.handleLog.controller;


import com.family.feign.client.service.HandleLogClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author family
 * @since 2023-06-01
 */
@RestController
@RequestMapping("/handleLog")
public class HandleLogController {

    @Resource
    private HandleLogClient handleLogClient;

    @GetMapping("test")
    public String test() {
        return handleLogClient.test();
    }
}

