/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dao.custom;

import pos.layerd.dao.SuperDao;
import pos.layerd.entity.CustomerEntity;

/**
 *
 * @author anjanathrishakya
 */
public interface CustomerDao extends SuperDao{
    Boolean addCustomer(CustomerEntity customerEntity) throws Exception;
}
