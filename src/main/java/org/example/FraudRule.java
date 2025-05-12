package org.example;

public interface FraudRule {
    boolean Rule(Transaction transaction);
    String getRuleName();
}
