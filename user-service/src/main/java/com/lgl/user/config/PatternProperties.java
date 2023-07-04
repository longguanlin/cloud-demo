package com.lgl.user.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author 15911
 * @Date 2023/5/14 20:12
 * @Version 1.0
 */
@Component
@Data
@ConfigurationProperties(prefix = "pattern")
public class PatternProperties {

    private String dateformat;
    private String envSharedValue;
}
