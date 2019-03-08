import agents.Cashier;
import agents.Director;
import agents.Supervisor;
import helpers.DataManager;
import operations.Operation;
import persons.Client;

import java.io.FileNotFoundException;
import java.util.List;

public class Dispatcher {


    public void attend() throws Exception {
        List<Client> clients = DataManager.readClients();
        List<Cashier> cashiers = DataManager.readCashiers();
        List<Supervisor> supervisors = DataManager.readSupervisors();
        List<Director> directors = DataManager.readDirector();


        for (Client client : clients) {
            Operation operation = new Operation();
            operation.assignOperation(client);
            for (Cashier cashier : cashiers) {
                if (cashier.availability() && !client.isAttended()) {
                    cashier.attend(client);
                }
            }
            for (Supervisor supervisor : supervisors) {
                if (supervisor.availability() && !client.isAttended()) {
                    operation.assignOperation(client);
                    supervisor.attend(client);
                }
            }
            for (Director director : directors) {
                if (director.availability() && !client.isAttended()) {
                    director.attend(client);
                }
            }

        }
    }

}

