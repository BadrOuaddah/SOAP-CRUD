package com.example.SOAPCRUD;

import io.spring.guides.gs_producing_web_service.*;

public class PersonMapper {

    public GetPersonResponse mapToPersonResponse(Person person) {
        GetPersonResponse response = new GetPersonResponse();
        response.setName(person.getName());
        response.setAge(person.getAge());
        response.setCity(person.getCity());
        return response;
    }

}
