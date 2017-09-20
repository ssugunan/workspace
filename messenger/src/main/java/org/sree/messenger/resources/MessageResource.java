package org.sree.messenger.resources;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.sree.messenger.service.MessageService;
import org.sree.messenger.model.Message;
import java.util.List;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
@Path("/messages")
public class MessageResource {
	
	MessageService ms = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(@QueryParam("year") int year,@QueryParam("start")@DefaultValue("-1") Integer start){
		return ms.getAllMessages();
	}
	
	@Path("/{msgid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("msgid") long id)
	{
		return ms.getMessage(id);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Message addMessage(Message msg)
	{
		return ms.addMessage(msg);
	}
	
	@PUT 
	@Path("/{msgid}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	
	public Message updateMessage(@PathParam("msgid") long id,Message msg)
	{
		msg.setId(id);
		return ms.updateMessage(msg);
	}
	
	@DELETE
	@Path("/{msgid}")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Message deleteMessage(@PathParam("msgid") long id)
	{
		return ms.removeMessage(id);
	}
	
}
