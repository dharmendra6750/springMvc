package com.fiberhome.service;

import com.fiberhome.configure.MyBatisConfiguration;
import com.fiberhome.dao.UserMapper;
import com.fiberhome.model.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * UserService
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    /**
     * create new User
     *
     * @param user user
     */
    @Override
    public boolean createUser(User user) {
        SqlSession sqlSession = MyBatisConfiguration.fetchSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        boolean user1 = userMapper.createUser(user);
        sqlSession.commit();
        sqlSession.close();
        return user1;
    }

    /**
     * getting list of user from db and then return to controller
     *
     * @return List<User>
     */
    @Override
    public List<User> getUserList() {
        SqlSession sqlSession = MyBatisConfiguration.fetchSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getUserList();
        sqlSession.commit();
        sqlSession.close();
        return userList;
    }

    /**
     * delete user by id i
     *
     * @param userId
     * @return int
     */
    @Override
    public int deleteUserById(int userId) {
        SqlSession sqlSession = MyBatisConfiguration.fetchSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int id = userMapper.deleteUserById(userId);
        sqlSession.commit();
        sqlSession.close();
        return id;
    }

    /**
     * update user by userId
     *
     * @param user
     * @return string
     */
    @Override
    public boolean updateUser(User user) {
        SqlSession sqlSession = MyBatisConfiguration.fetchSqlSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        boolean flag = userMapper.updateUser(user);
        sqlSession.commit();
        sqlSession.close();
        return flag;
    }

}
