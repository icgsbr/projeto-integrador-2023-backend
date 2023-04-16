package com.senac.piback2023.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "DATA_SET")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataSetModel {
    //region ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
//    private String _timestamp;
    @Column(name = "FRUITS_VEGGIES")
    private Integer _FruitsAndVeggies;
    @Column(name = "DAILY_STRESS")
    private String _dailyStress;
    @Column(name = "PLACES_VISITED")
    private Integer _placesVisited;
    @Column(name = "CORE_CIRCLE")
    private Integer _coreCircle;
    @Column(name = "SUPPORTING_OTHERS")
    private Integer _supportingOthers;
    @Column(name = "SOCIAL_NETWORK")
    private Integer _socialNetwork;
    @Column(name = "ACHIEVEMENT")
    private Integer _achievement;
    @Column(name = "DONATION")
    private Integer _donation;
    @Column(name = "BMI_RANGE")
    private Integer _bmiRange;
    @Column(name = "TODO_COMPLETED")
    private Integer _todoCompleted;
    @Column(name = "FLOW")
    private Integer _flow;
    @Column(name = "DAILY_STEPS")
    private Integer _dailySteps;
    @Column(name = "LIVE_VISION")
    private Integer _liveVision;
    @Column(name = "SLEEP_HOURS")
    private Integer _sleepHours;
    @Column(name = "LOST_VACATION")
    private Integer _lostVacation;
    @Column(name = "DAILY_SHOUTING")
    private Integer _dailyShouting;
    @Column(name = "SUFFICIENT_INCOME")
    private Integer _sufficientIncome;
    @Column(name = "PERSONAL_AWARDS")
    private Integer _personalAwards;
    @Column(name = "TIME_FOR_PASSION")
    private Integer _timeForPassion;
    @Column(name = "WEEKLY_MEDITATION")
    private Integer _weeklyMeditation;
    @Column(name = "AGE")
    private String _age;
    @Column(name = "GENDER")
    private String _gender;
    @Column(name = "WORK_LIFE_BALANCE_SCORE")
    private Double _workLifeBalanceScore;
    //endregion

    //region CONSTRUCTORS
    //endregion
}
