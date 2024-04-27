package com.example.SOAPCRUD;

import io.spring.guides.gs_producing_web_service.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
