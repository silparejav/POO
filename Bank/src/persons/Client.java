package persons;

import java.util.HashMap;
import java.util.Map;

public class Client extends Person {
    private String cardNumber;
    private double balance;
    private boolean attended;
    private int operation;

    public Client(String name, String lastName, long cc, String cardNumber, double balance, boolean attended, int operation) {
        super(name, lastName, cc);
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.attended = attended;
        this.operation = operation;
    }

    public long cc() {
        return cc;
    }

    public void attended() {
        this.attended = true;
    }

    public void setAttended(boolean attended) {
        this.attended = attended;
    }

    public boolean isAttended() {
        return attended;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getOperation() {
        return operation;
    }
}

