package com.roomcorp.market.endpoint;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 */

@Component
@Scope("singleton")
@Path("/cheer/")
public class EndPoint {
  @GET
  @Path("hello")
  public Response  sayHello (){
    System.out.println("MENSAJE: LLegó a endpoint");
    return Response.status(200).entity("Hello " ).build();
  }
}

