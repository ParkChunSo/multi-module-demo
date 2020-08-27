package com.wap.app.controller;

import com.wap.core.MemberConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberController {

    private final MemberConfig memberConfig;

    public MemberController(MemberConfig memberConfig) {
        this.memberConfig = memberConfig;
    }

    @GetMapping
    public String test(){
        return "member-controller";
    }

    @GetMapping("/info")
    public MemberConfig get(){
        return memberConfig;
    }
}
