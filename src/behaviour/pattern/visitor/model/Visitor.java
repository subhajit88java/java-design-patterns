package behaviour.pattern.visitor.model;

// Concrete Visitor
public class Visitor implements VisitorInterface{

	@Override
	public void performOperation(Bank bank, BankOperations operation) {
		switch(operation) {
			case CALCULATE_SAVINGS_INTEREST : {
				System.out.println("Interest of bank : " + bank.getBankName() + " is : " + bank.getRate());
				break;
			}
			case OPEN_FD : {
				System.out.println("FD opened : " + bank.getBankName());
				break;
			}
			case OPEN_SAVINGS_ACCOUNT : {
				System.out.println("Savings account opened : " + bank.getBankName());
				break;
			}
			case OPEN_PPF : {
				System.out.println("PPF account opened : " + bank.getBankName());
				break;
			}
			case OPEN_SCSS : {
				System.out.println("SCSS account opened : " + bank.getBankName());
				break;
			}
			default:
				break;			
		}	
	}

	@Override
	public void performOperation(College college, CollegeOperations operation) {
		switch(operation) {
		case REGISTER_STUDENT : {
			System.out.println("Student has been registered : " + college.getCollegeName());
			break;
		}
		case COLLEGE_FEES : {
			System.out.println("College fees : " + college.getCollegeName() + " - " + college.getFees());
			break;
		}
		default:
			break;			
		}
	}	
}
