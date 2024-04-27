package com.example.SOAPCRUD;

import io.spring.guides.gs_producing_web_service.GetPersonRequest;
import io.spring.guides.gs_producing_web_service.GetPersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PersonEndpoints {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private final PersonRepository personRepository;

    @Autowired
    public PersonEndpoints(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonRequest")
    @ResponsePayload
    public GetPersonResponse getPerson(@RequestPayload GetPersonRequest request) {
        GetPersonResponse response = new GetPersonResponse();
        response.setName(request.getName());
        response.setAge(request.getAge());
        response.setCity(request.getCity());

        Person person = new Person();
        person.setName(request.getName());
        person.setAge(request.getAge());
        person.setCity(request.getCity());
        personRepository.save(person);

        return response;
    }
}
