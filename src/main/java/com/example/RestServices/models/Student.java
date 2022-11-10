package com.example.RestServices.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long studentNumber;
    private String name;
    private int class_;
    private String major;

    @OneToMany(cascade= CascadeType.ALL, mappedBy = "studentNumber")
    private List<GradeReport> gradeReportLists;

    public List<GradeReport> getGradeReports() {
        return gradeReportLists;
    }

    public void setGradeReports(List<GradeReport> gradeReportLists) {
        this.gradeReportLists = gradeReportLists;
    }

}
