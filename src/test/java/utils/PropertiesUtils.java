package utils;

import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
    static Properties properties = new Properties();

    public static String getProp(String key) throws IOException{
        try {
            if (System.getProperty("env") == null) {
                properties.load(PropertiesUtils.class.getClassLoader().getResourceAsStream("hom.properties"));
            } else {
                properties.load(PropertiesUtils.class.getClassLoader().getResourceAsStream(System.getProperty("env")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);

    }

}

