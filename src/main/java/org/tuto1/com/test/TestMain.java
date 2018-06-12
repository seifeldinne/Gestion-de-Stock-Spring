package org.tuto1.com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.tuto1.com.dao.IclientDao;
import org.tuto1.com.dao.imp.FlikerDaoImp;
import org.tuto1.com.entites.Client;

public class TestMain {

	public static void main(String[] args) {
		
	FlikerDaoImp flik = new FlikerDaoImp();
	
	//flik.auth();
	try {
		
		InputStream input = new FileInputStream("C:\\img\\img1.png");
		String url =flik.savePhoto(input, "img1");
		
	} catch (Exception e) {
		System.out.println("ligne3");
		e.getMessage();
		e.getStackTrace();
		
		}
	
	}

}
