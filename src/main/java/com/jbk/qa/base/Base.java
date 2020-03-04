package com.jbk.qa.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

public class Base {
	public static Properties prop;
	String currDir;

	@BeforeSuite
	public void loadProperties() {
		//loadProperties();
		prop = new Properties();
		try {
			currDir = System.getProperty("user.dir");
			System.out.println("currDir" + currDir);
			FileInputStream fis = new FileInputStream(
					currDir+"/src/main/java/com/flipkart/qa/config/config.properties");
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
