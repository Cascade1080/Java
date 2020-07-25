import java.util.Arrays;
import java.util.ArrayList;

public class TransitCalculator {
    double payPerRide = 2.75;
    double sevenDayUnL = 33.00;
    double thirtyDayUnL = 127.00;
    int days;
    int rides;

    public TransitCalculator(int daysTraveling, int ridesGoing){
            days = daysTraveling;
            rides = ridesGoing;
    }
    public double thirtyDayPrice(){
        double thirtyDay = days / 30.00;
        double rounded = Math.ceil(thirtyDay);
        double thirtyDayP = rounded * thirtyDayUnL;
        double perRide = thirtyDayP / rides;
        return perRide;
    }
    public double unlimited7Price(){
        double sevenDay = days / 7.0;
        double rounded = Math.ceil(sevenDay);
        double sevenDayPrice = rounded * sevenDayUnL;
        double perRide = sevenDayPrice / rides;
        return perRide;
    }
    public ArrayList<Double> getRidePrices(){
        ArrayList ridesList = new ArrayList<Double>();

        Double perRide = rides * payPerRide; //calculates fees per ride
        ridesList.add(perRide);

        ridesList.add(unlimited7Price()); //calculates fees per ride using the 7 day unlimited pass

        ridesList.add(thirtyDayPrice()); //calculates fees per ride using the 30 day pass

        return ridesList;
    }
    public String getBestFare(){
        String statement;
        Double perRide = rides * payPerRide;
        Double unlimitedSeven = unlimited7Price();
        Double thirtyDayPrice = thirtyDayPrice();

        if (perRide > unlimitedSeven && perRide < thirtyDayPrice){
            statement = "You should pay per ride at $" + perRide + " per ride";
        }else if (unlimitedSeven < perRide && unlimitedSeven < thirtyDayPrice) {
            statement = "You should get the 7 Day Pass at $" + unlimitedSeven + " per ride";
        }else {
            statement = "You should get the 30 Day Pass at $" + thirtyDayPrice + " per ride";
        }

        return statement;
    }

    public static void main(String[] args){
        TransitCalculator sm = new TransitCalculator(5, 10);
        System.out.println(sm.unlimited7Price());
        System.out.println(sm.getRidePrices());
        System.out.println(sm.getBestFare());
    }
}
