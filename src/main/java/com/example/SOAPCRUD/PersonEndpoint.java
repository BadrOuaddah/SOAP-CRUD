package com.example.SOAPCRUD;

import io.spring.guides.gs_producing_web_service.GetPersonRequest;
import io.spring.guides.gs_producing_web_service.GetPersonResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PersonEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonRequest")
    @ResponsePayload
    public GetPersonResponse getPerson(@RequestPayload GetPersonRequest request) {
        GetPersonResponse response = new GetPersonResponse();
        response.setName(request.getName());
        response.setAge(request.getAge());
        response.setCity(request.getCity());
        return response;
    }
}
