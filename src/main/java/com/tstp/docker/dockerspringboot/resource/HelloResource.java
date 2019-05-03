package com.tstp.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tisstp (T.STP)
 * @since 03-05-2019, 23:52
 */
@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {

  @GetMapping
  public String hello() {
    return "hello World";
  }

}
