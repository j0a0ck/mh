package com.pgyer.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;


import com.pgyer.dto.ImageHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;



import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImageUtil {
	 //日志打印 
	 static Logger logger = LoggerFactory.getLogger(ImageUtil.class);
	
	 //返回主要路径（工程的绝对路径）
     public static String basePath = PathUtil.getImgBasePath();
     //日期格式
     public static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
     public static final Random r= new Random();
     
     /**处理缩略图，并返回新生成图片的相对值路径
      * 开始是try,catch的，最后我改成抛异常
      * **/
	 public static String generateThumbnail(ImageHolder imageHolder, String targetAddr) throws IOException{//文件-目的地
		 //获取不重复的随机名
		 String realFileName = getRandomFileName();
		 //获取文件的扩展名如：.png,.jpg
		 String extension = getFileExtension(imageHolder.getImageName());
		 //如果目标路径不存在，则自动创建
		 makeDirPath(targetAddr);
		 //获取文件存储的相对路径======》》》》保存到数据库的路径
		 String relativeAddr = targetAddr+realFileName+extension;
		 logger.info("==============返回的相对路径："+relativeAddr);
		 
		 //获取文件要保存到的目标路径============》》》》》图片上传后真实保存到电脑上的位置
		 File dest = new File(PathUtil.getImgBasePath()+relativeAddr);
		 logger.info("==============返回的绝对路径："+dest);
		 
		     //调用Thumbnails生成带有水印的图片并保存到电脑上的位置
			 Thumbnails.of(imageHolder.getImage())//图片文件
			 .size(200, 200)//新生图片大小
			           //生成水印的位置                                                          水印图片所在位置                                                                                      透明度
			 .watermark(Positions.BOTTOM_RIGHT,ImageIO.read(new File(basePath+"/yellow.jpg")),0.25f)//添加水印
			 .outputQuality(0.9f)//压缩为原来的多少
			 .toFile(dest);//输出地址
		 
		return relativeAddr;//返回保存文件的路径===>获取文件存储的相对路径
	 }
	 
	 /**处理正常图，并返回新生成图片的相对值路径
	  * **/
	 public static String generateNormalImg(ImageHolder imageHolder,String targetAddr){//文件-目的地
		 //获取不重复的随机名
		 String realFileName = getRandomFileName();
		 //获取文件的扩展名如：.png,.jpg
		 String extension = getFileExtension(imageHolder.getImageName());
		 //如果目标路径不存在，则自动创建
		 makeDirPath(targetAddr);
		 //获取文件存储的相对路径
		 String relativeAddr = targetAddr+realFileName+extension;
		 logger.info("==============返回的相对路径："+relativeAddr);
		 
		 //获取文件要保存到的目标路径
		 File dest = new File(PathUtil.getImgBasePath()+relativeAddr);
		 logger.info("==============返回的绝对路径："+dest);
		 //调用Thumbnails生成带有水印的图片
		 try {
			Thumbnails.of(imageHolder.getImage())//图片文件
			 .size(337, 640)//新生图片大小
			 //生成水印的位置                                                          水印图片所在位置                                                                                      透明度
			 .watermark(Positions.BOTTOM_RIGHT,ImageIO.read(new File(basePath+"/yellow.jpg")),0.25f)//添加水印
			 .outputQuality(0.9f)//压缩为原来的多少
			 .toFile(dest);
		} catch (IOException e) {
			  throw new RuntimeException("商品详情图片处理失败"+e.getMessage());
		}//输出地址
		 
		 return relativeAddr;//返回保存文件的路径===>获取文件存储的相对路径
	 }
	 
	 public static String generateThumbnail(CommonsMultipartFile thumbnail, String targetAddr) {
			String realFileName = FileUtil.getRandomFileName();
			String extension = getFileExtension(thumbnail);
			makeDirPath(targetAddr);
			String relativeAddr = targetAddr + realFileName + extension;
			File dest = new File(FileUtil.getImgBasePath() + relativeAddr);
			try {
				Thumbnails.of(thumbnail.getInputStream()).size(200, 200).outputQuality(0.25f).toFile(dest);
			} catch (IOException e) {
				throw new RuntimeException("创建缩略图失败：" + e.toString());
			}
			return relativeAddr;
		}
	 
	 private static String getFileExtension(CommonsMultipartFile cFile) {
			String originalFileName = cFile.getOriginalFilename();
			return originalFileName.substring(originalFileName.lastIndexOf("."));
		}
	 
	 
	 
	 
	 /**创建目标路径所涉及到的目录，即/home/work/roy/xx.jpg,
	 那么home work roy 这三个文件夹都的自动创建
	 **/
	 private static void makeDirPath(String targetAddr){
		 String realFileParentPath = PathUtil.getImgBasePath()+ targetAddr;
		 File dirPath = new File(realFileParentPath);
		 if(!dirPath.exists()){
			 dirPath.mkdirs();
		 }
	 }
	 
	 
	 /**获取输入文件流的扩展名**/
	 private static String getFileExtension(String fileName){
		 return fileName.substring(fileName.lastIndexOf("."));
	 }
	 
	 
	 /**
	  * 生成随机文件名，当前年月日小时分钟秒钟+五位随机数
	  * **/
	 public static String getRandomFileName(){
		 //获取随机的五位数
		 int rannum = r.nextInt(89999)+10000;
		 String nowTimeStr = sDateFormat.format(new Date());
		 return nowTimeStr+rannum ;
	 }
	
	
	   //主方法的一个测试
	   public static void main(String[] args) throws IOException {
		Thumbnails.of(new File("E:/upload/2.jpg"))
		.size(200, 200)
		.watermark(Positions.BOTTOM_RIGHT,ImageIO.read(new File(basePath+"/yellow.jpg")),0.25f)
		.outputQuality(0.8f)
		.toFile("E:/upload/21new.jpg");
		;
	}  
	   
	   /**
	    * stroePath是文件的路径还是目录的路径
	    * 如果stroePath是文件路径侧删除改文件
	    * 如果stroePath是目录路径侧删除目录下的所有文件
	    * **/
      public static void deleteFileOrPath(String storePath){
    	    File fileOrPath = new File(PathUtil.getImgBasePath()+storePath);
    	    if(fileOrPath.exists()){
    	    	  if(fileOrPath.isDirectory()){
    	    		 File[] files =  fileOrPath.listFiles();
    	    	       for(int i = 0 ;i<files.length;i++){
    	    	    	   files[i].delete();
    	    	       }
    	    	  }else{
    	    		  fileOrPath.delete();
    	    	  }
    	    }
      }	   
	   
}
