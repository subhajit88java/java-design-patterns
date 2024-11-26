package behaviour.pattern.observer.model;

// Subject interface
public interface Subject {
	void addMedium(Medium medium);
	void removeMedium(Medium medium);
	void notifyMedium();
}
