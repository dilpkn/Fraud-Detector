package org.example;

class FraudRule1 implements FraudRule {
    @Override
        public boolean Rule(Transaction transaction) {
            return transaction.getTrader().getCity().equals("Sydney");
        }
    @Override
        public String getRuleName() {
        return "FraudRule1";
    }
}

class FraudRule2 implements FraudRule {
    @Override
    public boolean Rule(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Germany") && (transaction.getAmount() > 1000);
    }
    @Override
    public String getRuleName() {
        return "FraudRule2";
    }
}

class FraudRule3 implements FraudRule {
    @Override
    public boolean Rule(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }
    @Override
    public String getRuleName() {
        return "FraudRule3";
    }
}

class FraudRule4 implements FraudRule {
    @Override
    public boolean Rule(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
    @Override
    public String getRuleName() {
        return "FraudRule4";
    }
}

class FraudRule5 implements FraudRule {
    @Override
    public boolean Rule(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Jamaica");
    }
    @Override
    public String getRuleName() {
        return "FraudRule5";
    }
}