package com.wap.app.config;

import com.wap.core.MemberConfig;
import com.wap.core.MemberSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MemberInfoConfig {
    @Bean
    public MemberConfig memberConfig(){
        return MemberSource.createMemberConfig();
    }
}
