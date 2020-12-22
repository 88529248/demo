package com.example.demo.utils;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class MyProperties {

    //从配置文件读取信息
    @Test
    public void testRead() {
        try {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/application.properties");
            properties.load(fileInputStream);
            properties.list(System.out);
            System.out.println("server.port: " + properties.getProperty("server.port"));
            System.out.println("spring.mvc.locale: " + properties.getProperty("spring.mvc.locale"));
            System.out.println("spring.mvc.locale: " + properties.getProperty("null"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }@Test
    public void testWrite() {
        try {
            Properties properties = new Properties();
            properties.setProperty("name","zhangsan");
            PrintStream printStream = new PrintStream("src/main/resources/applications.properties");
            properties.list(printStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
