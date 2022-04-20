import java.util.ArrayList;

public class Ticket {
    private long pnr;
    private String contactNumber;
    private String email;
    private ArrayList<ArrayList<String>> listOfPassangers;



    Ticket(String contactNumber, String email) {
        pnr = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
        listOfPassangers = new ArrayList<>();
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public void addPassengerToList(String name, String age, String gender) {
        ArrayList<String> temp = new ArrayList<>();
        temp.add(name);
        temp.add(age);
        temp.add(gender);
        this.listOfPassangers.add(temp);
    }


}
