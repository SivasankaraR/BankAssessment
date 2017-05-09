package com.wipro.bank.assessment;

import com.wipro.bank.entity.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
	
    public static final List<Account> accounts = new ArrayList<Account>();
	
	public static List<Account> getAccounts() {
		return accounts;
	}	

	public Account getAccountDetailsByID(int id){
		Account acc=null;
		for(Account a:accounts){
			if(a.getAccountID()==id){
				acc=a;
			}
		}             
		return acc;
	}

	public List<Account> getAccountDetailsByBalance(double amount){	
		List<Account> accountlist=new ArrayList<Account>();
		for(Account account:accounts){                                               
			if(account.getBalance()>=amount){
				accountlist.add(account);
			}
		}
		if(accountlist.size()==0){
			accountlist=null;
		}
		return accountlist;
	}

		
	public static void main( String[] args )
    {       
       accounts.add(new Account(1,"acc1",101.11));
       accounts.add(new Account(2,"acc2",201.13));
       accounts.add(new Account(3,"acc3",301.22));
       accounts.add(new Account(4,"acc4",401.55));
       accounts.add(new Account(5,"acc5",501.77));
           
       App temp = new App();
      System.out.println(temp.getAccountDetailsByID(1));
      System.out.println(temp.getAccountDetailsByBalance(400));
       
       
    }


}
