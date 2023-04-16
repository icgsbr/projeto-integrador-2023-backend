package com.senac.piback2023.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "FORM")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormModel {
    //region ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    private DataSetModel dataSetModel;
    @ManyToOne
    private UserModel userModel;
    //endregion

    //region CONSTRUCTORS
    //endregion
}
