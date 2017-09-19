package com.supplyonthefly.accounting.services;

import com.supplyonthefly.accounting.model.AccountingErrorObject;

import javax.ws.rs.core.Response;

public class ReceivableService {
    public Response doGet() {
        return Response
                .ok()
                .entity(new AccountingErrorObject("GET not implemented yet!"))
                .build();
    }

    public Response doPut() {
        return Response
                .ok()
                .entity(new AccountingErrorObject("PUT not implemented yet!"))
                .build();
    }

    public Response doDelete() {
        return Response
                .ok()
                .entity(new AccountingErrorObject("DELETE not implemented yet!"))
                .build();
    }

    public Response doPost() {
        return Response
                .ok()
                .entity(new AccountingErrorObject("POST not implemented yet!"))
                .build();
    }
}
