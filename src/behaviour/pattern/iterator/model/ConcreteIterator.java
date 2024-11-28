package behaviour.pattern.iterator.model;

import java.util.List;
import java.util.NoSuchElementException;

public class ConcreteIterator<T> implements IteratorInterface<T>{

	private int pointer = -1;
	private List<T> items;
	
	public ConcreteIterator(List<T> items) {
		this.items = items;
	}
	
	@Override
	public boolean hasPrev() {
		if(pointer == 0)
			return false;
		else
			return true;
	}
			
	@Override
	public boolean hasNext() {
		if(pointer == items.size()-1)
			return false;
		else
			return true;
	}

	@Override
	public <T> T next() {
		if(!hasNext()) {
			throw new NoSuchElementException();
		}
		pointer = pointer + 1;
		return (T) items.get(pointer);
		
	}

	@Override
	public <T> T prev() {
		if(!hasPrev()) {
			throw new NoSuchElementException();
		}
		pointer = pointer - 1;
		return (T) items.get(pointer);
	}

	

}
