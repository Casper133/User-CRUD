package com.casper.usercrud.dto;

import lombok.Data;

@Data
public class UserRequestDto {

  private String email;

  private String username;

  private String password;

}
