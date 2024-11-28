package behaviour.pattern.iterator.model;

import java.util.List;

public class ConcreteAggregator<T> implements AggregatorInterface<T> {

	private List<T> items;
	
	public ConcreteAggregator(List<T> items) {
		this.items = items;
	}
	
	@Override
	public <T> IteratorInterface<T> createIterator() {
		return new ConcreteIterator(this.items);
	}

}
