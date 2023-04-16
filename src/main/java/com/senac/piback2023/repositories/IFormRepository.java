package com.senac.piback2023.repositories;

import com.senac.piback2023.models.FormModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IFormRepository extends JpaRepository<FormModel, UUID> {
}
