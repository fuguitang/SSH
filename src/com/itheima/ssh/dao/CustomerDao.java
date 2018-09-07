package com.itheima.ssh.dao;

import com.itheima.ssh.domain.Customer;

/**
 * @ClassName CustomerDao
 * @Description TODO
 * @Author tangfugui
 * @Date 2018/8/30 16:34
 **/
public interface CustomerDao {

    /**
     * 功能描述: 新增客户
     * @auther: tangfugui
     * @date: 2018/9/6 16:44
     * @param: [customer]
     * @return: void
     */
    void save(Customer customer);
}
