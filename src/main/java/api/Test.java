package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/")
public class Test {
	
	@Path("/test/{someparam}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test(@PathParam("someparam") int someparam){
		return "the number is" + someparam;
	}
	
	@Path("/getfileinfo/{fileId}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getFileInfo(@PathParam("fileId") int fileId){
		return new JSONObject().put("filename","test_file_1.txt").put("timeleft",250001).toString();
	}
	
	@Path("/getfile/{fileId}")
	@GET
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response getFile(@PathParam("fileId") int fileId){
		return Response.status(404).build();
	}

}
