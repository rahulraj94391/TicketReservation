import java.util.ArrayList;

public class SuperFast extends Train {

    private float price2AC = 2175;
    private float price3AC = 1560;
    private float priceSL = 595;
    private float price_2S = 355;

    public SuperFast(int trainNumber, String trainName, ArrayList<ArrayList<String>> route, int AC1, int AC2, int AC3, int SL, int CC, int _2S) {
        super(trainNumber, trainName, route, AC1, AC2, AC3, SL, CC, _2S);
    }

    float calculateFare(String type, String category, int noOfSeats) {
        float total = 0;
        if (type.equals("general") || type.equals("Gen") || type.equals("gen")) {
//            if(category.equals("AC1")){
//
//            }
            if (category.equals("AC2")) {
                total = price2AC * noOfSeats;
            } else if (category.equals("AC3")) {
                total = price3AC * noOfSeats;
            } else if (category.equals("SL")) {
                total = priceSL * noOfSeats;
            }
//            else if(category.equals("CC")){
//
//            }
            else if (category.equals("2S")) {
                total = price_2S * noOfSeats;
            }
        } else {
            if (category.equals("AC2")) {

            } else if (category.equals("AC3")) {

            } else if (category.equals("SL")) {

            } else if (category.equals("2S")) {

            }
        }
        return total;
    }

    public String availableClassesToBook() {
        return "2AC \n 3AC \n Sl \n 2S";
    }


}
