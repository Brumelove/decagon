package com.decagon.brume.demo.usecases.mapper;

import com.decagon.brume.demo.domain.models.SearchModel;
import com.decagon.brume.demo.usecases.response.SearchResponse;
import org.mapstruct.Mapper;

/**
 * @author Brume
 **/
@Mapper
public interface SearchModelMapper {
    SearchResponse sourceToDesc(SearchModel searchModel);
    SearchModel descToSource(SearchResponse searchResponse);
}
