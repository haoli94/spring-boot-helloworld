package haoli94.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
@PropertySource(value={"classpath:person.properties"}) // 读取指定的配置文件
@ConfigurationProperties(prefix = "person") // 读取全局配置的文件 application.yml 或者 application.properties
public class Person {
  private String lastName;
  private Integer age;
  private boolean boss;
  private Date birth;
  private Map<String, Object> maps;
  private List<Object> list;
  private Dog dog;

  @Override
  public String toString() {
    return "Person{" +
        "lastName='" + lastName + '\'' +
        ", age=" + age +
        ", boss=" + boss +
        ", birth=" + birth +
        ", maps=" + maps +
        ", list=" + list +
        ", dog=" + dog +
        '}';
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void setBoss(boolean boss) {
    this.boss = boss;
  }

  public void setBirth(Date birth) {
    this.birth = birth;
  }

  public void setMaps(Map<String, Object> maps) {
    this.maps = maps;
  }

  public void setList(List<Object> list) {
    this.list = list;
  }

  public void setDog(Dog dog) {
    this.dog = dog;
  }

  public String getLastName() {
    return lastName;
  }

  public Integer getAge() {
    return age;
  }

  public boolean isBoss() {
    return boss;
  }

  public Date getBirth() {
    return birth;
  }

  public Map<String, Object> getMaps() {
    return maps;
  }

  public List<Object> getList() {
    return list;
  }

  public Dog getDog() {
    return dog;
  }
}
