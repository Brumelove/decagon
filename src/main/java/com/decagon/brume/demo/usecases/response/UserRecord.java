package com.decagon.brume.demo.usecases.response;

import lombok.Data;


/**
 * @author Brume
 **/
@Data
public class UserRecord {
    private Integer id;
    private String username;
    private String about;
    private Integer submitted;
    private String updated_at;
    private Integer submission_count;
    private Integer comment_count;
    private Integer created_at;

}
