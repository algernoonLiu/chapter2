package org.smart4j.chapter2.service;

;import org.smart4j.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * http://www.otvcloud.com/
 * <p>
 * <p>
 * 提供客户数据服务
 * </p>
 *
 * @author roadoor
 * @create 2017-09-22 16:23.
 */
public class CustomerService {

    /**
     * 获取客户列表
     * @return
     */
    public List<Customer> getCustomerList() {

        // TODO
        return null;
    }

    /**
     * 获取客户
     * @param id 客户ID
     * @return
     */
    public Customer getCustomer(Integer id) {

        // TODO
        return null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {

        // TODO
        return Boolean.FALSE;
    }

    /**
     * 修改客户
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(Map<String, Object> fieldMap) {

        // TODO
        return Boolean.FALSE;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(Integer id) {

        // TODO
        return Boolean.FALSE;
    }

}
