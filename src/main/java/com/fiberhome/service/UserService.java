package com.fiberhome.service;

import com.fiberhome.model.User;

import java.util.List;

/**
 * UserService
 */
public interface UserService {
    /**
     * createUser
     *
     * @param user user
     */
    boolean createUser(User user);

    /**
     *
     * @return List<User>
     */
    List<User> getUserList();

    /**
     * delete user by id
     * @param userId
     * @return int
     */
    int deleteUserById(int userId);

    /**
     * update user by id
     * @param user
     * @return
     */
    boolean updateUser(User user);
}
