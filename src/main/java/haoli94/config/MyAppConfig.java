package haoli94.config;


import haoli94.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
  @Bean
  public HelloService helloService(){
    System.out.println("配置类给容器加Bean了");
    return new HelloService();
  }
}
