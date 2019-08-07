package org.kostenko.examples.ee.gradle;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author kostenko
 */
@Path("/")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TestEndpoint {

    @GET
    @Path("/test")
    public Response test() {
        return Response.ok().build();
    }
}
