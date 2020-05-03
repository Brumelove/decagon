package com.decagon.brume.demo.usecases.respositories;

import com.decagon.brume.demo.domain.models.SearchModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Brume
 **/
@Repository
public interface SearchRepository extends JpaRepository<SearchModel, Long > {
}
