package behaviour.pattern.visitor.main;

import behaviour.pattern.visitor.model.Bank;
import behaviour.pattern.visitor.model.BankInterface;
import behaviour.pattern.visitor.model.College;
import behaviour.pattern.visitor.model.CollegeInterface;
import behaviour.pattern.visitor.model.VisitorInterface;
import behaviour.pattern.visitor.model.Visitor;

// Client
public class VisitorPatternMain {

	public static void main(String[] args) {
		
		BankInterface sbi = new Bank("SBI", 8.5);
		BankInterface icici = new Bank("ICICI", 7.0);
		
		VisitorInterface visitor = new Visitor();
		
		sbi.calculateInterest(visitor);
		icici.calculateInterest(visitor);
		
		// Let us add another logic in visitor pointing to College
		CollegeInterface mmmc = new College("MMMC", 1000L);
		CollegeInterface hitk = new College("HITK", 8000L);
		
		mmmc.showFees(visitor);
		hitk.showFees(visitor);
	}
}
