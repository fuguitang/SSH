package com.itheima.ssh.service;

import com.itheima.ssh.domain.Customer;

import java.util.List;

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

    /**
     * 功能描述: 修改客户
     * @auther: tangfugui
     * @date: 2018/9/11 14:03
     * @param:
     * @return:
     */
    void update(Customer customer);

    /**
     * 功能描述: 删除客户
     * @auther: tangfugui
     * @date: 2018/9/11 14:03
     * @param: [cust_id]
     * @return: void
     */
    void delete(Long cust_id);

    /**
     * 功能描述: 查询客户列表
     * @auther: tangfugui
     * @date: 2018/9/11 14:12
     * @param: []
     * @return: void
     */
    List<Customer> find();
}
