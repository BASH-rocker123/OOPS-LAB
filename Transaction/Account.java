package Transaction;
public class Account
{
public int acc_no;
public int balance;
public Account (int acc_no,int balance)
{
this.acc_no=acc_no;
this.balance=balance;
}
public void deposit(int amt)
{
System.out.println("Amount to be Deposited:"+amt);
balance+=amt;
System.out.println("Total Amount in the account:"+balance);
}
public void withdrawl(int amt)
{
if(balance<amt){
System.out.println("Insufficient balance");
}
else 
{
System.out.println("Amount to be withdrawn:"+amt);
balance-=amt;
System.out.println("Total Amount left:"+balance);
}
}
}
