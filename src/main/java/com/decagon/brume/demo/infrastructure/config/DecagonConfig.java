package com.decagon.brume.demo.infrastructure.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

/**
 * @author Brume
 **/
@Data
@Configuration
@Validated
@ConfigurationProperties
@PropertySource("classpath:config/DecagonConfig-${spring.profiles.active}.yaml")

public class DecagonConfig {
    @NotBlank
    private String hostUrl;

}
