package haoli94.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

  @ResponseBody // 把response写回去给前端
  @RequestMapping("/hello")
  public String hello() {
    return "Hello World!";
  }
}
