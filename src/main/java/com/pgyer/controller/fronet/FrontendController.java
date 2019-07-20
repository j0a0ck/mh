package com.pgyer.controller.fronet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class FrontendController {
      /**
       * 首页展示
       * **/
	  @RequestMapping(value="/index",method=RequestMethod.GET)
	  private String index(){
		  return "frontend/index";
	  }

}
