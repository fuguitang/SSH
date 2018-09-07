package com.itheima.ssh.web.action;

import com.itheima.ssh.domain.Customer;
import com.itheima.ssh.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @ClassName CustomerAction
 * @Description TODO
 * @Author tangfugui
 * @Date 2018/8/30 16:21
 **/
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    //模型驱动使用的对象
    private Customer customer = new Customer();

    //第一种方式：注入CustomerService：
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    /**
     * 功能描述:自动生成的模型驱动使用的对象的方法
     * @auther: tangfugui
     * @date: 2018/8/30 16:22
     * @param: []
     * @return: com.itheima.ssh.domain.Customer
     */
    @Override
    public Customer getModel() {
        return customer;
    }

    /**
     * 功能描述: 新增客户
     * @auther: tangfugui
     * @date: 2018/9/6 16:44
     * @param: []
     * @return: java.lang.String
     */
    public String save(){
        //如果web层没有使用struts2，获取业务层的类必须如下进行编写：
//        WebApplicationContext application = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
//        CustomerService customerService = (CustomerService) application.getBean("customerService");
        System.out.println("CustomerAction执行。。。。。。");
        customerService.save(customer);
        return NONE;
    }
}
