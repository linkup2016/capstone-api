package com.supplyonthefly.accounting.model;

import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class AccountingErrorObject {

    private String message;

    public AccountingErrorObject(String message) {
        this.message = message;

    }

    public String getMessage() {
        return this.message;
    }
}
