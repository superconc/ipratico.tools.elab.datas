package ipratico.tools.elab.datas.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {

    // Properties object to hold the configuration
    private static Properties properties = new Properties();

    // Static block to load properties when the class is loaded
    static {
        loadProperties();
    }

    // Private method to load properties from the file
    private static void loadProperties() {
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Spiacente, impossibile trovare config.properties");
                return;
            }

            // Load properties from the file
            properties.load(input);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // Public static method to retrieve a property by key
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
       
        // Use the properties without reloading the file
        System.out.println("App Name: " + ConfigLoader.getProperty("app.name"));
        System.out.println("App Version: " + ConfigLoader.getProperty("app.version"));
        System.out.println("App Author: " + ConfigLoader.getProperty("app.author"));
    }
}
