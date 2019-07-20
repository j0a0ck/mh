package com.pgyer.utils;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/***
 * <context:property-placeholder/>就是PropertyPlaceholderConfigurer
 * 
 * **/
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
  
	     //需要加密字段数组
	private String [] encryptPropNames={"jdbc.username","jdbc.password"};
	
	/**
	 * 对关键的属性进行转换
	 * 
	 * 自定义编写的类继承PropertyPlaceholderConfigurer而来 的convertProperty方法
	 * **/
	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		if(isEncryptProp(propertyName)){
			//对以加密的字段进行解密工作
			String decryptValue =DESUtil.getDecryptString(propertyValue);
			return decryptValue ;
		}else{
			return propertyValue ;
		}
	}
	
	
	/**
	 * 该属性是否已加密
	 * **/
	 boolean isEncryptProp(String propertyName){
		 //若等于需要加密的field,则进行加密
		 for(String epn :encryptPropNames){
			if(epn.equals(propertyName))
				return true;
		 }
		 return false ;
	 }
}
