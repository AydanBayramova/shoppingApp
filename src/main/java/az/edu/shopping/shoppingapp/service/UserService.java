package az.edu.shopping.shoppingapp.service;

import az.edu.shopping.shoppingapp.model.dto.UserRequest;

import java.util.List;

public interface UserService {

    UserRequest getById(Long id);

    List<UserRequest> getAllUsers();

    UserRequest deleteUserById(Long id);

    UserRequest getUserByUsername(String username);

    UserRequest updateUser(Long id,UserRequest userRequest);
}
