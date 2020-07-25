public class Continents {
    // Continents.java prints out a continent and the largest city in that continent based on the value of an integer
    // Instance Fields
    int continent;
    // Constructor Method
    public Continents(int place){
        continent = place;
    }
    public void confirmPlace(){

        switch(continent) {
            case 1:
                continent = 1;
                System.out.println("North America: Mexico City, Mexico");
                break;
            case 2:
                continent = 2;
                System.out.println("South America: Sao Paulo, Brazil");
                break;
            case 3:
                continent = 3;
                System.out.println("Europe: Moscow, Russia");
                break;
            case 4:
                continent = 4;
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5:
                continent = 5;
                System.out.println("Asia: Shanghai, China");
                break;
            case 6:
                continent = 6;
                System.out.println("Australia: Sydney, Australia");
                break;
            case 7:
                continent = 7;
                System.out.println("Antarctica: McMurdo Station, US");
                break;
            default:
                System.out.println("Undefined Continent");
                break;
        }
    }

    // Main Method
    public static void main(String[] args){
        Continents continentA = new Continents(4);
        Continents continentB = new Continents(9);
        Continents continentC = new Continents(1);
        continentA.confirmPlace();
        continentB.confirmPlace();
        continentC.confirmPlace();
        System.out.println("Have a great trip!");
    }


}
