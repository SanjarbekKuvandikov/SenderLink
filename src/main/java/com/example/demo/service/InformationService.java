package com.example.demo.service;

import com.example.demo.dtos.InformationDto;

import java.util.List;

public interface InformationService {

    void saveInformation(InformationDto informationDto);
    InformationDto getInformationById(Long id);

    List<InformationDto> getAllInformation();

}
