package fourwheeler;
import com.automobile.vehicle;
import twowheeler.hero;
import twowheeler.Honda;
import fourwheeler.Ford;
import fourwheeler.Logan;
public class package4 {
		// TODO Auto-generated method stub
		    public static void main(String[] args) {
		        hero   bike   = new hero("Splendor Plus", "KA123", "Dhoni", 65);
		        Honda  honda  = new Honda("City ZX",       "MH456", "Virat", 90);
		        Logan  logan  = new Logan("Renault Logan", "AP789", "Rohit", 80);
		        Ford   ford = new Ford("EcoSport",     "TN023", "Sachin", 85);
		        System.out.println("\n=== HERO BIKE ===");
		        printInfo(bike);
		        System.out.println("Current speed : " + bike.getSpeed() + " km/h");
		        bike.radio();
		        System.out.println("\n=== HONDA CAR ===");
		        printInfo(honda);
		        System.out.println("Current speed : " + honda.getSpeed() + " km/h");
		        honda.cdplayer();
		        System.out.println("\n=== LOGAN CAR ===");
		        printInfo(logan);
		        System.out.println("Current speed : " + logan.getspeed() + " km/h");
		        logan.gps();
		        System.out.println("\n=== FORD CAR ===");
		        printInfo(ford);
		        System.out.println("Current speed : " + ford.getspeed() + " km/h");
		        ford.tempControl();

	}
		     static void printInfo(vehicle v) {
		        System.out.println("Model       : " + v.getmodelName());
		        System.out.println("Reg Number  : " + v.getregistrationNumber());
		        System.out.println("Owner       : " + v.getownerName());
		    }
}