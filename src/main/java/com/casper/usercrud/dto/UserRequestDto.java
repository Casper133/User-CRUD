package com.casper.usercrud.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {

    private String email;

    private String username;

    private String password;

}
