package com.adarsh.behavioral.observer.example2;

public class ObserverDemo2 {
    public static void main(String[] args) {
        Subject subject = new DataSource();

        SpreadSheet spreadSheet = new SpreadSheet(subject);
        Chart chart = new Chart(subject);

        spreadSheet.changeValue(5);
        chart.changeValue(10);

    }
}
