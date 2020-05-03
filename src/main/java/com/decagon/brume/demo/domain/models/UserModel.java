package com.decagon.brume.demo.domain.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Brume
 **/
@Data @Entity @NoArgsConstructor
public class UserModel {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String about;
    private Integer submitted;
    private String updated_at;
    private Integer submission_count;
    private Integer comment_count;
    private Integer created_at;
}
