package org.yinsol.factory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class BeanFactory {

	Map<String, String> map=new HashMap();
	
	public BeanFactory(String filepath) {
		Properties prop=new Properties();
		InputStream is=getClass().getClassLoader().getResourceAsStream(filepath);
		if(is!=null){
		try {
			prop.load(is);
		} catch (IOException e) {
				e.printStackTrace();
		}
		}else{
			throw new RuntimeException("Properties file not found ");
		}
		map=(Map)prop;		
	}
	
	public Object getBean(String key){
		Object object=null;
		try {
			Class clz=Class.forName(map.get(key));
			object= clz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return object;
	}
	
	
	public static void main(String[] args) {
		new BeanFactory("org/yinsol/resource/bean.properties");
	}
	

}
