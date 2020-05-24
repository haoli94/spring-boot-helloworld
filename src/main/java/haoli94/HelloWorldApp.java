package haoli94;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

// 告诉Springboot这是一个springboot application 主程序类
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class HelloWorldApp {
  public static void main(String[] args) {
    // Spring 应用启动起来
    SpringApplication.run(HelloWorldApp.class, args);
  }
}
