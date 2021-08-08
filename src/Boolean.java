
public class Boolean {

	public static void main(String[] args) {
		System.out.println("True or Falsa?");
		System.out.println("you can fit all of the ten chubies");
		System.out.println("on the elevator.");
		int ElevatorCapacity = 1400, WeightOfaChubby = 150 ;
		int NumberOfChubby = 10;
		int NumberOfPeopleOnTheElevator = ElevatorCapacity / WeightOfaChubby;
		System.out.print("Number of people can fit on the elevator=");
		System.out.println(NumberOfPeopleOnTheElevator);
		System.out.print("Number of Chubbies=");
		System.out.println(NumberOfChubby);
		boolean CanTheyFit = NumberOfChubby <= NumberOfPeopleOnTheElevator ;
		System.out.print(CanTheyFit);		
		
	}
}
