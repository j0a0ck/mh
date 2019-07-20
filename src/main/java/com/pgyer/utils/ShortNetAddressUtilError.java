package com.pgyer.utils;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
//没有编写成功
public class ShortNetAddressUtilError {
     
	  //Token = 3e093b68ca713ed0e4d1d98c0b9d0193
	
	 private static Logger log =  LoggerFactory.getLogger(ShortNetAddressUtilError.class);
	 
	 public static int TIMEOUT = 30*1000;
	 
	 public static String ENCODING="UTF-8";
	 
	 public static String TOKEN = "3e093b68ca713ed0e4d1d98c0b9d0193";
	 
	 /**
	  *根据传入的url，通过访问百度短视频的接口，将其转换成短的URL
	  * ***/
	 public static String getShoprtURL(String originURL) {
		 String params = "{\"url\":\""+ originURL + "\"}";
		   String tinyUrl = null ;
		   try {
		    //指定百度短连接的接口
			URL url = new URL("https://dwz.cn/admin/v2/create");
			//建立连接
	        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        //设置连接的参数
			//使用连接进行输出
	        connection.setDoOutput(true);
	        //使用连接进行输入
	        connection.setDoInput(true);
	        //不使用缓存
	        connection.setUseCaches(false);
	        //设置连接超时时间为30秒
	        connection.setConnectTimeout(TIMEOUT);
	        //设置请求模式为post
	        connection.setRequestMethod("POST");
	        //设置发送数据的格式
	        connection.setRequestProperty("Content-Type", "application/json");
	        //设置Token
	        connection.setRequestProperty("Token", TOKEN);
	        //设置post信息，这里为传入的原始URL
	        //String postData = URLEncoder.encode(originURL.toString(),"utf-8");
	        //设置原始的url
	        //connection.getOutputStream().write(("url="+postData).getBytes());
	        //连接百度短视频接口
	        connection.connect();
	        //获取返回的字符串
	        String responseStr = getResponseStr(connection);
	        log.info("response string:"+responseStr);
	        //在字符串里获取tinyurl,即短连接
	        tinyUrl = getValueByKey(responseStr,"tinyurl");
	        log.info("tinyrul:"+tinyUrl);
	        //关闭连接
	        connection.disconnect();
		} catch (MalformedURLException e) {
			log.error("getshortURL error:"+e.toString());
		}catch (IOException e) {
			log.error("getshortURL error:"+e.toString());
		}
		   return tinyUrl ;
	 }
	 
	 /**
	  * 通过httpConnection获取返回的字符串
	 * @throws IOException 
	  * **/
	 private static String getResponseStr(HttpURLConnection connection ) throws IOException {
		  StringBuffer result = new StringBuffer();
		  //从连接中获取http状态码
		  int responseCode = connection.getResponseCode();
		    //如果返回的状态码是ok的
		  if(responseCode==HttpURLConnection.HTTP_OK) {
			  //如果返回的状态码是ok的，那么取出连接的输入流
			  InputStream in =   connection.getInputStream();
			  BufferedReader read = new  BufferedReader(new InputStreamReader(in,ENCODING));
			  String inputLine = "";
			  while((inputLine =read.readLine())!=null) {
				  //将消息逐行读入结果中
				  result.append(inputLine);
			  }
		  }
		    //将结果转换成String并返回
		 return String.valueOf(result) ;
	 }
	 
	 
	 /**
	  * JSON依据传入的Key获取value
	  * 
	  * ***/
	 private static String getValueByKey(String replyText ,String key) {
		 ObjectMapper mapper = new ObjectMapper();
		 //定义json节点
		 JsonNode node;
		 String targetValue = null ;
		 try {
			 //把调用返回消息串转换成json对象
			node = mapper.readTree(replyText);
			//依据key从json对象中获取对应的值
			targetValue = node.get(key).asText();
		} catch (IOException e) {
			log.error("getVlaueBykey error:"+e.toString());
		}
		 
		 return targetValue ;
	 }
	 
	 /**
	  * 百度短链接接口
	  * **/
	  public static void main(String[] args) {
		  getShoprtURL("https://www.cnblogs.com/lgqboke/p/6873734.html");
	} 
}
