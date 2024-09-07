package com.example.demo.service.impl;


import com.example.demo.dtos.InformationDto;
import com.example.demo.entity.InformationEntity;
import com.example.demo.repository.InformationRepository;
import com.example.demo.service.InformationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    private InformationRepository informationRepository;

    @Override
    public void saveInformation(InformationDto informationDto) {
        InformationEntity informationEntity = new InformationEntity();
        BeanUtils.copyProperties(informationDto,informationEntity);
        informationRepository.save(informationEntity);
    }

    @Override
    public InformationDto getInformationById(Long id) {
        Optional<InformationEntity> informationEntity = informationRepository.findById(id);
        if(informationEntity.isPresent())
        {
            InformationDto informationDto = new InformationDto();
            InformationEntity informationEntity1 = informationEntity.get();
            BeanUtils.copyProperties(informationEntity1,informationDto);
            return informationDto;
        }
        return null;
    }

    @Override
    public List<InformationDto> getAllInformation() {
        List<InformationEntity> informationsEntities = informationRepository.findAll();
        List<InformationDto> result = new ArrayList<>();
        informationsEntities.forEach(informationsEntity -> {
            InformationDto informationDto = new InformationDto();
            BeanUtils.copyProperties(informationsEntity,informationDto);
        });
        return result;
    }

}
