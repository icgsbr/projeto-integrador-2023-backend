package com.senac.piback2023.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    //region ATTRIBUTES
    @NotBlank
    private String _userName;
    @NotBlank
    private String _userEmail;
    @NotBlank
    private Double _userHeight;
    @NotBlank
    private Double _userWeight;
    //endregion
}
