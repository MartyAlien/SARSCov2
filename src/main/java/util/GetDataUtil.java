package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GetDataUtil {
	// 用于缓存数据: 提高用户访问速度
	private static String data;
	// 记录下载数据时的时间戳
	private static long time=0;
	
	public static String getData() throws IOException {
		// 从网址下载疫情数据
		if(System.currentTimeMillis()-time>600000) {
			// 记录当前时间戳
			time=System.currentTimeMillis();
			// 1.获取网址对象
			URL url=new URL("https://zaixianke.com/yq/all");
			// 2.打开链接并获取链接对象
			URLConnection conn = url.openConnection();
			// 3.通过连接获得字节输入流
			InputStream is = conn.getInputStream();
			// 4.包装：得到字符输入流
			BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
			// 5.获取
			data = br.readLine();
		}
		
		return data;
	}
}
