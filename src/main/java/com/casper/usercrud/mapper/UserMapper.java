package com.casper.usercrud.mapper;

import com.casper.usercrud.dto.UserRequestDto;
import com.casper.usercrud.dto.UserResponseDto;
import com.casper.usercrud.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User mapRequestDtoToUser(UserRequestDto userRequestDto);

    UserResponseDto mapUserToResponseDto(User user);

}
