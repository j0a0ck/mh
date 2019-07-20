package com.pgyer.utils;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;

public class CodeUtil {
       
	 /**
	  *验证码的检验 
	  * **/
	/* 两者区别： 
		 ①getParameter()获取的是客户端设置的数据。 
		 getAttribute()获取的是服务器设置的数据。 
		 ②getParameter()永远返回字符串 
		 getAttribute()返回值是任意类型*/
	 public static boolean checkVerifyCode(HttpServletRequest request){
		 //这里用getAttribute获取另一个Servelt生成的参数
		 String verifyCodeExpected =(String)request.getSession()
				 .getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		 String verifyCodeActual = HttpServletRequestUtil.getString(request, "verifyCodeActual");
		 //空或者不等返回false
		 if(verifyCodeActual==null|| !verifyCodeActual.equals(verifyCodeExpected)){
			 return false;
		 }
		 return true ;
	 }
	 
	 
	  /**
	   * 生成二维码的图片流
	   * ***/
	 public static BitMatrix generateQRCodeStream(String context,HttpServletResponse response) {
		    //给响应添加头部信息，主要是告诉浏览器返回的是图片流
		 response.setHeader("Cache-Control", "no-store");
		 response.setHeader("Pragma", "no-cache");
		 response.setDateHeader("Expires", 0);
		 response.setContentType("image/png");
		 
		 //设置图片的文字编码以及内边框距
		 Map<EncodeHintType,Object>hints = new HashMap<EncodeHintType,Object>();
		 hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		 hints.put(EncodeHintType.MARGIN, 0);
		 //创建二维码对象
		 BitMatrix bitMatrix;
		 try {
			     //参数的顺序为====》 编码内容，编码类型，生图片宽度，生成图片高度，设置参数
			bitMatrix= new MultiFormatWriter().encode(context, BarcodeFormat.QR_CODE, 300, 300,hints);
		} catch (WriterException e) {
			e.printStackTrace();
			return null ;
		}
		 return bitMatrix;
	 }
	 
}
