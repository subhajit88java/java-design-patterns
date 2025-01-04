package behaviour.pattern.observer.main;

import behaviour.pattern.observer.model.Medium;
import behaviour.pattern.observer.model.Newspaper;
import behaviour.pattern.observer.model.Radio;
import behaviour.pattern.observer.model.Reporter;
import behaviour.pattern.observer.model.Tv;

public class ObserverPatternMain {
	
	public static void main(String[] args) {
		
		Reporter reporter = new Reporter();
		
		Medium newspaper = new Newspaper();
		Medium tv = new Tv();
		
		reporter.addMedium(tv);
		reporter.addMedium(newspaper);
		
		reporter.setNews("It is raining huge in Durgapur!!");
		
		Medium radio = new Radio();
		reporter.addMedium(radio);
		
		reporter.setNews("HS results are out!!");
		
	}

}

