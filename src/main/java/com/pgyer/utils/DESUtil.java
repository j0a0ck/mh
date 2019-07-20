package com.pgyer.utils;

import java.security.Key;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/***
 * DES是一种对称加密算法，所谓对称加密算法即：加密和解密使用同一套密钥
 * 
 * **/
@SuppressWarnings("restriction")
public class DESUtil {
 
      private static Key key;
      //设置密钥key
      private static String KEY_STR="myKey";
      private static String CHARSETNAME="UTF-8";
      private static String ALGORITHM="DES";
      
      static{
    	   try{
    		   //生成DES算法对象
    		   KeyGenerator generator = KeyGenerator.getInstance(ALGORITHM);
    		   
    		   //运用SHA1安全策略
    		   SecureRandom secureRandom = SecureRandom.getInstance("SHA1PRNG");
    		   
    		   //设置上密钥种子
    		   secureRandom.setSeed(KEY_STR.getBytes());
    		   
    		   //初始化基于SHA1的算法对象
    		   generator.init(secureRandom);
    		   
    		   //生成密钥对象
    		    key = generator.generateKey();
    		   generator = null ;
    		   
    	   }catch(Exception e){
    		   throw new RuntimeException(e);
    	   }
      }
      
      /**
       * 把数据加密
       * **/
      public static String getEncryptString(String str){
    	  //基于BASE64编码，接收byte[]并转换成String
    	   
		BASE64Encoder base64encoder = new BASE64Encoder();
    	   try{
    		   //按utf-8编码
    		   byte [] bytes =str.getBytes(CHARSETNAME);//定义编码格式
    		   //获取加密对象
    		   Cipher cipher = Cipher.getInstance(ALGORITHM);//要使用那种加密方式==》》返回对应的加密对象
    		   
    		   //初始化密码信息
    		   cipher.init(Cipher.ENCRYPT_MODE, key);//传入第一参数表使用哪种加密模式，第二个参数是密钥是什么
    		   
    		   //加密
    		   byte [] doFinal = cipher.doFinal(bytes);//调用doFinal把字节数组进行加密
    		   //byte[]to encode好的String并返回
    		   return base64encoder.encode(doFinal);//把加密好的字节数组通过base64encoder调用encode方法返回字符串
    		          
    	   }catch(Exception e){
    		   throw new RuntimeException(e);
    	   }
      }
      
      
      
      /**
       * 获取解密之后的信息
       * **/
	   public static String getDecryptString(String str){//解码
		   //基于BASE64编码，接收byte[]并转换成String
		   BASE64Decoder base64decoder = new BASE64Decoder();
		   try{
			  //将字符串decode成byte[]
			    byte[] bytes =  base64decoder.decodeBuffer(str);//调用base64decoder的decodeBuffer把字符串转换为字节数组
			  
			   //获取解密对象
			    Cipher cipher = Cipher.getInstance(ALGORITHM);//使用那种加密对象
			    
			   //初始化解密信息
			    cipher.init(Cipher.DECRYPT_MODE, key);//获取解密模式，密钥
			   
			    //解密
			    byte [] doFinal = cipher.doFinal(bytes);
			    
			    //返回解密之后的信息
			    return new String(doFinal,CHARSETNAME);//返回字符并定义好字符集
			    
		   }catch(Exception e){
			   throw new RuntimeException(e);
		   }
	   }
	   
	   
	   public static void main(String[] args) {
		   String encryptString = getEncryptString("root");
		   System.out.println(encryptString);
		   String decryptString = getDecryptString("QAHlVoUc49w=");
		   System.out.println(decryptString);
	}
}
