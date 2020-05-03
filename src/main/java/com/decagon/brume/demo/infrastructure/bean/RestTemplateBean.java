package com.decagon.brume.demo.infrastructure.bean;

import com.decagon.brume.demo.infrastructure.config.DecagonConfig;
import com.decagon.brume.demo.usecases.SearchRequest;
import com.decagon.brume.demo.usecases.response.SearchResponse;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * @author Brume
 **/
@Slf4j
@Data
public class RestTemplateBean {
    private RestTemplate restTemplate;
    private DecagonConfig decagonConfig;

    public SearchResponse postRequestObject(SearchRequest request) {
        val httpHeaders = new HttpHeaders ();
        httpHeaders.setContentType ( MediaType.APPLICATION_JSON );
        val httpRequestEntity = new HttpEntity<> ( request, httpHeaders );
        String suffix =  ( "?page=" + request.getPage () );

//        log.info ( "Testing  {}", "=====================" , decagonConfig.getHostUrl () + suffix );

        val responseEntity = restTemplate.exchange ( decagonConfig.getHostUrl () + suffix, HttpMethod.GET, httpRequestEntity, SearchResponse.class );
        log.info ( "Testing  {}", "=====================" , decagonConfig.getHostUrl ());
        log.info ( "Status Code :::: {}", responseEntity.getStatusCode () );
        log.info ( "has Body :::: {}", responseEntity.hasBody () );
        log.info ( "Content Type :::: {}", responseEntity.getHeaders ().getContentType ().getType () );

        return (responseEntity.getBody ());


    }
}
