package com.rental.service.impl;

import java.util.List;

import com.rental.entity.Customer;
import com.rental.entity.User;
import com.rental.service.CustomerService;

public class CustomerServiceImpl extends BaseServiceImpl<Customer> implements CustomerService{

	
	public Customer getNameAndPwd(Customer customer) {
		String hql="select c from Customer c where cast_name=? and password=?";
		List list = baseDAO.findQuery(hql, customer.getCast_name(),customer.getPassword());
		if (list.size()==0) {
			return null;
		}
		return (Customer) list.get(0);
	}

}
