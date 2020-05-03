package com.decagon.brume.demo.usecases.respositories;

import com.decagon.brume.demo.domain.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Brume
 **/
public interface UserRepository extends JpaRepository<UserModel, Long> {
}
