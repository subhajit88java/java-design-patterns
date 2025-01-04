package behaviour.pattern.visitor.main;

import behaviour.pattern.visitor.model.Bank;
import behaviour.pattern.visitor.model.BankInterface;
import behaviour.pattern.visitor.model.BankOperations;
import behaviour.pattern.visitor.model.College;
import behaviour.pattern.visitor.model.CollegeInterface;
import behaviour.pattern.visitor.model.CollegeOperations;
import behaviour.pattern.visitor.model.VisitorInterface;
import behaviour.pattern.visitor.model.Visitor;

// Client
public class VisitorPatternMain {

	public static void main(String[] args) {
		
		BankInterface sbi = new Bank("SBI", 8.5);
		BankInterface icici = new Bank("ICICI", 7.0);
		
		VisitorInterface visitor = new Visitor();
		
		System.out.println("Banking operations start ----> ");
		sbi.performOperation(visitor, BankOperations.CALCULATE_SAVINGS_INTEREST);
		sbi.performOperation(visitor, BankOperations.OPEN_FD);
		sbi.performOperation(visitor, BankOperations.OPEN_SAVINGS_ACCOUNT);	
		
		// Now the requirement is to add 2 new operations on banks
		// We will be adding these 2 new operations in BankOperations enum
		// Next we shall be modifying the Visitor bank-operation method
		sbi.performOperation(visitor, BankOperations.OPEN_PPF);
		sbi.performOperation(visitor, BankOperations.OPEN_SCSS);
		
		icici.performOperation(visitor, BankOperations.CALCULATE_SAVINGS_INTEREST);
		icici.performOperation(visitor, BankOperations.OPEN_FD);
		icici.performOperation(visitor, BankOperations.OPEN_SAVINGS_ACCOUNT);	
		icici.performOperation(visitor, BankOperations.OPEN_PPF);
		icici.performOperation(visitor, BankOperations.OPEN_SCSS);
		System.out.println("Banking operations end ----> ");
		
		// Let us add another element college and the corresponding logic in visitor pointing to College
		CollegeInterface mmmc = new College("MMMC", 1000L);
		CollegeInterface hitk = new College("HITK", 8000L);
		
		System.out.println("College operations start ----> ");
		mmmc.performOperation(visitor, CollegeOperations.REGISTER_STUDENT);
		mmmc.performOperation(visitor, CollegeOperations.COLLEGE_FEES);
		
		hitk.performOperation(visitor, CollegeOperations.REGISTER_STUDENT);
		hitk.performOperation(visitor, CollegeOperations.COLLEGE_FEES);
		System.out.println("College operations end ----> ");
		
	}
}

//Items : 
//1. Element interface, concrete element : Entities which will maintain internal states and a visitor and will pass themselves to the visitor method where business logic will be written
//2. Visitor interface, Concrete visitor : Entities which will contain the business logic based on the element object passed to them
//3. Client : Will create element objects and the pass the visitor to them and invoke methods of elements to do certain tasks

