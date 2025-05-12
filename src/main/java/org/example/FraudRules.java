package org.example;

class FraudRule1 implements FraudRule {
    @Override
        public boolean Rule(Transaction transaction) {
            return transaction.getTrader().getCity().equals("Sydney");
        }
}

class FraudRule2 implements FraudRule {
    @Override
    public boolean Rule(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Germany") && (transaction.getAmount() > 1000);
    }
}

class FraudRule3 implements FraudRule {
    @Override
    public boolean Rule(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }
}

class FraudRule4 implements FraudRule {
    @Override
    public boolean Rule(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}

class FraudRule5 implements FraudRule {
    @Override
    public boolean Rule(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Jamaica");
    }
}