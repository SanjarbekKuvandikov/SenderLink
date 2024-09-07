package com.example.demo.controllers;

import com.example.demo.dtos.InformationDto;
import com.example.demo.dtos.ResponseDto;
import com.example.demo.service.InformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class Controller {
    @Autowired
    private InformationService informationService;

    @PostMapping(value = "/information")
    private ResponseEntity<ResponseDto> setInformation(@RequestBody InformationDto informationDto) {
        informationService.saveInformation(informationDto);
        return ResponseEntity.ok(
                new ResponseDto("Successfully set information", "SUCCESS")
        );
    }

    @GetMapping(value = "/information/id={id}")
    private ResponseEntity<?> getById(@PathVariable Long id)
    {InformationDto informationDto = informationService.getInformationById(id);

        if (informationDto == null) {
            // Not found, return message and status
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseDto(
                            "Topilmadi",
                            "NOT_FOUND"
                    )
            );
        }

        // Success, return the full InformationDto
        return ResponseEntity.ok(informationDto);
    }
    @GetMapping("/information")
    private ResponseEntity<List<InformationDto>> getAll(){
        List<InformationDto> list = informationService.getAllInformation();
        return ResponseEntity.ok(list);
    }

}