package com.rental.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class DateTimeConverter extends StrutsTypeConverter   {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		try {
			return sdFormat.parseObject(arg1[0]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
