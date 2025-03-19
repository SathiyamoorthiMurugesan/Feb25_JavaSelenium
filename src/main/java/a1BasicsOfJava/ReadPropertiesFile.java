package a1BasicsOfJava;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            // Load the properties file
            FileInputStream fileInputStream = new FileInputStream("config.properties");
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
      