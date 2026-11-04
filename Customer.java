import Transaction.Account;
import reports.Transaction_report;
public class Customer
{
public static void main(String[] args)
{
Account a=new Account(1001,5000);
a.deposit(1000);
a.withdrawl(500);
Transaction_report r=new Transaction_report();
r.Generate(a);
}
}