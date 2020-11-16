package com.bright.text;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

/**
 * @author 徐亮亮
 * @since 2020/11/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:dataSource.xml")
public class JdbcTemplateTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test01() {
        // 测试 JdbcTemplate 开发步骤
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 设置数据源对象 知道数据库在哪
        jdbcTemplate.setDataSource(dataSource);
        // 执行操作
        int row = jdbcTemplate.update("insert into account(name, money) value (?, ?)", "Tomcat", 23.5);
        System.out.println(row);
    }

    @Test
    public void test02() {
        int row = jdbcTemplate.update("insert into account(name, money) value (?, ?)", "Maven", 89.5);
        System.out.println(row);
    }
}
