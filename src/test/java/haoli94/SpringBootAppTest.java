package haoli94;

import haoli94.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

// Spring-boot 单元测试测试期间可以自动注入
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAppTest {
  @Autowired
  Person person;
  @Autowired
  ApplicationContext ioc;


  @Test
  public void testLoadHelloService(){
    boolean b = ioc.containsBean("helloService");
    System.out.println(b);
  }

  @Test
  public void contextLoads(){
    System.out.println(person);
  }
}
