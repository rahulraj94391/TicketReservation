import java.util.ArrayList;

class db {
    static ArrayList<ArrayList<String>> mumbaiCSMT_ChennaiEgmoreTT = new ArrayList<>();
    static ArrayList<ArrayList<String>> chennaiMailTT = new ArrayList<>();


    db(){

        ArrayList<String> lst = new ArrayList<>();
        lst.add("C SHIVAJI MAH T");  // Name
        lst.add("--");               // Arrives
        lst.add("--");               // Halt
        lst.add("22:55");            // depart
        mumbaiCSMT_ChennaiEgmoreTT.add(lst);

        ArrayList<String> lst2 = new ArrayList<>();
        lst2.add("PUNE JN");
        lst2.add("02:50");
        lst2.add("05:00");
        lst2.add("22:55");
        mumbaiCSMT_ChennaiEgmoreTT.add(lst2);

        ArrayList<String> lst3 = new ArrayList<>();
        lst3.add("SOLAPUR JN");  // Name
        lst3.add("06:50");               // Arrives
        lst3.add("05:00");               // Halt
        lst3.add("06:55");            // depart
        mumbaiCSMT_ChennaiEgmoreTT.add(lst3);

        ArrayList<String> lst4 = new ArrayList<>();
        lst4.add("KRISHNA");  // Name
        lst4.add("10:58");               // Arrives
        lst4.add("02:00");               // Halt
        lst4.add("11:00");            // depart
        mumbaiCSMT_ChennaiEgmoreTT.add(lst4);

        ArrayList<String> lst5 = new ArrayList<>();
        lst5.add("RENIGUNTA JN");  // Name
        lst5.add("19:15");               // Arrives
        lst5.add("05:00");               // Halt
        lst5.add("19:20");            // depart
        mumbaiCSMT_ChennaiEgmoreTT.add(lst5);

        ArrayList<String> lst6 = new ArrayList<>();
        lst6.add("CHENNAI EGMORE");  // Name
        lst6.add("22:15");               // Arrives
        lst6.add("--");               // Halt
        lst6.add("--");            // depart
        mumbaiCSMT_ChennaiEgmoreTT.add(lst6);

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Bangalore Cy Junction");  // Name
        l1.add("--");               // Arrives
        l1.add("--");               // Halt
        l1.add("22:40");            // depart
        chennaiMailTT.add(l1);

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("Bangalore Cant");
        l2.add("22:50");
        l2.add("02:00");
        l2.add("22:52");
        chennaiMailTT.add(l2);

        ArrayList<String> l3 = new ArrayList<>();
        l3.add("Bangarapet");  // Name
        l3.add("23:43");               // Arrives
        l3.add("02:00");               // Halt
        l3.add("23:45");            // depart
        chennaiMailTT.add(l3);

        ArrayList<String> l4 = new ArrayList<>();
        l4.add("Jolarpettai");  // Name
        l4.add("23:43");               // Arrives
        l4.add("02:00");               // Halt
        l4.add("23:45");            // depart
        chennaiMailTT.add(l4);

        ArrayList<String> l5 = new ArrayList<>();
        l5.add("Katpadi Junction");  // Name
        l5.add("02:08");               // Arrives
        l5.add("02:00");               // Halt
        l5.add("02:10");            // depart
        chennaiMailTT.add(l5);

        ArrayList<String> l6 = new ArrayList<>();
        l6.add("Arakkonam");  // Name
        l6.add("02:08");               // Arrives
        l6.add("02:00");               // Halt
        l6.add("02:10");            // depart
        chennaiMailTT.add(l6);

        ArrayList<String> l7 = new ArrayList<>();
        l7.add("Perembur");  // Name
        l7.add("03:48");               // Arrives
        l7.add("02:00");               // Halt
        l7.add("03:50");            // depart
        chennaiMailTT.add(l7);

        ArrayList<String> l8 = new ArrayList<>();
        l8.add("Chennai Central");  // Name
        l8.add("04:40");               // Arrives
        l8.add("--");               // Halt
        l8.add("--");            // depart
        chennaiMailTT.add(l8);




    }

    public void ptintttr(){
        System.out.println("method called in constructor");
    }



}