package operations;

import helpers.OperationDevelopment;
import persons.Client;

public class Operation {

    OperationDevelopment operationDevelopment;


    public void assignOperation(Client client) throws Exception {

        operationDevelopment = new OperationDevelopment();

        switch (client.getOperation()) {
            case 1:
                System.out.println(operationDevelopment.depositOperation(client));
                client.setAttended(true);
                break;

            case 2:
                System.out.println(operationDevelopment.withdrawalOperation(client));
                client.setAttended(true);
                break;

            case 3:
                System.out.println(operationDevelopment.issueOperation(client));
                client.setAttended(true);
                break;
            default:
                throw new Exception("Fail");
        }

    }


}
