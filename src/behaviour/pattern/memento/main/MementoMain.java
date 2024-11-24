package behaviour.pattern.memento.main;

import behaviour.pattern.memento.model.Originator;

public class MementoMain {
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		
		// adding 1st content
		originator.addContent("1st statement");
		System.out.println("Printing content : " + originator.getContent());
		
		// adding 2nd content
		originator.addContent("2nd statement");
		System.out.println("Printing content : " + originator.getContent());
		
		// Saving content
		originator.save();
		
		System.out.println("Printing content : " + originator.getContent());
		
		// adding 3rd content
		originator.addContent("3rd statement");
		originator.save();
		System.out.println("Printing content : " + originator.getContent());
		
		originator.rollback();
		System.out.println("Printing content after rollback 1 : " + originator.getContent());
		
		originator.rollback();
		System.out.println("Printing content after rollback 2 : " + originator.getContent());
		
		// adding 4th content
		originator.addContent("4th statement");
		originator.save();
		System.out.println("Printing content : " + originator.getContent());
				
	}
	

}


// Items :
// Client -> communicates with originator to do some activity
// Originator -> responsible to manage the state of an object eg. storing current content, saving and rolling back content through caretaker and memento objects
// Memento -> A snapshot of the object
// Caretaker -> Maintains history of snapshots