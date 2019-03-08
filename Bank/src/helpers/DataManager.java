package helpers;

import agents.Agent;
import agents.Cashier;
import agents.Director;
import agents.Supervisor;
import persons.Client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class DataManager {
    public static List<Client> clients=new ArrayList<>();
    public static List<Director> director=new ArrayList<Director>();
    public static List<Supervisor> supervisors= new ArrayList<Supervisor>();
    public static List<Cashier> cashiers=new ArrayList<Cashier>();
    public static List<Agent> agents=new ArrayList<Agent>();



    public static List<Client> readClients() throws FileNotFoundException {
        try {
            File clientsFile = new File(System.getProperty("user.dir") + "/clients.txt");
            FileReader fileReader = new FileReader(clientsFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] credentials = line.split(",");
                clients.add(new Client(credentials[0],
                        credentials[1],
                        Long.parseLong(credentials[2]),
                        credentials[3],
                        Double.parseDouble(credentials[4]),
                        Boolean.parseBoolean(credentials[5]),
                        Integer.parseInt(credentials[6])
                        ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clients;
    }

    public static List<Director> readDirector() throws FileNotFoundException {
        try {
            File directorFile = new File(System.getProperty("user.dir") + "/director.txt");
            FileReader fileReader = new FileReader(directorFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] credentials = line.split(",");
                director.add(new Director(credentials[0],
                        credentials[1],
                        Long.parseLong(credentials[2]),
                        Integer.parseInt(credentials[3]),
                        Boolean.parseBoolean(credentials[4])));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return director;
    }

    public static List<Supervisor> readSupervisors() throws FileNotFoundException {

        try {
            File supervisorsFile = new File(System.getProperty("user.dir") + "/supervisors.txt");
            FileReader fileReader = new FileReader(supervisorsFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] credentials = line.split(",");
                supervisors.add(new Supervisor(credentials[0],
                        credentials[1],
                        Long.parseLong(credentials[2]),
                        Integer.parseInt(credentials[3]),
                        Boolean.parseBoolean(credentials[4])));
            }
//            for(Supervisor su: supervisors){
//                agents.add(su);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return supervisors;
    }

    public static List<Cashier> readCashiers() throws FileNotFoundException {

        try {
            File cashiersFile = new File(System.getProperty("user.dir") + "/cashiers.txt");
            FileReader fileReader = new FileReader(cashiersFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] credentials = line.split(",");
                cashiers.add(new Cashier(credentials[0],
                        credentials[1],
                        Long.parseLong(credentials[2]),
                        Integer.parseInt(credentials[3]),
                        Boolean.parseBoolean(credentials[4])));
            }
//            for(Cashier ca: cashiers){
//                agents.add(ca);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cashiers;
    }
}
