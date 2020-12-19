package com.fiberhome.controller;


import com.fiberhome.configure.ResponseBean;
import com.fiberhome.model.User;
import com.fiberhome.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * UserController
 */
@RestController
public class UserController {

    /**
     * create bean of userService class
     */
    @Autowired
    UserService userService;

    /**
     * here create new user details
     *
     * @param user user
     */
    @PostMapping(value = "/createUser")
    public ResponseBean createUser(@RequestBody User user) {

        ResponseBean responseBean = new ResponseBean();
        responseBean.setData(userService.createUser(user));
        return responseBean;

    }

    /**
     * here getting all user list
     *
     * @return List<User>
     */
    @GetMapping(value = "/getAllUserList")
    public ResponseBean getAllUserList() {
        ResponseBean responseBean = new ResponseBean();
        responseBean.setData(userService.getUserList());
       
        return responseBean;
    }

    /**
     * delete user by id
     *
     * @param userId
     * @return int
     */
    @DeleteMapping(value = "/deleteUserById")
    public ResponseBean deleteUserById(@RequestParam int userId) {
        ResponseBean responseBean = new ResponseBean();
        responseBean.setData(userService.deleteUserById(userId));
        return responseBean;
    }

    /**
     * update user details by id
     *
     * @param user
     * @return String
     */
    @PutMapping(value = "/updateUserById")
    public ResponseBean updateUserById(@RequestBody User user) {
        ResponseBean responseBean = new ResponseBean();
        responseBean.setData(userService.updateUser(user));
        return responseBean;
    }


}
