package behaviour.pattern.memento.model;

import java.util.Stack;

public class Caretaker {
	
	private Stack<MementoInterface> historyStack;
	
	public Caretaker() {
		historyStack = new Stack<>();
	}
	
	public void save(MementoInterface currentContent) {
		historyStack.push(currentContent);		
	}
	
	public MementoInterface rollback() {
		if(!historyStack.empty())
		  return historyStack.pop();
		else
			return null;
	}

}
