
package com.fiberhome.dao;

import com.fiberhome.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This class contains UserMapper
 */
@Repository
public interface UserMapper {


    /**
     * this query for user ceation
     */
    final String insert = "INSERT INTO userdetails (userId, userName, emailId, country) " +
            "VALUES (#{userId}, #{userName}, #{emailId}, #{country})";

    /**
     * this query for get list of user
     */
    public static final String QRY_GetAllUserList = "select * from userdetails";

    /**
     * delete query user by id
     */
    public static final String delete_user_by_id = "DELETE FROM userdetails WHERE userId =#{userId}";

    /**
     * update query by id
     */
    public static final String update_user_by_id = "UPDATE userdetails SET userName=#{userName}, emailId =#{emailId},country=#{country} " +
            "WHERE userId =#{userId}";

    /**
     * insert user
     *
     * @param user
     */
    @Insert(insert)
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    public boolean createUser(User user);

    /**
     * get user list
     */
    @Select(QRY_GetAllUserList)
    List<User> getUserList();

    /**
     * delete user by id
     *
     * @param userId
     * @return int
     */
    @Delete(delete_user_by_id)
    int deleteUserById(int userId);

    /**
     * update user by id
     *
     * @param user
     * @return String
     */
    @Update(update_user_by_id)
    boolean updateUser(User user);
}
