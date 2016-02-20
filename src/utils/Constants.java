package utils;

import java.util.Properties;

public class Constants {

	private static Constants sConstants;
	private static Properties mProperties;

	public interface Callbacks {
		void setConstants();
		void onConstantsUpdate();
	}
	
	/*private String fileName = "constants.properties";

	private Constants() {
		mProperties = new Properties();
		loadProperties(mProperties);
	}
	
	public static Constants get() {
		if (sConstants == null) {
			sConstants = new Constants();
		}
		return sConstants;
	}
	
	public static Properties prop() {
		if (sConstants == null) {
			sConstants = new Constants();
		}
		return mProperties;
	}
	
	private void saveProperties(Properties properties) {
		try {
			File file = new File(fileName);
			FileWriter out = new FileWriter(file);
			
			properties.store(out, null);
			out.close();
			System.out.println("All Saved!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void loadProperties(Properties properties) {
		try {
			String path = System.getProperty(fileName);
			FileInputStream in = new FileInputStream(new File(path));
			properties.load(in);
			in.close();
			System.out.println("All loaded!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void thatsAWrapFolks() {
		saveProperties(mProperties);
	}
	
	public void reload() {
		loadProperties(mProperties);
	}*/
	
}
