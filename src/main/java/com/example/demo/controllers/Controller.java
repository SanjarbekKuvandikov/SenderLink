package com.example.demo.controllers;

import com.example.demo.dtos.InformationDto;
import com.example.demo.dtos.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    List<InformationDto> books = new ArrayList<>();


    @PostMapping(value = "/information")
    private ResponseEntity<ResponseDto> setInformation(@RequestBody InformationDto informationDto)
    {
        return ResponseEntity.ok(
                new ResponseDto("Successfully set information","success"));
    }

}