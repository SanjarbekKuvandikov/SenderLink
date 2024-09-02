package com.example.demo.controllers;

import com.example.demo.dtos.InformationDto;
import com.example.demo.dtos.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class Controller {

    @PostMapping(value = "/information")
    private ResponseEntity<ResponseDto> setInformation(@RequestBody InformationDto informationDto)
    {
        System.out.println(informationDto.getFname()+" "+informationDto.getLname() + " " +informationDto.getTeloremail());
        return ResponseEntity.ok(
                new ResponseDto("Successfully set information","success"));
    }

}