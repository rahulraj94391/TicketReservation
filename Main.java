import com.sun.nio.sctp.AbstractNotificationHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        db db = new db();
        ArrayList<Train> listOfActiveTrains = new ArrayList<>();
        Mail chennaiMail = new Mail(12658, "Chennai Mail", db.chennaiMailTT, 0, 1, 1, 1, 0, 1);
        listOfActiveTrains.add(chennaiMail);
        SuperFast CSMTEgmore = new SuperFast(22157, "CSMT Egmore", db.mumbaiCSMT_ChennaiEgmoreTT, 0, 1, 1, 1, 0, 1);
        listOfActiveTrains.add(CSMTEgmore);

        Scanner sc = new Scanner(System.in);


        System.out.printf("%s", "TRAIN BOOKING SYSTEM");
        while (true) {
            System.out.println();
            System.out.println("1. View Trains");
            System.out.println("2. Train Route");
            System.out.println("3. Seat Availability");
            System.out.println("4. Book Train Ticket");
            System.out.println("5. Cancel Train Ticket");
            System.out.println("6. View Booked Ticket");
            System.out.println("7. Exit");
            System.out.print("Enter option : ");
            char ip = sc.next().charAt(0);
            int choice = 0;
            if (Character.isDigit(ip)) {
                choice = Integer.parseInt(String.valueOf(ip));
            }
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("--------------- Active Trains ---------------");
                    for (int i = 0; i < listOfActiveTrains.size(); i++) {
                        System.out.println( /*((i + 1) + ". ") +*/ listOfActiveTrains.get(i).getTrainNumber() + ":" + listOfActiveTrains.get(i).getTrainName());
                    }
                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    for (int i = 0; i < listOfActiveTrains.size(); i++) {
                        System.out.println(((i + 1) + ". ") + listOfActiveTrains.get(i).getTrainNumber() + ":" + listOfActiveTrains.get(i).getTrainName());
                    }
                    System.out.println("Enter train Number: ");
                    int trainNo = sc.nextInt();
                    for (int i = 0; i < listOfActiveTrains.size(); i++) {
                        if (listOfActiveTrains.get(i).getTrainNumber() == trainNo) {
                            timeTablePrinter(listOfActiveTrains.get(i).getRoute());
                        }
                    }
                    break;

                case 3:
                    for (int i = 0; i < listOfActiveTrains.size(); i++) {
                        System.out.println(((i + 1) + ". ") + listOfActiveTrains.get(i).getTrainNumber() + ":" + listOfActiveTrains.get(i).getTrainName());
                    }
                    System.out.print("Enter train number to check seat availability: ");
                    trainNo = sc.nextInt();
                    seatAvailability(listOfActiveTrains, trainNo);
                    break;

                case 4:
                    // code
                    for (int i = 0; i < listOfActiveTrains.size(); i++) {
                        System.out.println(((i + 1) + ". ") + listOfActiveTrains.get(i).getTrainNumber() + ":" + listOfActiveTrains.get(i).getTrainName());
                    }
                    System.out.print("Enter train number to book seat(s): ");
                    trainNo = sc.nextInt();
                    System.out.println("Booking category: \n 1. General\n 2. Tatkal");
                    String type = sc.next();
                    Train targetTrain = null;
                    System.out.println("------------- Available seats -------------");
                    for (int i = 0; i < listOfActiveTrains.size(); i++) {
                        if (listOfActiveTrains.get(i).getTrainNumber() == trainNo) {
                            seatAvailability(listOfActiveTrains, trainNo);
                            targetTrain = listOfActiveTrains.get(i);
                            break;
                        }
                    }
                    System.out.println("-------------------------------------------");



                    for (int i = 0; i < listOfActiveTrains.size(); i++) {
                        if (listOfActiveTrains.get(i).getTrainNumber() == trainNo) {
                            System.out.print("Enter no of passengers: ");
                            int noOfPassengers = sc.nextInt();
                            System.out.print("Enter contact number: ");
                            String contactNum = sc.nextLine();
                            sc.nextLine();
                            System.out.print("Enter eMail: ");
                            String eMail = sc.nextLine();
                            Ticket tk = new Ticket(contactNum, eMail);
                            for (int j = 0; j < noOfPassengers; j++) {
                                System.out.print("Enter name of passenger " + (j + 1));
                                String name = sc.nextLine();
                                System.out.print("Enter age of passenger " + (j + 1));
                                String age = sc.next();
                                System.out.print("Enter gender of passenger " + (j + 1));
                                String gender = sc.next();
                                tk.addPassengerToList(name, age, gender);
                                sc.nextLine();
                            }
                        }
                    }

                    break;

                case 5:
                    //code
                    break;
                case 6:

                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.print("Enter correct input");

            }

        }
    }

    public static void timeTablePrinter(ArrayList<ArrayList<String>> lst) {
        System.out.printf("%25s%15s%15s%15s", "Station Name", "Arri", "Halt", "Dept");
        System.out.println();
        for (int i = 0; i < lst.size(); i++) {
            System.out.printf("%25s%15s%15s%15s", lst.get(i).get(0), lst.get(i).get(1), lst.get(i).get(2), lst.get(i).get(3));
            System.out.println();
        }
    }

    public static void seatAvailability(ArrayList<Train> listOfActiveTrains, int trainNo) {
        for (int i = 0; i < listOfActiveTrains.size(); i++) {
            if (listOfActiveTrains.get(i).getTrainNumber() == trainNo) {
                if (listOfActiveTrains.get(i).getAC1_G() + listOfActiveTrains.get(i).getAC1_T() > 0) {
                    System.out.println("1 AC : " + (listOfActiveTrains.get(i).getAC1_G() + listOfActiveTrains.get(i).getAC1_T()) + " (General: " + listOfActiveTrains.get(i).getAC1_G() + ", Tatkal " + listOfActiveTrains.get(i).getAC1_T() + ")");
                }
                if (listOfActiveTrains.get(i).getAC2_G() + listOfActiveTrains.get(i).getAC2_T() > 0) {
                    System.out.println("2 AC : " + (listOfActiveTrains.get(i).getAC2_G() + listOfActiveTrains.get(i).getAC2_T()) + " (General: " + listOfActiveTrains.get(i).getAC2_G() + ", Tatkal " + listOfActiveTrains.get(i).getAC2_T() + ")");
                }
                if (listOfActiveTrains.get(i).getAC3_G() + listOfActiveTrains.get(i).getAC3_T() > 0) {
                    System.out.println("3 AC : " + (listOfActiveTrains.get(i).getAC3_G() + listOfActiveTrains.get(i).getAC3_T()) + " (General: " + listOfActiveTrains.get(i).getAC3_G() + ", Tatkal " + listOfActiveTrains.get(i).getAC3_T() + ")");
                }
                if (listOfActiveTrains.get(i).getSL_G() + listOfActiveTrains.get(i).getSL_T() > 0) {
                    System.out.println("SL : " + (listOfActiveTrains.get(i).getSL_G() + listOfActiveTrains.get(i).getSL_T()) + " (General: " + listOfActiveTrains.get(i).getSL_G() + ", Tatkal " + listOfActiveTrains.get(i).getSL_T() + ")");
                }
                if (listOfActiveTrains.get(i).getCC_G() + listOfActiveTrains.get(i).getCC_T() > 0) {
                    System.out.println("CC : " + (listOfActiveTrains.get(i).getCC_G() + listOfActiveTrains.get(i).getCC_T()) + " (General: " + listOfActiveTrains.get(i).getCC_G() + ", Tatkal " + listOfActiveTrains.get(i).getCC_T() + ")");
                }
                if (listOfActiveTrains.get(i).get_2S_G() + listOfActiveTrains.get(i).get_2S_T() > 0) {
                    System.out.println("2S : " + (listOfActiveTrains.get(i).get_2S_G() + listOfActiveTrains.get(i).get_2S_T()) + " (General: " + listOfActiveTrains.get(i).get_2S_G() + ", Tatkal " + listOfActiveTrains.get(i).get_2S_T() + ")");
                }
            }
        }
    }

}
