package com.supplyonthefly.accounting.resources;

import com.supplyonthefly.accounting.services.ReceivableService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("receivable")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReceivableResource {

    ReceivableService service = new ReceivableService();

    @GET
    public Response doGet() {
        return service.doGet();
    }

    /**
     *
     * @return
     */
    @PUT
    public Response doPut() {
        return service.doPut();
    }

    @DELETE
    public Response doDelete() {
        return service.doDelete();
    }

    @POST
    public Response doPost() {
        return service.doPost();
    }
}
