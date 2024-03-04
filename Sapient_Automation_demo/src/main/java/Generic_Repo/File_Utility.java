package Generic_Repo;

import java.io.FileInputStream;
import java.util.Properties;

public class File_Utility 
{
	public String getPropertyKeyValue(String key) throws Throwable {
		 
		FileInputStream fis = new FileInputStream(Pathsdemo.filepath);
		Properties pObj = new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(key);
 
		return value;
}
}
