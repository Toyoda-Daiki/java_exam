package com.example.test_spring_mvc_toyoda;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/name-form")
public class ReceiveNameController {
  @RequestMapping("")
  public String index(){
    return "name-form";
  }

  @RequestMapping("/info")
  public String info(String name){
    System.out.println("入力された値は" + name + "です");
    return "finished";
  }
}
