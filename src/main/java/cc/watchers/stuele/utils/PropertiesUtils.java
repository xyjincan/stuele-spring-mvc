package cc.watchers.stuele.utils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

/**
 * @author chengning
 * @date 2016年2月27日下午3:48:07
 * @email ningcheng@cloudinnov.com
 * @remark 读取配置文件的工具类
 * @version
 */
public class PropertiesUtils {
	/**
	 * 获取属性文件的数据 根据key获取值
	 * 
	 * @param fileName
	 *            文件名　(注意：加载的是src下的文件,如果在某个包下．请把包名加上)
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String findPropertiesKey(String key) {
		Properties properties = new Properties();
		try {
			properties.load(new InputStreamReader(PropertiesUtils.class.getClassLoader().getResourceAsStream("config.properties"), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			return null;
		} catch (IOException e) {
			return null;
		}
		return (String) properties.get(key);
	}

}
