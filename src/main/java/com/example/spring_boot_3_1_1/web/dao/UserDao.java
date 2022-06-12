package com.example.spring_boot_3_1_1.web.dao;


import com.example.spring_boot_3_1_1.web.model.User;
import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void removeUserById(long id);

    void updateUser(User user);

    List<User> getAllUsers();

    User getUserById(long id);
}
