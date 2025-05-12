package org.example;

public class FraudDetector {
    private FraudRule1 fraudRule1 = new FraudRule1();
    private FraudRule2 fraudRule2 = new FraudRule2();
    private FraudRule3 fraudRule3 = new FraudRule3();
    private FraudRule4 fraudRule4 = new FraudRule4();
    private FraudRule5 fraudRule5 = new FraudRule5();

    FraudDetectionResult isFraud(Transaction transaction){
        if(fraudRule1.Rule(transaction)){
            return new FraudDetectionResult(true,"FraudRule1");
        }
        if(fraudRule2.Rule(transaction)){
            return new FraudDetectionResult(true,"FraudRule2");
        }
        if(fraudRule3.Rule(transaction)){
            return new FraudDetectionResult(true,"FraudRule3");
        }
        if(fraudRule4.Rule(transaction)){
            return new FraudDetectionResult(true,"FraudRule4");

        if(fraudRule5.Rule(transaction)){
            return new FraudDetectionResult(true,"FraudRule5");
        }
        return new FraudDetectionResult(false, null);
    }
}
