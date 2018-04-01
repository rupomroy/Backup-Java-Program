package com.qspiders.ExceptionOne;

class Amount
{
	int balance; //12000
		public Amount(int balance)
		{
			this.balance=balance; //initlialization balance
		}
		public void withdraw(int x)
		{
			if(x<=balance)
			{
				System.out.println("successful transaction");
			}
			else
			{
				throw new InsufficientBalanceException();
		}
}
}

public class InsufficientBalanceException extends RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amount a1=new Amount(12000);
		//System.out.println(a1.balance);
		try
		{
			a1.withdraw(135000); //risky statement
		}
		catch(InsufficientBalanceException AE)
		{
			//System.out.println(AE);
			System.out.println("exception caught");
		}
	}

}
