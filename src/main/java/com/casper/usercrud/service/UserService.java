package com.casper.usercrud.service;

import com.casper.usercrud.dto.UserRequestDto;
import com.casper.usercrud.dto.UserResponseDto;

public interface UserService {

    UserResponseDto createUser(UserRequestDto userRequestDto);

    UserResponseDto getUser(Long id);

    UserResponseDto editUser(Long id, UserRequestDto userRequestDto);

    void deleteUser(Long id);

}
