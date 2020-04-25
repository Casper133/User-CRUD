package com.casper.usercrud.service;

import com.casper.usercrud.dto.UserRequestDto;
import com.casper.usercrud.dto.UserResponseDto;
import com.casper.usercrud.entity.User;
import com.casper.usercrud.mapper.UserMapper;
import com.casper.usercrud.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class DefaultUserService implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Override
    @Transactional
    public UserResponseDto createUser(UserRequestDto userRequestDto) {
        User user = userMapper.mapRequestDtoToUser(userRequestDto);
        user = userRepository.save(user);

        log.info("Creating new user with id {}", user.getId());

        return userMapper.mapUserToResponseDto(user);
    }

    @Override
    public UserResponseDto getUser(Long id) {
        User user = getUserById(id);

        log.info("Getting user with id {}", id);

        return userMapper.mapUserToResponseDto(user);
    }

    @Override
    @Transactional
    public UserResponseDto editUser(Long id, UserRequestDto userRequestDto) {
        User user = getUserById(id);

        user.setEmail(userRequestDto.getEmail());
        user.setUsername(userRequestDto.getUsername());
        user.setPassword(userRequestDto.getPassword());

        user = userRepository.save(user);

        log.info("Editing user with id {}", id);

        return userMapper.mapUserToResponseDto(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        User user = getUserById(id);

        log.info("Deleting user with id {}", id);

        userRepository.delete(user);
    }

    private User getUserById(Long id) {
        return userRepository.findById(id)
                             .orElseThrow(IllegalArgumentException::new);
    }

}
