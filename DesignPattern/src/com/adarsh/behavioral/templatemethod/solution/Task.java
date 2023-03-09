package com.adarsh.behavioral.templatemethod.solution;

public abstract class Task {
    private AuditTrail auditTrail;


    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        doExecute();
    }
    protected abstract void doExecute();
}
