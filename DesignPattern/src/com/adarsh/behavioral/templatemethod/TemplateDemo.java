package com.adarsh.behavioral.templatemethod;


import com.adarsh.behavioral.templatemethod.solution.AuditTrail;
import com.adarsh.behavioral.templatemethod.solution.Task;
import com.adarsh.behavioral.templatemethod.solution.TransferMoney;

public class TemplateDemo {
    public static void main(String[] args) {
        // Banking operation application
        // Transfer Money
        // Generate Report
        Task task = new TransferMoney(new AuditTrail());
        task.execute(); // here we do not see doExecute method because of protected access modifiers
    }
}
