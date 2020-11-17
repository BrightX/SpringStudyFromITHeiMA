package com.bright.service.impl;

import com.bright.dao.AccountDao;
import com.bright.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 徐亮亮
 * @since 2020/11/16
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void transfer(String outMan, String inMain, double money) {
        accountDao.out(outMan, money);
        // int a = 1 / 0;
        accountDao.in(inMain, money);
    }
}
