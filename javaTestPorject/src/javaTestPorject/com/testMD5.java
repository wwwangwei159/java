package javaTestPorject.com;

import java.io.*;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;



  
public class testMD5 {  
      
     public static String getMdByFile(File file) throws FileNotFoundException {  
            String value = null;  
            FileInputStream in = new FileInputStream(file);  
        try {  
        	MappedByteBuffer byteBuffer = in.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length());  
        	MessageDigest md5 = MessageDigest.getInstance("MD5");
        	md5.update(byteBuffer);  
        	BigInteger bi = new BigInteger(1, md5.digest());  
        	value = bi.toString(16);  

        } catch (Exception e) {  
        	 e.printStackTrace();  
        } finally {  
                if(null != in) {  
                    try {  
                    	 in.close();  
                } catch (IOException e) {  
                	 e.printStackTrace();  
                }  
            }  
        }  
        return value;  
        }  
       
    public static void main(String[] args) throws IOException {  
          
        String path="C:\\Users\\gavinwang\\Desktop\\jar\\persistence-biz-common.jar";  
          
        String v = getMdByFile(new File(path));  
        System.out.println("MD5:"+v.toLowerCase());  
          
       /* FileInputStream fis= new FileInputStream(path);    
        String md5 = DigestUtils.md5Hex(IOUtils.toByteArray(fis)); 
        IOUtils.closeQuietly(fis);    
        System.out.println("MD5:"+md5);  */ 
          
        //Systemoutprintln("MD:"+DigestUtilsmdHex("WANGQIUYUN"));  
    }  
  
}  
