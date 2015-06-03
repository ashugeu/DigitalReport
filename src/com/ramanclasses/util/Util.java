package com.ramanclasses.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import com.ramanclasses.constants.Constants;

import com.ramanclasses.daoimpl.UserDetail;

public class Util {

	public static String covertToMd5(String password) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("MD5");
	    md.update(password.getBytes());

	    byte byteData[] = md.digest();

	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < byteData.length; i++)
	        sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		return sb.toString();

	}

	public static void setParameters(ModelAndView modelandview,UserDetail userdetail) {
		// TODO Auto-generated method stub
		modelandview.addObject(Constants.TITLE, "Raman Classes");
		modelandview.addObject(Constants.USERNAME,userdetail.getUsername());
		modelandview.addObject(Constants.ACTIVE_FROM,userdetail.getActiveFrom());
		
	}

	
}
