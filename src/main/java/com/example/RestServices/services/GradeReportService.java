package com.example.RestServices.services;

import com.example.RestServices.repositories.GradeReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeReportService {

    @Autowired
    private GradeReportRepository gradeReportRepository;
}
