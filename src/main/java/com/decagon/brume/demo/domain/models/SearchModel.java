package com.decagon.brume.demo.domain.models;

import com.decagon.brume.demo.usecases.response.UserRecord;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

/**
 * @author Brume
 **/
@Data @Entity @NoArgsConstructor
public class SearchModel {
    @Id
    @GeneratedValue
    private Long page;
    private Integer per_page;
    private Integer total;
    private Integer total_pages;

    @OneToMany(mappedBy = "searchmodel", cascade = CascadeType.PERSIST)
    private List<UserModel> data;
}
