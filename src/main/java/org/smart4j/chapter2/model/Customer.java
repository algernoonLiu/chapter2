package org.smart4j.chapter2.model;

;

/**
 * http://www.otvcloud.com/
 * <p>
 * <p>
 * 客户
 * </p>
 *
 * @author roadoor
 * @create 2017-09-22 15:48.
 */
public class Customer {

    /**
     * ID
     */
    private Integer id;
    /**
     * 客户名称
     */
    private String name;
    /**
     * 客户联系人
     */
    private String contact;
    /**
     * 联系电话
     */
    private String telephone;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 备注
     */
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
