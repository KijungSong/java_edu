package com.daebaksong.myboard.service;

import com.daebaksong.myboard.domin.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {
    @Autowired
    MemberService memberService;

    @Test
    public void testAddMember() throws Exception {
        System.out.println("-------------------------");
        Member member = new Member();
        member.setName("song");
        member.setRegdate(LocalDateTime.now());
        member.setEmail("skj4522@gmail.com");
        member.setPasswd("1234");
        member = memberService.addMember(member);
        System.out.println(member.getId());
        System.out.println("-------------------------");

    }

    @Test
    public void testGetMemberByEmail() throws Exception {
        System.out.println("-------------------------");
        Member member = memberService.getMember("skj4522@gmail.com");
        System.out.println(member.getId());
        System.out.println(member.getName());
        System.out.println(member.getMemberRoles());
        System.out.println("-------------------------");
    }

}
