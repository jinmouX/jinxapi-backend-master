package com.jinx.jinxapiinterface;

import com.jinx.jinxapiclientsdk.client.JinxApiClient;
import com.jinx.jinxapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 测试类
 *
 *
 */
@SpringBootTest
class JinxapiInterfaceApplicationTests {

    @Resource
    private JinxApiClient jinxApiClient;

    @Test
    void contextLoads() {
        String result = jinxApiClient.getNameByGet("jinx");
        User user = new User();
        user.setUsername("jinx");
        String usernameByPost = jinxApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
