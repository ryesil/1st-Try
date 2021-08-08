
import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour {
  private int distance, hours, minutes;
  private double mph;

  public MilesPerHour() {
    setNums(0,0,0);
    mph = 0;
  }

  public MilesPerHour(int dist, int hrs, int mins) {
    distance = dist;
    hours = hrs;
    minutes = mins;
  }

  public void setNums(int dist, int hrs, int mins) {

  }

  public void calcMPH() {
    mph = Math.round((distance)/(hours + (minutes/60)));
  }

  public void print() {
    System.out.print(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + (int)mph + " MPH.");
  } 

  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(in);
    out.print("Enter the distance :: ");
    int dist = keyboard.nextInt();
    out.print("Enter the hours :: ");
    int hrs = keyboard.nextInt();

    out.print("Enter the minutes :: ");
    int mins = keyboard.nextInt();

    MilesPerHour test = new MilesPerHour(dist, hrs, mins);
    test.calcMPH();
    test.print();
  }
}