package com.wap.core;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MemberSource {
    private static final String YAML_FILE_NAME = "member-%s.yml";

    public static MemberConfig createMemberConfig(){
        try {
            Properties properties = new Properties();
            InputStream inputStream = MemberSource.class.getClassLoader().getResourceAsStream(String.format(YAML_FILE_NAME, System.getenv("--spring.profiles.active")));
            properties.load(inputStream);
            return MemberConfig.builder()
                    .userId(properties.getProperty("userId"))
                    .userPw(properties.getProperty("userPw"))
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
