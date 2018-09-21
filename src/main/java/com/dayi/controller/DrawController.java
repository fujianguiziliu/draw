
package com.dayi.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dayi.entity.Article;
import com.dayi.entity.Msg;
import com.dayi.entity.Url;
import com.dayi.entity.Version;
import com.dayi.service.ArticleService;
import com.dayi.service.MsgService;
import com.dayi.service.UrlService;
import com.dayi.service.VersionService;
import com.google.gson.Gson;

@Controller
public class DrawController {
	
	@Autowired
	ArticleService articleService;
	@Autowired
	UrlService urlService;
	@Autowired
	VersionService versionService;
	@Autowired
	MsgService msgService;

	
	@RequestMapping("selectarticle")
	public void  get_content(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        Article article = articleService.getContent(1);
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(article));
	}
	
	@RequestMapping("selectversion")
	public void get_version(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
        Version version = versionService.getVersion(1);
        Gson gson =  new Gson();
        response.getWriter().write(gson.toJson(version));
	}
	
//	@RequestMapping("selecturl")
//	public void get_url(HttpServletRequest request,HttpServletResponse response) throws Exception{
//		request.setCharacterEncoding("utf-8");
//		response.setCharacterEncoding("utf-8");
//		/* 设置响应头允许ajax跨域访问 */  
//        response.setHeader("Access-Control-Allow-Origin", "*");  
//        /* 星号表示所有的异域请求都可以接受， */  
//        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
//        List<Url> urls = urlService.getUrl();
//        Gson gson =  new Gson(); 
//        response.getWriter().write(gson.toJson(urls));
//	}
	
	@RequestMapping("getsomeversion")
	public void get_someVersion(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");
       
        Url someVersion = urlService.getSomeVersion(1);
        
		Gson gson =  new Gson();
		
		response.getWriter().write(gson.toJson(someVersion));
	}
	
	
//	public static class substring{
//		public  static void main(String[] args){
//			String   str = "";
//			if(str.length()>=4){// 判断是否长度大于等于4
//				String sub=str.substring(str.length()- 4,str.length());//截取两个数字之间的部分
//			} 
//		}
//	}
	@RequestMapping("edit")
	public void test_edit(HttpServletRequest request,HttpServletResponse response) throws Exception{
		request.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
       response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
		String umsg = request.getParameter("umsg");
		System.out.println("umsg: " + umsg);
		if(umsg.length()>=16){// 判断是否长度大于等于并且非空字符串
			String sub=umsg.substring(umsg.length()- 16);//截取两个数字之间的部分			
			Gson gson =  new Gson();
			System.out.println(sub);			
			if (sub.equals("a0b923820dcc509a")){
				Url someVersion = urlService.getSomeVersion(1);
			    response.getWriter().write(gson.toJson(someVersion));
			}else if(sub.equals("9d4c2f636f067f89")) {
				Url someVersion = urlService.getSomeVersion(2);
			    response.getWriter().write(gson.toJson(someVersion));
			}else if(sub.equals("4b5ce2fe28308fd9")) {
				Url someVersion = urlService.getSomeVersion(3);
				response.getWriter().write(gson.toJson(someVersion));
			}else {
				
				response.getWriter().write(gson.toJson("1"));
			}
		}				 		
	}
	
	@RequestMapping("getmsg")
	public void get_msg(HttpServletRequest request,HttpServletResponse response)throws Exception{
		request.setCharacterEncoding("utf-8");
		/* 设置响应头允许ajax跨域访问 */  
        response.setHeader("Access-Control-Allow-Origin", "*");  
        /* 星号表示所有的异域请求都可以接受， */  
        response.setHeader("Access-Control-Allow-Methods", "GET,POST");  
     
       	Msg msg = msgService.getMsg("msg");
		Gson gson =  new Gson();
	    response.getWriter().write(gson.toJson(msg));
	  
	 
	}
}
