package com.example.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    // Get all members
    @GetMapping("/members")
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }
    // Get member by ID
    @GetMapping("/members/{id}")
    public Member getMemberById(@PathVariable int id) {
        return memberRepository.findById(id).orElse(null);
    }

    // Create a new member
    @PostMapping("/member")
    public Member createMember(@RequestBody Member member) {
        return memberRepository.save(member);
    }
}
