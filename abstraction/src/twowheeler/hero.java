package twowheeler;
import com.automobile.vehicle;
public class hero extends vehicle {
   String modelName;
  String registrationNumber;
String ownerName;
int currentSpeed;
 public hero(String modelName,String registrationNumber,String ownerName,int currentSpeed){
	 this.modelName=modelName;
	 this.registrationNumber=registrationNumber;
	 this.ownerName=ownerName;
	 this.currentSpeed=currentSpeed;
 }
 public String getmodelName() {
	 return modelName;
 }
 public String getregistrationNumber() {
	 return registrationNumber;
 }
 public String getownerName() {
	 return ownerName;
 }
 public int getSpeed() {
	 return currentSpeed;
}
 public void radio() {
	 System.out.println("Hero Radio is playing FM 101.43 MHZ");
 }
}