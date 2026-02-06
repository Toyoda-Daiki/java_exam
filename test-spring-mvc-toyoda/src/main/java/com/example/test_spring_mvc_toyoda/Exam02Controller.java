package com.example.test_spring_mvc_toyoda;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

  @RequestMapping("")
  public String showCompanyIntroduction(){
    return "redirect:/exam02/show-company-introduction";
  }

  @RequestMapping("/show-company-introduction")
  public String showCompanyIntroduction2() {
    return "exam-02";
  }
}
