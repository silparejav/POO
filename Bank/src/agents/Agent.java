package agents;

import operations.Operation;
import persons.Client;
import persons.Person;

public abstract class Agent extends Person {

    private int code;
    public boolean available;


    public Agent(String name, String lastName, long cc, int code, boolean available) {
        super(name, lastName, cc);
        this.code = code;
        this.available = available;
    }

    public void attend(Client client) throws Exception {
        available = false;
        Operation operation = new Operation();
        operation.assignOperation(client);
    }

    public int getCode() {
        return code;
    }

    public boolean availability() {
        return available;
    }
}
