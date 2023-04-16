package com.senac.piback2023.models;

import com.senac.piback2023.services.utils.IMCCalculationUtil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "USER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
    //region ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "NAME", nullable = false)
    private String _userName;
    @Column(name = "EMAIL", nullable = false, unique = true)
    private String _userEmail;
    @Column(name = "HEIGHT", nullable = false)
    private Double _userHeight;
    @Column(name = "WEIGHT", nullable = false)
    private Double _userWeight;
    @Column(name = "IMC")
    private Double _userIMC = null;
    //endregion

    //region CONSTRUCTOR
    //endregion
}
