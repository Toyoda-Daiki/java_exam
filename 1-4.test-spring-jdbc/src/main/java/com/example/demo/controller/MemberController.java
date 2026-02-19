package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		List<Member> memberList = repository.findAll();
		for (Member member : memberList) {
			System.out.println(member);
		}

		Member member = repository.load(2);
		System.out.println(member);

		Member newMember = new Member();
    newMember.setName("豊田大樹");
    newMember.setAge(25);
    newMember.setDepId(1);
    repository.save(newMember);
		member.setName("シロー");
    repository.save(member);
		
		return "member";
	}
}
