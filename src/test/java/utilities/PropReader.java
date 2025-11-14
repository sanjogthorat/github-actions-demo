package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropReader {

	public static String readPropData(String valueToBeRead) throws IOException {
		Properties prop = new Properties();
		String path = System.getProperty("user.dir") + "//src//test//resources//config//Config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		
		String value = prop.getProperty(valueToBeRead);
		return value;
	}
}