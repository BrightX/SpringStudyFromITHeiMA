package com.bright.text;

import com.bright.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author 徐亮亮
 * @since 2020/11/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dataSource.xml")
public class JdbcTemplateCRUDTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testUpdate() {
        jdbcTemplate.update("update account set money=? where name=?", 232, "Tom");
    }

    @Test
    public void testDelete() {
        jdbcTemplate.update("delete from account where name=?", "Maven");
    }

    @Test
    public void testQueryAll() {
        List<Account> query = jdbcTemplate.query("select name, money from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(query);
    }

    @Test
    public void testQueryOne(){
        Account account = jdbcTemplate.queryForObject("select name, money from account where name=?", new BeanPropertyRowMapper<>(Account.class), "Tom");
        System.out.println(account);
    }

    @Test
    public void testQueryCount() {
        Long aLong = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        System.out.println(aLong);
    }
}
