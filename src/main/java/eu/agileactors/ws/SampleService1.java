package eu.agileactors.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

@Component(value = "sampleService1")
@WebService(name = "SampleService1", portName = "SampleServicePort1")
public class SampleService1 {

    @WebMethod
    public String hello(@WebParam(name = "firstName") String firstName, @WebParam(name = "lastName") String lastName) {
        return String.format("Hello %s %s!", firstName, lastName);
    }
}
