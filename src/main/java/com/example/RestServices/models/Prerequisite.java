package com.example.RestServices.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prerequisite {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long prerequisite_id;
    private String prerequisite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId")
    private Course courseId;

}
