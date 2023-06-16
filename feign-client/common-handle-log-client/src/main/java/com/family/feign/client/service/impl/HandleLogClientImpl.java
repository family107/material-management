package com.family.feign.client.service.impl;

import com.family.feign.client.service.HandleLogClient;
import org.springframework.stereotype.Component;

/**
 * @Auther: family
 * @Date: 2023/6/16 12:52
 * @Description:
 */
@Component
public class HandleLogClientImpl implements HandleLogClient {
    @Override
    public String test() {
        return "失败啦！！！";
    }
}
