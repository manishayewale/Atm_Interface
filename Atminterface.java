package atm.com;

public class Atminterface {
	
		private double balance;
		private double depositeAccount;
		private double widrawAccount;
		
		  //default constructor
        public Atminterface()
        {
        	
        }
        
         //getter setter
		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public double getDepositeAccount() {
			return depositeAccount;
		}

		public void setDepositeAccount(double depositeAccount) {
			this.depositeAccount = depositeAccount;
		}

		public double getWidrawAccount() {
			return widrawAccount;
		}

		public void setWidrawnAccount(double widrawnAccount) {
			this.widrawAccount = widrawnAccount;
		}
}
