package org.pojo.generic;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @author sunit
 *
 */

public class PropertyFileLibrary {
	/**
	 * To get the data from the property file
	 * @param propPath
	 * @param key
	 * @return
	 * @throws Throwable
	 */

	public String readPropertyData(String key) throws Throwable {
		FileInputStream fileInpuStream = new FileInputStream(IConstants.filePath);
		Properties properties = new Properties();
		properties.load(fileInpuStream);
		String propertyValue = properties.getProperty(key, "Incorrect Key");
		return propertyValue;
	}

}
