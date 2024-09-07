package com.example.demo.repository;

import com.example.demo.entity.InformationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<InformationEntity,Long>
{

}
