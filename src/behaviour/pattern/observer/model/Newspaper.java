package behaviour.pattern.observer.model;

// Concrete observer
public class Newspaper implements Medium{

	private String news;
	
	@Override
	public void broadcast(String news) {
		this.news = news;
		displayNews();
	}

	public void displayNews() {
		System.out.println("newspaper --------> " + this.news);
	}

}
