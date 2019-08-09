package org.kostenko.examples.ee.template;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.kostenko.examples.ee.template.api.SomethingDto;
import org.kostenko.examples.ee.template.api.TestService;

/**
 * @author kostenko
 */
@Path("/")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TestEndpoint {

    @EJB(lookup = TestService.TOURNAMENT_SERVICE_JNDI)
    TestService testService;
    
    @GET
    @Path("/test")
    public Response test() {
        SomethingDto something = testService.doSomething();
        return Response.ok().entity(something.getMessage()).build();
    }
}
