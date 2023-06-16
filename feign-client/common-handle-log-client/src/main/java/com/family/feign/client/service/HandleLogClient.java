package com.family.feign.client.service;

import com.family.feign.client.service.impl.HandleLogClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: family
 * @Date: 2023/6/16 12:51
 * @Description:
 */
@FeignClient(value = "service-message",
        contextId = "HandleLog",
        fallback = HandleLogClientImpl.class)
public interface HandleLogClient {

    @GetMapping("/message/test")
    public String test();
}
