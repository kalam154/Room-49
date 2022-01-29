package dbs;
import java.util.*;
import java.io.*;
public class Dbs {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("want csv enter 1");
		System.out.println("want for your own dataset enter 2");
		int T=sc.nextInt();
		if(T==1) {
			csv();
		}
		else {
			userInput();
		}
	}
	public static void csv() {
		BufferedReader br = new BufferedReader(new FileReader("D:\DATA SET\Room-49-main\cust")); 		
		
		
	}
	public static void userInput() {
		System.out.println("please mention tranactions made ");
		System.out.println("press 1 if done in a high risk country");
		System.out.println("press 2 if done in a non-high risk country");
		int country=sc.nextInt();
		boolean flag=false;
		if(country==1) {
			flag=true;
		}
		System.out.println("enter no transactions in a month");
		int Number=sc.nextInt();
		System.out.println("enter sum of incomming money in a month");
		int Moneyin=sc.nextInt();
		System.out.println("enter sum of outgoing money in a month");
		int Moneyout=sc.nextInt();
		System.out.println("enter no of transactions in a day");
		int dayTransaction=sc.nextInt();
		if(flag&&(Number>10||Moneyin>1000||Moneyout>=800||dayTransaction>=20)) {
			System.out.println("High Risk");
		}
		else if(Number>6||(Moneyin<=1000&&Moneyin>600)||(Moneyout<=800&&Moneyout>500)||dayTransaction<20&&dayTransaction>=10) {
			System.out.println("Medium Risk");
		}
		else if(!flag&&(Number>10||Moneyin<=600||Moneyout<=500||dayTransaction<10)) {
			System.out.println("Low Risk");
		}
		else {
			System.out.println("No risk");
		}
		
	}

}
