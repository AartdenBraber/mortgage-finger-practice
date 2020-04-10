package com.aart.mortgage;

public class Main {

    public static void main(String[] args) {
        int principalInput = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterestInput = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte yearsInput = (byte) Console.readNumber("Period (Years): ", 1, 30);

        var mortgageCalculator = new MortgageCalculator(principalInput, annualInterestInput, yearsInput);

        var mortgageReport = new MortgageReport(mortgageCalculator);
        mortgageReport.printMortgage();
        mortgageReport.printPaymentSchedule();
    }
}
