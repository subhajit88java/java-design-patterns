package behaviour.pattern.iterator.main;

import java.util.ArrayList;
import java.util.List;

import behaviour.pattern.iterator.model.AggregatorInterface;
import behaviour.pattern.iterator.model.ConcreteAggregator;
import behaviour.pattern.iterator.model.IteratorInterface;

public class IteratorPatterMain {
	public static void main(String[] args) {
		List<String> stopages = new ArrayList();
		stopages.add("Asansol");
		stopages.add("Ranigunj");
		stopages.add("Durgapur");
		stopages.add("Bardhaman");
		stopages.add("Bandel");
		stopages.add("Howrah");
		
		AggregatorInterface<String> stoppageAggregator = new ConcreteAggregator(stopages);
		IteratorInterface<String> stoppageIterator = stoppageAggregator.createIterator();
		while(stoppageIterator.hasNext()) {
			System.out.println("Next stoppage : " + stoppageIterator.next());
			System.out.println("Next stoppage : " + stoppageIterator.next());
		}
		
		while(stoppageIterator.hasPrev()) {
			System.out.println("Prev stoppage : " + stoppageIterator.prev());
		}
	}
}
