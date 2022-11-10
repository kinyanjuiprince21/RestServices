package com.example.RestServices.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GradeReport {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private char grade;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="studentNumber")
    private Student studentNumber;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "sectionIdentifier")
    private Section sectionIdentifier;

}
