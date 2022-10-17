package banking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		String name,city;
		int acno,amt;
		ArrayList<Account> list=new ArrayList<>();//arraylist used to add accounts
		list.add(new Account("Devi","chennai",1000));
		list.add(new Account("Keerthi","salem",10000));
		list.add(new Account("priya","madurai",5000));
		list.add(new Account("Ajay","coimbatore",80000));		
System.out.println("select operations");
System.out.println("1.open account");
System.out.println("2.deposit");
System.out.println("3.withdraw");
System.out.println("4.balance enquiry");
System.out.println("5.list all");
System.out.println("6.exit");
int choice;
boolean found;
do {
	

	System.out.print("Enter choice");
	choice=sc.nextInt();
	switch(choice) {
	case 1:
		System.out.println("Account Open");
		System.out.print("Enter name:");
		name=sc.next();
		System.out.print("Enter city:");
		city=sc.next();
		System.out.print("Enter amount");
		amt=sc.nextInt();
		Account acc=new Account(name, city, amt);
		list.add(acc);
		System.out.println("Account opened Succesfully");
		break;
		
	case 2:
		System.out.println("Account Deposit");
		found=false;//initialising found
		System.out.println("enter account number");
		acno=sc.nextInt();
		for(Account ac:list) {
			if(acno==ac.getAcno()) {
				found=true;
				System.out.println("customer Name"+ac.getName());
				System.out.println("city"+ac.getCity());
				System.out.println("Account Balance"+ac.getBalance());
				System.out.println("Enter amount to deposit");
				amt=sc.nextInt();
				ac.setBalance(ac.getBalance()+amt);
				System.out.println("Amount succesfully deposited");
				break;
			}
		}
		if(!found) {
			System.out.println("Invalid account");
		}
		break;
	case 3:
		System.out.println("Account Withdraw");
		
		found=false;//initialising found
		System.out.println("enter account number");
		acno=sc.nextInt();
		for(Account ac:list) {
			if(acno==ac.getAcno()) {
				found=true;
				System.out.println("customer Name"+ac.getName());
				System.out.println("city"+ac.getCity());
				System.out.println("Account Balance"+ac.getBalance());
				System.out.println("Enter amount to withdraw");
				amt=sc.nextInt();
				if(amt<=ac.getBalance()) {
				ac.setBalance(ac.getBalance()-amt);
				System.out.println("Amount succesfully withdrawn");
				}
				else {
					System.out.println("Insufficient Balance in your Account");
				}
				break;
			}
		}
		if(!found) {
			System.out.println("Invalid account");
		}
		break;
		
	case 4:
		System.out.println("Account Balance enquiry");
		found=false;//initialising found
		System.out.println("enter account number");
		acno=sc.nextInt();
		for(Account ac:list) {
			if(acno==ac.getAcno()) {
				found=true;
				System.out.println("customer Name"+ac.getName());
				System.out.println("city"+ac.getCity());
				System.out.println("Account Balance"+ac.getBalance());
				break;
			}
		}
		if(!found) {
			System.out.println("Invalid account");
		}
		break;
	
	
	case 5:
		System.out.println("list of all accounts");
		for(Account ac:list) {
			System.out.println(ac);
		}
		break;
	case 6:
		System.out.println("Thanks for visiting");
		break;
	default:
		System.out.println("invalid choice");
		break;
		
	}

}while(choice!=6);
	
	
	
}
	}


