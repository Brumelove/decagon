package com.decagon.brume.demo.usecases.response;

import lombok.Data;

import java.util.List;

/**
 * @author Brume
 **/
@Data
public class SearchResponse {
    private String page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;
    private List<UserRecord> data;
}
