package cn.jiangbt.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    /**
     * 程序的入口点
     * 使用Spring Boot框架启动应用程序
     *
     * @param args 命令行参数，允许向程序传递外部参数
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
