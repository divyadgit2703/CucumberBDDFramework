package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configLoader {
Properties prop = new Properties();
   public configLoader(String filepath)
    {
try {
    FileInputStream fis = new FileInputStream(filepath);
    prop.load(fis);

} catch (IOException e) {
    e.printStackTrace();
}
    }

    public String getProperty(String key)
    {
        return prop.getProperty(key);
    }
}
