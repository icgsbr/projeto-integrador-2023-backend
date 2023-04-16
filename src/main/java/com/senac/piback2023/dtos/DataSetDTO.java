package com.senac.piback2023.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DataSetDTO {
    //region ATTRIBUTES
    //    private String _timestamp;
    @NotBlank
    private Integer _FruitsAndVeggies;
    @NotBlank
    private String _dailyStress;
    @NotBlank
    private Integer _placesVisited;
    @NotBlank
    private Integer _coreCircle;
    @NotBlank
    private Integer _supportingOthers;
    @NotBlank
    private Integer _socialNetwork;
    @NotBlank
    private Integer _achievement;
    @NotBlank
    private Integer _donation;
    @NotBlank
    private Integer _bmiRange;
    @NotBlank
    private Integer _todoCompleted;
    @NotBlank
    private Integer _flow;
    @NotBlank
    private Integer _dailySteps;
    @NotBlank
    private Integer _liveVision;
    @NotBlank
    private Integer _sleepHours;
    @NotBlank
    private Integer _lostVacation;
    @NotBlank
    private Integer _dailyShouting;
    @NotBlank
    private Integer _sufficientIncome;
    @NotBlank
    private Integer _personalAwards;
    @NotBlank
    private Integer _timeForPassion;
    @NotBlank
    private Integer _weeklyMeditation;
    @NotBlank
    private String _age;
    @NotBlank
    private String _gender;
    @NotBlank
    private Double _workLifeBalanceScore;
    //endregion
}
