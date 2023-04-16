package com.senac.piback2023.repositories;

import com.senac.piback2023.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    @Query(value = "select user from UserModel user where user._userEmail = :email")
    Optional<UserModel> findByEmail(@Param(value = "email") String email);

    boolean existsBy_userEmail(String email);

//    @Query(value = "update UserModel oldUser set")
//    Optional<UserModel> updateUserModelById(
//            @Param(value = "newUserModel") UserModel newUserModel
//    );
}
