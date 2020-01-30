package com.docker.linux.jenkins.controller;

import java.time.Instant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetContoller {

  @RequestMapping("/greetme")
  public String greeting()
  {
    return "Hello Everyone at "+ Instant.now();
  }


}
