package com.decagon.brume.demo.infrastructure.controller;

import com.decagon.brume.demo.infrastructure.bean.RestTemplateBean;
import com.decagon.brume.demo.usecases.SearchRequest;
import com.decagon.brume.demo.usecases.response.SearchResponse;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Brume
 **/
@RestController
public class DecagonController {
    private final RestTemplateBean restTemplateBean;

    @Autowired
    public DecagonController(RestTemplateBean restTemplateBean) {
        this.restTemplateBean = restTemplateBean;
    }

    @GetMapping(value = "v1/search")
    public SearchResponse searchResponse(@RequestParam Integer page) {
        val searchRequest = new SearchRequest ();
        searchRequest.setPage ( page );
        return restTemplateBean.postRequestObject ( searchRequest );
    }
}
