package sy.controller;

import java.text.SimpleDateFormat;

public class Hander {

	
	public static String getUuid(){
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String UUID=sdf.format(new java.util.Date())+""+(new java.util.Random().nextInt(900)+100); 

		return UUID;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("---------------"+getUuid());
	}

}
