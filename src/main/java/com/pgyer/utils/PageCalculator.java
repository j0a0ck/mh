package com.pgyer.utils;

public class PageCalculator {
      /**
       * 第一次进来时，为0或者值少于0就认为返回第一页
       * 当选择页后，(pageIndex-1)*pageSize通过计算得出从第几条开始取
       * **/
	  public static int calculateRowIndex(int pageIndex,int pageSize){
		  return (pageIndex>0)?(pageIndex-1)*pageSize:0;
	  }
}
