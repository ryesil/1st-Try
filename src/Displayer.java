import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;
public class Displayer {
public static void main(String args[]) {
System.out.println("you will love Java!!");
int apple , banana;
apple = 12;
banana = 21;
int totalFruits = apple + banana ;

System.out.println("you have a total " + totalFruits + " number of fruits.");

double rate = 20.21, pay ;
int hour = 4;
pay = rate*hour;
out.println("since you worked " + hour + " hours," + " you have earned " + pay + " dollars.");
Scanner keyboard = new Scanner(in);
out.print("enter the value");
double total = keyboard.nextDouble();
double quarters = total/0.25;
double qleft = total%0.25;
double dimes = qleft/0.10;
double dleft = qleft%0.10;
double nickels = dleft/0.05;
double WhatIsleft = dleft/0.01;
out.print(qleft + dleft + WhatIsleft);

}
}
