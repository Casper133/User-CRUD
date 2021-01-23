package com.casper.usercrud.mapper;

import com.casper.usercrud.dto.UserRequestDto;
import com.casper.usercrud.dto.UserResponseDto;
import com.casper.usercrud.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

  @Mapping(target = "id", ignore = true)
  User mapRequestDtoToUser(UserRequestDto userRequestDto);

  UserResponseDto mapUserToResponseDto(User user);

}
