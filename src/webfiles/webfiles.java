/**
 * 
 */
package webfiles;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * @author myrlyn
 *
 */
//appended to /webfiles/api/hello
@Path("/")
public class webfiles {

	/**
	 * 
	 */
	public webfiles() {
		// TODO Auto-generated constructor stub
	}
	  @GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
	    return "Hello Jersey";
	  }

	  // This method is called if XML is request
	  @GET
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHello() {
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	  }

	  // This method is called if HTML is request
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"
	        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
	  }
	  @POST
	  @Produces(MediaType.APPLICATION_JSON)
	  @Path("/test")
	  public String test(){
		  return ("{}");
	  }

}
