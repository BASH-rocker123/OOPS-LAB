package reports;
import Transaction.Account;
public class Transaction_report
{
public void Generate(Account acc)
{
System.out.println("----Report-----");
System.out.println("Account Number:"+acc.acc_no);
System.out.println("Balance:"+acc.balance);
}
}