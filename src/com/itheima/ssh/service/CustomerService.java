package com.itheima.ssh.service;

import com.itheima.ssh.domain.Customer;

/**
 * @ClassName CustomerService
 * @Description TODO
 * @Author tangfugui
 * @Date 2018/9/4 16:09
 **/
public interface CustomerService {

    /**
     * 功能描述: 新增客户
     * @auther: tangfugui
     * @date: 2018/9/6 16:44
     * @param: [customer]
     * @return: void
     */
    void save(Customer customer);
}
