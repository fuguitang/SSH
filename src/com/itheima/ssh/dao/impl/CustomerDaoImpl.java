package com.itheima.ssh.dao.impl;

import com.itheima.ssh.dao.CustomerDao;
import com.itheima.ssh.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * @ClassName CustomerDaoImpl
 * @Description TODO
 * @Author tangfugui
 * @Date 2018/8/30 16:35
 **/
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

    /**
     * 功能描述: 新增客户
     * @auther: tangfugui
     * @date: 2018/9/6 16:45
     * @param: [customer]
     * @return: void
     */
    @Override
    public void save(Customer customer) {
        System.out.println("CustomerDao执行。。。。。");
        //获取继承的sessionFactory
        this.getHibernateTemplate().save(customer);
    }
}
