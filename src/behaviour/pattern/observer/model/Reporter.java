package behaviour.pattern.observer.model;

import java.util.ArrayList;
import java.util.List;

// Concrete subject
public class Reporter implements Subject{
	
	private List<Medium> observers = new ArrayList<>();
	private String news;

	@Override
	public void addMedium(Medium medium) {
		this.observers.add(medium);
	}

	@Override
	public void removeMedium(Medium medium) {
		this.observers.remove(medium);
	}

	@Override
	public void notifyMedium() {
		for(Medium medium : this.observers) {
			medium.broadcast(this.news);
		}
	}

	public void setNews(String news) {
		this.news = news;
		notifyMedium();
	}
	
	

}
