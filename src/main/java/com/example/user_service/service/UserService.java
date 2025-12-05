package com.example.user_service.service;


import com.example.user_service.dto.UserRequest;
import com.example.user_service.dto.UserResponse;

import java.util.List;
public interface UserService {
    UserResponse createUser(UserRequest userRequest);
    UserResponse getUserById(Long id);
    UserResponse getUserByEmail(String email);
    List<UserResponse> getAllUsers();
    UserResponse updateUser(Long id, UserRequest userRequest);
    void deleteUser(Long id);
}
