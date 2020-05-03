package com.decagon.brume.demo.infrastructure.config;

import com.decagon.brume.demo.infrastructure.bean.RestTemplateBean;
import lombok.val;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;
import static org.springframework.context.annotation.ScopedProxyMode.TARGET_CLASS;

/**
 * @author Brume
 **/
@Configuration
public class BeanConfig {
    private final DecagonConfig decagonConfig;

    @Autowired
    public BeanConfig(DecagonConfig decagonConfig) {
        this.decagonConfig = decagonConfig;
    }
    @Bean
    @Scope(value = SCOPE_PROTOTYPE, proxyMode = TARGET_CLASS)
    public RestTemplateBean restTemplateBean() {

        val clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory ( HttpClientBuilder.create().build());
        clientHttpRequestFactory.setConnectTimeout(2000);
        clientHttpRequestFactory.setReadTimeout(10000);

        val restTemplate = new RestTemplate (clientHttpRequestFactory);


        val restTemplateBean = new RestTemplateBean ();
        restTemplateBean.setRestTemplate(restTemplate);
        restTemplateBean.setDecagonConfig (decagonConfig);

        return restTemplateBean;
    }
}
