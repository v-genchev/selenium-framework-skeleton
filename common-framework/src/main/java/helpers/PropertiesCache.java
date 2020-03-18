package helpers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesCache {

    private final Properties properties = new Properties();

    private PropertiesCache() {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("config.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class LazyHolder {
        private static final PropertiesCache INSTANCE = new PropertiesCache();
    }

    public static PropertiesCache getInstance() {
        return LazyHolder.INSTANCE;
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }
}
