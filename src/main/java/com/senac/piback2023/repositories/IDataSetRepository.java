package com.senac.piback2023.repositories;

import com.senac.piback2023.models.DataSetModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IDataSetRepository extends JpaRepository<DataSetModel, UUID> {
}
