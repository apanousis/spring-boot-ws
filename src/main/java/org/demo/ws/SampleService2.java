package org.demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

@Component(value = "sampleService2")
@WebService(name = "SampleService2", portName = "SampleServicePort2")
public class SampleService2 {

    @WebMethod
    public String hello(@WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName) {
        return String.format("Hello %s %s!", firstName, lastName);
    }
}
