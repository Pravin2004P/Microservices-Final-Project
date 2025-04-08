package com.pravin.sbms_welcome_client.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")
public interface WelcomeApiClient {
    @GetMapping("/welcome")
    public String involeWelcomeApi(); 
}
