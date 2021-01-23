package com.casper.usercrud.controller;

import com.casper.usercrud.dto.UserRequestDto;
import com.casper.usercrud.dto.UserResponseDto;
import com.casper.usercrud.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class UserController {

  private final UserService userService;

  @PostMapping("/user")
  public ResponseEntity<UserResponseDto> createUser(@RequestBody UserRequestDto userRequestDto) {
    UserResponseDto userResponseDto = userService.createUser(userRequestDto);
    return ResponseEntity.ok(userResponseDto);
  }

  @GetMapping("/user")
  public ResponseEntity<UserResponseDto> getUser(@RequestParam("id") Long id) {
    UserResponseDto userResponseDto = userService.getUser(id);
    return ResponseEntity.ok(userResponseDto);
  }

  @PutMapping("/user/{id}")
  public ResponseEntity<UserResponseDto> editUser(@PathVariable("id") Long id,
      @RequestBody UserRequestDto userRequestDto) {

    UserResponseDto userResponseDto = userService.editUser(id, userRequestDto);
    return ResponseEntity.ok(userResponseDto);
  }

  @DeleteMapping("/user/{id}")
  public ResponseEntity<Object> deleteUser(@PathVariable("id") Long id) {
    userService.deleteUser(id);
    return ResponseEntity.ok().build();
  }

}
