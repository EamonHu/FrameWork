package cn.eamon.service;

import cn.eamon.dto.Account;

import java.util.List;

/**
 * @Author: Eamon
 * @Description:
 * @Date: 2020/12/29 15:55
 */
public interface IAccountService {
    /**
     * 模拟保存账户
     */
    void saveAccount(Account account);

    /**
     * 更新账户
     * @param account 更新账户信息
     */
    void updateAccount(Account account);

    /**
     * 删除账户
     * @param accountId 账户ID
     */
    void deleteAccount(Integer accountId);

    /**
     * 根据用户ID查询账号
     * @param accountId 用户id
     * @return 账户详细信息
     */
    Account findAccountById(Integer accountId);

    /**
     * 查询所有账号
     * @return 账号信息列表
     */
    List<Account> findAllAccount();

    /**
     * 转账
     * @param sourceName 转出人姓名
     * @param targetName 接收人姓名
     * @param money 转账金额
     */
    void transfer(String sourceName, String targetName, Float money);
}
