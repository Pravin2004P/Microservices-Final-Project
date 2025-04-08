package com.pravin.sbms_welcome.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
  @GetMapping("/welcome")
  public String welcomeMessage() {
    return ">>>>>>>>>>>>>>>>this is welcome message>>>>>>>>>>>>>>>";
  }
}
