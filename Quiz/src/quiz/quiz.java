package quiz;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the height for female in feet:");
		int feetf=input.nextInt();
		System.out.print("Enter the height for female in inch:");
		int inchf=input.nextInt();
		System.out.println("The Height of Female in feet and inch:"+feetf+"feet"+inchf+"inch");
		int totalinchf;
		totalinchf=feetf*12 + inchf;
		System.out.println("The Total Inch of female in Height:" + totalinchf);
		int idealweightf;
		int overfeetf=feetf-5;
		idealweightf= 40 + overfeetf*12 + inchf*5;
		System.out.println("The ideal weight of female:" + idealweightf + "kg\n");
		
		System.out.print("Enter the height for male in feet:");
		int feetm=input.nextInt();
		System.out.print("Enter the height for male in inch:");
		int inchm=input.nextInt();
		System.out.println("The Height of Male in feet and inch:"+feetm+"feet"+inchm+"inch");
		
		int totalinchm;
		totalinchm=feetm*12 + inchm;
		System.out.println("The Total Inch of male in Height:" + totalinchm);
		int idealweightm;
		int overfeetm=feetm-5;
		idealweightm= 50 + (overfeetm*12+inchm)*6;
		System.out.println("The ideal weight of male:" + idealweightm + "kg");
		

	}

}
