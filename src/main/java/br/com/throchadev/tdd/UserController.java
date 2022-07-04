package br.com.throchadev.tdd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

  @GetMapping
  public List<User> userList() {
    return Collections
        .singletonList(User
        .builder()
        .name("Thiago")
        .email("thiago@hotmail.com")
        .age(30)
        .build());
  }
}
