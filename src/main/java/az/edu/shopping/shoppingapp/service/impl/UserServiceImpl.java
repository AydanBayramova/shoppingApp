package az.edu.shopping.shoppingapp.service.impl;

import az.edu.shopping.shoppingapp.domain.entity.UserEntity;
import az.edu.shopping.shoppingapp.domain.repository.UserRepository;
import az.edu.shopping.shoppingapp.exception.UserNotFoundException;
import az.edu.shopping.shoppingapp.model.dto.UserRequest;
import az.edu.shopping.shoppingapp.model.mapper.UserMapper;
import az.edu.shopping.shoppingapp.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserMapper userMapper;


    @Override
    public UserRequest getById(Long id) {

        return userRepository.findById(id)
                .map(userMapper::userEntityToUserRequest)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
    }

    @Override
    public List<UserRequest> getAllUsers() {

        return userRepository.findAll().stream()
                .map(userMapper::userEntityToUserRequest)
                .collect(Collectors.toList());
    }

    @Override
    public UserRequest deleteUserById(Long id) {

        UserEntity userEntity = userRepository.findById(id).orElseThrow(() ->
                new UserNotFoundException("User not found for deleted"));
        UserRequest userRequest = userMapper.userEntityToUserRequest(userEntity);
        userRepository.delete(userEntity);
        return userRequest;

    }

    @Override
    public UserRequest getUserByUsername(String username) {

        UserEntity byUsername = userRepository.findByUsername(username);
        return userMapper.userEntityToUserRequest(byUsername);
    }

    @Override
    public UserRequest updateUser(Long id,UserRequest userRequest) {

        UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User not found"));

        userEntity.setEmail(userEntity.getEmail());
        userEntity.setAddress(userEntity.getAddress());
        userEntity.setUsername(userEntity.getUsername());
        userEntity.setProfileImageUrl(userEntity.getProfileImageUrl());

        return userMapper.userEntityToUserRequest(userEntity);
    }
}
