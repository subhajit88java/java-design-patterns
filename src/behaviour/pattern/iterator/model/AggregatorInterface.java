package behaviour.pattern.iterator.model;

import java.util.List;

public interface AggregatorInterface<T> {
	<T>IteratorInterface<T> createIterator();
}
