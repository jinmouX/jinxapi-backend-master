package com.jinx.jinxapiclientsdk;

import com.jinx.jinxapiclientsdk.client.JinxApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("jinxapi.client")
@Data
@ComponentScan
public class JinxApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public JinxApiClient jinxApiClient() {
        return new JinxApiClient(accessKey, secretKey);
    }

}
