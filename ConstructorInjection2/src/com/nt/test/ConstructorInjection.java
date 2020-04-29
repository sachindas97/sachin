package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator1;

public class ConstructorInjection {

	public static void main(String[] args) {
		
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator1 generator=null;
		res=new FileSystemResource("src/com/nt/config/applicationContext.xml");
		factory=new XmlBeanFactory(res);
		Object obj=factory.getBean("wmg");
		generator=(WishMessageGenerator1)obj;
		System.out.println("Result is:::"+generator.generateWishMessage("Ajay"));
		

	}

}
