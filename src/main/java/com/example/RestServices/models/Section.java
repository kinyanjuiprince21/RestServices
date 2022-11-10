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
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long sectionIdentifier;
    private String semester;
    private int year;
    private String instructor;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="courseId")
    private Course courseId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sectionIdentifier")
    private List<GradeReport> gradeReports;

    public List<GradeReport> getReports() {
        return gradeReports;
    }

    public void setReports(List<GradeReport> gradeReports) {
        this.gradeReports = gradeReports;
    }
}
