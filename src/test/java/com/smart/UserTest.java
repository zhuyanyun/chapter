package com.smart;

import com.smart.dao.UserDao;
import com.smart.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description TODO
 * @Author zhuyanyun
 * @Date 2019-09-09 16:32
 * @Vertion 1.0
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void test(){
        User user = userDao.findUserByUserName("zyy");
        System.out.println(user);
    }

}
