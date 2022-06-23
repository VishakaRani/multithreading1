package multiThreading;

	public class AClass { 
		 
		private static int Balance = 0;
		int bal;
		synchronized void deposit(int amt)
	{
		System.out.println("Getting balance..");
		int oldbal=getBalance();
		bal=oldbal+amt;
		setBalance(bal);
	}
	synchronized void withdraw(int amt)
	{
		System.out.println("Getting balance..");
		int oldbal=getBalance();
		if(amt>oldbal)
		{
			System.out.println("InsufficientBalance !!!");
		}
		else 
		{
			bal=oldbal-amt;
		}
		setBalance(bal);
	}
	int getBalance()
	{
		return AClass.Balance;
	}
	void setBalance(int amt)
	{
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		AClass.Balance=amt;
	}
}


