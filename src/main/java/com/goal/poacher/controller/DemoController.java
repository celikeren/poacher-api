package com.goal.poacher.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

  @GetMapping
  ResponseEntity<String> getDummyMessage() {
    return ResponseEntity.ok("I can ride my bike with no handlebars");
  }
}
