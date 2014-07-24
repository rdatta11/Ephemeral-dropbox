package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class Test {
	
	@Path("/test/{someparam}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test(@PathParam("someparam") int someparam){
		return "the number is" + someparam;
	}

}
