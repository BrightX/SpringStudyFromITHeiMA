package com.bright.test;

import com.bright.config.SpringConfiguration;
import com.bright.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author 徐亮亮
 * @since 2020/11/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
// @ContextConfiguration("classpath:applicationContext.xml")
public class SpringJunitTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private UserService userService;

    @Test
    public void test01() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);
    }

    @Test
    public void test02() {
        userService.save();
    }
}
