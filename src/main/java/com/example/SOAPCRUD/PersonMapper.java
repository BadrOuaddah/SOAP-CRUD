package com.example.SOAPCRUD;

import io.spring.guides.gs_producing_web_service.*;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    public GetPersonResponse mapToGetPersonResponse(Person person) {
        GetPersonResponse response = new GetPersonResponse();
        response.setName(person.getName());
        response.setAge(person.getAge());
        response.setCity(person.getCity());
        return response;
    }

    public UpdatePersonResponse mapToUpdatePersonResponse(Person person) {
        UpdatePersonResponse response = new UpdatePersonResponse();
        response.setId(Math.toIntExact(person.getId()));
        response.setName(person.getName());
        response.setAge(person.getAge());
        response.setCity(person.getCity());
        return response;
    }

    public AddPersonResponse mapToAddPersonResponse(Person person) {
        AddPersonResponse response = new AddPersonResponse();
        response.setId(Math.toIntExact(person.getId()));
        response.setName(person.getName());
        response.setAge(person.getAge());
        response.setCity(person.getCity());
        return response;
    }

}
