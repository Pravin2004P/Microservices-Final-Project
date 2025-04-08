package com.pravin.sbms_welcome_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pravin.sbms_welcome_client.client.WelcomeApiClient;

@RestController
public class GreetRestController {
  
  @Autowired
  private WelcomeApiClient welcomeApiClient;

  @GetMapping("/greet")
  public String getGreetMessage() {
    String greetMessage = "Good Morning";
    String welcomeMsg = welcomeApiClient.involeWelcomeApi();
    return greetMessage + welcomeMsg;
  }
}
