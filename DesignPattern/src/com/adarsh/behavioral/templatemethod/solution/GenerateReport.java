package com.adarsh.behavioral.templatemethod.solution;

public class GenerateReport extends Task{


    public GenerateReport(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Genrerate report");
    }
}
