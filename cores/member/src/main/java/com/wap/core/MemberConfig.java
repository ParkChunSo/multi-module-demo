package com.wap.core;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class MemberConfig {
    private String userId;
    private String userPw;
}
