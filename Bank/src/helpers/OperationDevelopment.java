package helpers;

import agents.Agent;
import persons.Client;

import java.util.Random;

public class OperationDevelopment {
    private double deposit;
    private double min = 50000.0;
    private double max = 1000000.0;
    private double withdrawals;
    private boolean issueSolved;
    private Random r1;
    private Client client;
    private String message;


    public String depositOperation(Client client) {
        r1 = new Random();
        deposit = min + (max - min) * r1.nextDouble();
        System.out.println(client.getName());
        System.out.println("The actual balance is "+client.getBalance());
        System.out.println("The client wants to deposit: "+deposit);
        client.setBalance(client.getBalance()+deposit);
        return "The new balance of the client is " + client.getBalance()+"\n";
    }

    public String withdrawalOperation(Client client) {
        r1 = new Random();
        withdrawals = min + (max - min) * r1.nextDouble();
        System.out.println(client.getName());
        System.out.println("The actual balance is "+client.getBalance());
        System.out.println("The client wants to withdrawal: "+withdrawals);
        if (client.getBalance()>=withdrawals) {
            client.setBalance(client.getBalance() - withdrawals);
            message= "The new balance of the client is "+client.getBalance()+"\n";
        }else { message="There are not enough balance to withdrawal " + withdrawals+"\n";}
        return message;
    }

    public String issueOperation(Client client){
        r1 = new Random();
        System.out.println(client.getName());
        issueSolved = r1.nextBoolean();
        return "The issue presented is solved?:" + issueSolved+"\n";
    }


}
