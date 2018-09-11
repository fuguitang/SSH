package com.itheima.ssh.dao.impl;

import com.itheima.ssh.dao.CustomerDao;
import com.itheima.ssh.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

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

    /**
     * 功能描述: 修改客户
     * @auther: tangfugui
     * @date: 2018/9/11 14:08
     * @param: [customer]
     * @return: void
     */
    @Override
    public void update(Customer customer) {
        this.getHibernateTemplate().update(customer);
    }

    /**
     * 功能描述: 删除客户
     * @auther: tangfugui
     * @date: 2018/9/11 14:08
     * @param: [cust_id]
     * @return: void
     */
    @Override
    public void delete(Long cust_id) {
        this.getHibernateTemplate().delete(cust_id);
    }

    /**
     * 功能描述: 查询客户列表
     * @auther: tangfugui
     * @date: 2018/9/11 14:14
     * @param: []
     * @return: void
     */
    @Override
    public List<Customer> find() {
        List<Customer> list = (List<Customer>) this.getHibernateTemplate().find("from Customer");
        return list;
    }
}
