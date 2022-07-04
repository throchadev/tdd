package br.com.throchadev.tdd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

  @GetMapping
  public List<User> userList() {
    List<User> userList = new ArrayList<>();
    userList.add(new User("Thiago", "thiago@hotmail.com", 30));
    return userList;
  }

}
