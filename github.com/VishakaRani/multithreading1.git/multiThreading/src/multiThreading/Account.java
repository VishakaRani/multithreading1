package multiThreading;
import java.util.Scanner;
public class Account {
	static int Balance =10000;
	public static void main(String[]args) {
		AClass oa = new AClass();
		DepositThread dt1 = new DepositThread(oa,5000,"first");
		DepositThread dt2 = new DepositThread(oa,4000,"second");
		withdrawThread wt1 = new withdrawThread(oa,1000,"second");
		withdrawThread wt2 = new withdrawThread(oa,10000,"second");
		System.out.println("Enter your choice:");
		System.out.println("1.Deposite");
		System.out.println("2.withdraw");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if (choice == 1) {
			dt1.start();
			dt2.start();
			try
			{
				dt1.join();
				dt2.join();
			}
			catch (Exception e){
				
			}
			}
		else if(choice == 2) {
			//obj.withdraw(amt);
			public void start() {
			}wt1.start();
			wt2.start();
			try {
				obj.withdraw(amt);
				public void join() {
			}wt1.join();
				wt2.join();
				} catch (Exception e) {
			}
			}else 
			System.out.println("Invalid input");
		System.out.println("Total balance is:"+ Balance);

}
}

			
