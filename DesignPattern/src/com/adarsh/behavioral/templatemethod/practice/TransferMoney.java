package com.adarsh.behavioral.templatemethod.practice;

public class TransferMoney {
    private AuditTrail auditTrail;

    public TransferMoney(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();

        System.out.println("transfer money");
    }
}
