package com.smart.dao;

import com.smart.entity.User;

public interface UserDao {


    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);






    int getMatchCount(String userName,String password);

    User findUserByUserName(String userName);

    int updateLoginInfo(User user);


}
