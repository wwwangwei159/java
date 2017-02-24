package javatest.url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;




public class getJasonData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(); 
		 String json = sendPost("http://localhost:8080/webBTLBBO/oneTimeBTLMobile.do?method=getBTLQueueTask&userrole=PM&loginid=tima&userid=606322");
		 System.out.println(json);
		 JSONObject j = JSONObject.fromObject(json);
	     System.out.println("data====="+j.get("data"));
	}

	public static String sendPost(String url) {  
        String result = "";  
        try {  
            URL httpurl = new URL(url);  
            HttpURLConnection httpConn = (HttpURLConnection) httpurl  
                    .openConnection();  
            httpConn.setDoInput(true);   // 允许输入流,默认是true，而doOutput - 允许输出流,默认是false
            BufferedReader in = new BufferedReader(new InputStreamReader(  
                    httpConn.getInputStream()));  
            String line;  
            while ((line = in.readLine()) != null) {  
                result += line;  
            }  
            in.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
            System.out.println("没有结果！" + e);  
        }  
        return result;  
    }  
}
