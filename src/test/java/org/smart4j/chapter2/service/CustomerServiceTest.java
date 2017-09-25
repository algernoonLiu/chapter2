package org.smart4j.chapter2.service;

import org.junit.Before;
import org.junit.Test;
import org.smart4j.chapter2.helper.DatabaseHelper;
import org.smart4j.chapter2.model.Customer;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by roadoor on 2017/9/22.
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        this.customerService = new CustomerService();
    }

    @Before
    public void init() throws IOException {
        String file = "init/customer_init.sql";
        DatabaseHelper.executeSQLFile(file);
    }

    @Test
    public void getCustomerListTest() {
        List<Customer> customerList = customerService.getCustomerList();
        assertEquals(2, customerList.size());
    }

    @Test
    public void getCustomerTest() throws Exception {
        Customer customer = customerService.getCustomer(1L);
        assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "Customer100");
        fieldMap.put("contact", "Tom");
        fieldMap.put("telephone", "18000000000");
        fieldMap.put("email", "tom@163.com");
        fieldMap.put("remark", "Tom is a good guy!");
        boolean result = customerService.createCustomer(fieldMap);
        assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        Map<String, Object> fieldMap = new HashMap<String, Object>();
        fieldMap.put("name", "Customer50");
        fieldMap.put("contact", "Tom");
        fieldMap.put("telephone", "18000000000");
        fieldMap.put("email", "tom@163.com");
        fieldMap.put("remark", "Tom is a good guy!");
        boolean result = customerService.updateCustomer(3L, fieldMap);
        assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        boolean result = customerService.deleteCustomer(3L);
        assertTrue(result);
    }
}