package com.crazoy.common.utils.io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLIOUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String destUrl="http://114.113.159.203:9200/spay/pay/payservice.do?charset=UTF-8&mer_id=7050044&res_format=HTML&service=download_settle_file_p&settle_date_p2p=20151230&settle_type_p2p=03&sign_type=RSA&version=1.0&sign=fgFbYSkrYjnVgm0MGPmMrY0AOSkzOhW0z4ILQrtsOfnXMRahxMt6K4InEX%2FOaUolGuKcoEOJYoRni5QBtwpOqBXeqeudKFT83NA%2BAMceSLiUINdry7NNOEMklmrcjkecfkIEcZLBtSBQBAXsI%2BNrIrTPn8MiJnX6CFU0NKZa%2Bs8%3D";
		destUrl = "https://www.baidu.com";
		URLIOUtils.readingFromUrl(destUrl);
	}

	public static void readingFromUrl(String destUrl){
		try{
				
			URL url = new URL(destUrl);
			HttpURLConnection httpUrl = (HttpURLConnection) url.openConnection();
			
			httpUrl.connect();
			InputStream input = new BufferedInputStream(httpUrl.getInputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(input));
			byte[] buffer = new byte[1024];
			int size = 0;
			String str;
			while((str=br.readLine())!=null)
				
				System.out.println(str);
			
			}catch(Exception ex){
				ex.printStackTrace();
			}finally{
				System.out.println("we are here.");
			}
	}
	
	public void writingToConsole(String s){
		
		System.out.println(s);
	}
}
