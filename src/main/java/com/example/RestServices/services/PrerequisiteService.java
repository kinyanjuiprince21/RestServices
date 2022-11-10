package com.example.RestServices.services;

import com.example.RestServices.repositories.PrerequisiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrerequisiteService {

    @Autowired
    private PrerequisiteRepository prerequisiteRepository;
}
