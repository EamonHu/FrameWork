package cn.eamon.dao;

import cn.eamon.dto.Account;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/29 15:57
 */
public interface AccountDao {
    /**
     * 保存账户
     * @param account 账户类
     */
    void saveAccount(Account account);

    /**
     * 更新账户
     * @param account 账户类
     */
    void update(Account account);

    /**
     * 删除账户
     * @param accountId 用户ID
     */
    void delete(Integer accountId);

    /**
     * 根据用户ID查找账户
     * @param accountId 用户ID
     * @return 账号详细信息
     */
    Account findById(Integer accountId);

    /**
     * 查询所有用户
     * @return 账号列表
     */
    List<Account> findAll();


    /**
     * 根据用户名查找账号信息
     * @return 账号信息
     */
    Account findByName(String userName);
}
