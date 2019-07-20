package com.pgyer.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PathUtil {
	//获取系统的分隔符
   public static String seperator =System.getProperty("file.separator");
   
   private static String winPath;
   private static String linuxPath;
   private static String shopPath;
   
   @Value("${win.base.path}")
   public  void setWinPath(String winPath) {
	PathUtil.winPath = winPath;
   }
   
   @Value("${lin.base.path}")
	public  void setLinuxPath(String linuxPath) {
		PathUtil.linuxPath = linuxPath;
	}
   
   @Value("${shop.relevant.path}")
	public  void setShopPath(String shopPath) {
		PathUtil.shopPath = shopPath;
	}

//获取图片的根路径
   public static String getImgBasePath(){//根据操作系统获取根路径
	   //获取操作系统的名称
	   String os = System.getProperty("os.name");
	   String basePath="";
	   if(os.toLowerCase().startsWith("win")){
      		 //  basePath="D:/projectdev/image";
		   basePath=winPath;
	   }else{
		   
		 //  basePath="/home/shopApp/image";
		   basePath=linuxPath;
	   }
	   basePath= basePath.replace("/", seperator);
	   
	   return basePath ;
   }
   
   /**
    * 每间店铺图片路径
    * ***/
   public static String getShopImagePath(long shopId){
	  // String imagePath="/upload/item/shop/"+shopId+"/";
	   String imagePath=shopPath+shopId+"/";
	   return imagePath.replace("/", seperator);
   }
}
