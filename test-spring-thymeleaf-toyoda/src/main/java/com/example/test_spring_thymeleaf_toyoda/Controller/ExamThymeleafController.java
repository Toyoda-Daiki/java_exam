package com.example.test_spring_thymeleaf_toyoda.Controller;

import com.example.test_spring_thymeleaf_toyoda.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/exam")
public class ExamThymeleafController {

  @RequestMapping("/input")
  public String input() {
    return "ex-thymeleaf-input";
  }

  @PostMapping("/result")
  public String result(@RequestParam String name,
      @RequestParam Integer age,
      @RequestParam List<String> hobbyList,
      Model model) {
    Member member = new Member();
    member.setName(name);
    member.setAge(age);
    member.setHobbyList(hobbyList);

    model.addAttribute("member", member);
    return "ex-thymeleaf-result";
  }
}
