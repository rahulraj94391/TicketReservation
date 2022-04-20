import java.util.ArrayList;

public class Train {
    private int trainNumber;
    private String trainName;
    private ArrayList<ArrayList<String>> route;
    private int AC1Coach = -1;
    private int AC1_G = -1;
    private int AC1_T = -1;
    private int AC1Seats;
    private int AC2Coach = -1;
    private int AC2_G = -1;
    private int AC2_T = -1;
    private int AC2Seats;
    private int AC3Coach = -1;
    private int AC3_G = -1;
    private int AC3_T = -1;
    private int AC3Seats;
    private int SLCoach = -1;
    private int SL_G = -1;
    private int SL_T = -1;
    private int SLSeats;
    private int CCCoach = -1;
    private int CC_G = -1;
    private int CC_T = -1;
    private int CCSeats;
    private int _2SCoach = -1;
    private int _2S_G = -1;
    private int _2S_T = -1;
    private int _2SSeats;
    private ArrayList<Ticket> bookings;

    // Seats
    Train(int trainNumber, String trainName, ArrayList<ArrayList<String>> route, int AC1Coach, int AC2Coach, int AC3Coach, int SLCoach, int CCCoach, int _2SCoach) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.route = route;
        this.bookings = new ArrayList<>();
        // seats
        if (AC1Coach != 0) {
            this.AC1Coach = AC1Coach;
            this.AC1_G = 17 * AC1Coach;
            this.AC1_T = 5 * AC1Coach;
            this.AC1Seats = this.AC1_G + this.AC1_T;
        }
        if (AC2Coach != 0) {
            this.AC2Coach = AC2Coach;
            this.AC2_G = 36 * AC2Coach;
            this.AC2_T = 10 * AC2Coach;
            this.AC2Seats = this.AC2_G + this.AC2_T;
        }
        if (AC3Coach != 0) {
            this.AC3Coach = AC3Coach;
            this.AC3_G = 48 * AC3Coach;
            this.AC3_T = 16 * AC3Coach;
            this.AC3Seats = this.AC3_T + this.AC3_G;
        }
        if (SLCoach != 0) {
            this.SLCoach = SLCoach;
            this.SL_G = 51 * SLCoach;
            this.SL_T = 21 * SLCoach;
            this.SLSeats = this.SL_T + this.SL_G;
        }
        if (CCCoach != 0) {
            this.CCCoach = CCCoach;
            this.CC_G = 57 * CCCoach;
            this.CC_T = 16 * CCCoach;
            this.CCSeats = this.CC_G + this.CC_T;
        }
        if (_2SCoach != 0) {
            this._2SCoach = _2SCoach;
            this._2S_G = 97 * _2SCoach;
            this._2S_T = 11 * _2SCoach;
            this._2SSeats = this._2S_G + this._2S_T;
        }
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public ArrayList<ArrayList<String>> getRoute() {
        return route;
    }

    public int getAC1Coach() {
        return AC1Coach;
    }

    public int getAC1_G() {
        return AC1_G;
    }

    public int getAC1_T() {
        return AC1_T;
    }

    public int getAC2Coach() {
        return AC2Coach;
    }

    public int getAC2_G() {
        return AC2_G;
    }

    public int getAC2_T() {
        return AC2_T;
    }

    public int getAC3Coach() {
        return AC3Coach;
    }

    public int getAC3_G() {
        return AC3_G;
    }

    public int getAC3_T() {
        return AC3_T;
    }

    public int getSLCoach() {
        return SLCoach;
    }

    public int getSL_G() {
        return SL_G;
    }

    public int getSL_T() {
        return SL_T;
    }

    public int getCCCoach() {
        return CCCoach;
    }

    public int getCC_G() {
        return CC_G;
    }

    public int getCC_T() {
        return CC_T;
    }

    public int get_2SCoach() {
        return _2SCoach;
    }

    public int get_2S_G() {
        return _2S_G;
    }

    public int get_2S_T() {
        return _2S_T;
    }

    public int getAC1Seats() {
        return AC1Seats;
    }

    public int getAC2Seats() {
        return AC2Seats;
    }

    public int getAC3Seats() {
        return AC3Seats;
    }

    public int getSLSeats() {
        return SLSeats;
    }

    public int getCCSeats() {
        return CCSeats;
    }

    public int get_2SSeats() {
        return _2SSeats;
    }


}
