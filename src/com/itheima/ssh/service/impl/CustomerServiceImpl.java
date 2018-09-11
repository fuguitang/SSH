package com.itheima.ssh.service.impl;

import com.itheima.ssh.dao.impl.CustomerDaoImpl;
import com.itheima.ssh.domain.Customer;
import com.itheima.ssh.service.CustomerService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName CustomerServiceImpl
 * @Description TODO
 * @Author tangfugui
 * @Date 2018/8/30 16:28
 **/
@Transactional
public class CustomerServiceImpl implements CustomerService {

    //注入Dao;
    private CustomerDaoImpl customerDao;

    public void setCustomerDao(CustomerDaoImpl customerDao) {
        this.customerDao = customerDao;
    }

    /**
     * 功能描述: 新增客户
     * @auther: tangfugui
     * @date: 2018/9/6 16:44
     * @param: [customer]
     * @return: void
     */
    @Override
    public void save(Customer customer) {
        System.out.println("CustomerServiceImpl执行。。。。。。");
        customerDao.save(customer);
    }

    /**
     * 功能描述: 修改客户
     * @auther: tangfugui
     * @date: 2018/9/11 14:05
     * @param: [customer]
     * @return: void
     */
    @Override
    public void update(Customer customer) {
        customerDao.update(customer);
    }

    /**
     * 功能描述: 删除客户
     * @auther: tangfugui
     * @date: 2018/9/11 14:05
     * @param: [cust_id]
     * @return: void
     */
    @Override
    public void delete(Long cust_id) {
        customerDao.delete(cust_id);
    }

    /**
     * 功能描述: 查询客户列表
     * @auther: tangfugui
     * @date: 2018/9/11 14:13
     * @param: []
     * @return: void
     */
    @Override
    public List<Customer> find() {
        List<Customer> list = customerDao.find();
        return list;
    }
}
