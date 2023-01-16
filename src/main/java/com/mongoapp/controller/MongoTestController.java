package com.mongoapp.controller;

import com.mongoapp.dto.MemberDto;
import com.mongoapp.entity.Member;
import com.mongoapp.repository.MemberMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MongoTestController {
    private final MemberMongoRepository memberMongoRepository;

    @PostMapping("/insert")
    public void getTest(@RequestBody MemberDto member) {
        Member createMember = Member.createMember()
                .member(member)
                .build();
        memberMongoRepository.save(createMember);
    }

    @PostMapping("/add")
    public void addAddress(@RequestBody MemberDto member) {
        Member createMember = Member.createMember()
                .member(member)
                .build();
        memberMongoRepository.save(createMember);
    }

    @GetMapping("/findId")
    public Member getMember(@RequestParam String oId) {
        return memberMongoRepository.findById(oId).orElse(null);
    }
}
