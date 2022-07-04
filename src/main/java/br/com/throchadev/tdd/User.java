package br.com.throchadev.tdd;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

  private String name;
  private String email;
  private int age;
}
