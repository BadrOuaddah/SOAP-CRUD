package com.example.SOAPCRUD;

import io.spring.guides.gs_producing_web_service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Optional;

@Endpoint
public class PersonEndpoints {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    @Autowired
    public PersonEndpoints(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addPersonRequest")
    @ResponsePayload
    public AddPersonResponse addPerson(@RequestPayload AddPersonRequest request) {
        AddPersonResponse response = new AddPersonResponse();
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

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonRequest")
    @ResponsePayload
    public GetPersonResponse getPerson(@RequestPayload GetPersonRequest request) {
        GetPersonResponse response = new GetPersonResponse();

        Optional<Person> personOptional = personRepository.findById((long) request.getId());

        if (personOptional.isPresent()) {
            response = personMapper.mapToPersonResponse(personOptional.get());
        } else {
            System.out.println("Person not found with id : " + request.getId());
        }

        return response;
    }

    // TODO: Error HTTP 404 !
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deletePersonRequest")
    @ResponsePayload
    public DeletePersonResponse deletePerson(@RequestPayload DeletePersonRequest request) {
        DeletePersonResponse response = new DeletePersonResponse();

        Optional<Person> personOptional = personRepository.findById((long) request.getId());

        if (personOptional.isPresent()) {
            personRepository.deleteById((long) request.getId());
            response.setStatus(Status.SUCCESS);
        } else {
            response.setStatus(Status.FAILURE);
        }
        return response;
    }
}
