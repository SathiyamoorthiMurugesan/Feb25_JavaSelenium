package a1BasicsOfJava;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            // Load the properties file
        //	String filepath=new String("C:\\Users\\karth\\git\\Feb25_JavaSelenium\\src\\main\\resources\\config.properties");
        	String filepath="C:\\Users\\karth\\git\\Feb25_JavaSelenium\\src\\main\\resources\\config.properties";
            FileInputStream fileInputStream = new FileInputStream(filepath);
            properties.load(fileInputStream);
            
            // Access the properties
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
      