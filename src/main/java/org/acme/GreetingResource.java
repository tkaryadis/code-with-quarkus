package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

//Method1 using a class made from Clojure
import testing.MyClass;

//Method2 using java to call clojure
import static org.acme.Interop.*;

@Path("/hello")
public class GreetingResource {

    //in both cases going to localhost:8080/hello will cause error, Clojure classes not visable from Quarkus

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {

        //Method1 using a class made from Clojure
        MyClass m=new MyClass();
        m.foo(1);

        //Method2 using java to call clojure
        //bar();

        return "Hello from RESTEasy Reactive";
    }
}
