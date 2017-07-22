package sy.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

public class Hander {

	
	public static String getUuid(){
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String UUID=sdf.format(new java.util.Date())+""+(new java.util.Random().nextInt(900)+100); 

		return UUID;
		
	}
	
	/**
	 * 返回公共response属性
	 * @param response
	 * @param object
	 */
	public static void responseText(HttpServletResponse response,Object object){	
		
		response.setContentType("text/plain");  
	    response.setHeader("Pragma", "No-cache");  
	    response.setHeader("Cache-Control", "no-cache");  
	    response.setDateHeader("Expires", 0);  
	    response.setCharacterEncoding("utf-8");
	    String str = JSON.toJSONStringWithDateFormat(object, "yyyy-MM-dd HH:mm:ss");
	    PrintWriter out;
		try {
			out = response.getWriter();
			out.println(str);//
	        out.flush();  
	        out.close(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		} 
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("---------------"+getUuid());
	}

}
