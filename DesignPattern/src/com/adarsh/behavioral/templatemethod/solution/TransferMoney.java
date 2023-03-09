package com.adarsh.behavioral.templatemethod.solution;

public class TransferMoney extends Task{

    public TransferMoney(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }
}
