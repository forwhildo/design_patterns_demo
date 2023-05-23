package demo.use;

import demo.create.StrageryFactory;
import demo.define.Strategy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/**
 * @description: 运行时动态确定策略
 * @author: wxm
 * @create: 2023-05-23 23:02
 **/
public class Application {

    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("./config.properties"));
        String type = properties.getProperty("type");
        Strategy strategy = StrageryFactory.getStragery(type);


    }
}