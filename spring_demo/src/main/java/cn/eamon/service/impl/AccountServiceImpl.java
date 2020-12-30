package cn.eamon.service.impl;

import cn.eamon.dao.AccountDao;
import cn.eamon.dao.impl.AccountDaoImpl;
import cn.eamon.dto.Account;
import cn.eamon.service.IAccountService;

import java.util.Date;
import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/29 15:55
 */
public class AccountServiceImpl implements IAccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }


    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountDao.update(account);
    }

    public void deleteAccount(Integer accountId) {
        accountDao.delete(accountId);
    }

    public Account findAccountById(Integer accountId) {
        return accountDao.findById(accountId);
    }

    public List<Account> findAllAccount() {
        return accountDao.findAll();
    }

    public void transfer(String sourceName, String targetName, Float money) {
        // 根据姓名查询对应账户信息
        Account source = accountDao.findByName(sourceName);
        Account target = accountDao.findByName(targetName);
        // 转账
        source.setMoney(source.getMoney() - money);
        target.setMoney(target.getMoney()+money);
        // 更新账户
        accountDao.update(source);
        int i = 1 / 0;
        accountDao.update(target);

    }


}
