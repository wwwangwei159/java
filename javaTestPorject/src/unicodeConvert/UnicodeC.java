package unicodeConvert;

import java.io.UnsupportedEncodingException;
import java.util.regex.Matcher;

public class UnicodeC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			System.out.println(",".getBytes("UTF-8"));
			System.out.println(",".getBytes("UTF-8"));
			System.out.println(string2Unicode(","));
			System.out.println(string2Unicode(","));
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String string2Unicode(String str)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            String tmpStr = Integer.toHexString(str.charAt(i));
            if(tmpStr.length() < 4){
                sb.append("\\u00");
            }else{
                sb.append("\\u");
            }
            sb.append(tmpStr);
        }
        return sb.toString();
    }

}
