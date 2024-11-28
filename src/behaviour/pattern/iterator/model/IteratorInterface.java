package behaviour.pattern.iterator.model;

public interface IteratorInterface<T> {
	boolean hasPrev();
	boolean hasNext();
	<T> T next();
	<T> T prev();
}
