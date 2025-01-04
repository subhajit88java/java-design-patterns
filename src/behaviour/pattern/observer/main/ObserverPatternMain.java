package behaviour.pattern.observer.main;

import behaviour.pattern.observer.model.Medium;
import behaviour.pattern.observer.model.Newspaper;
import behaviour.pattern.observer.model.Radio;
import behaviour.pattern.observer.model.Reporter;
import behaviour.pattern.observer.model.Tv;

// Client 
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

// Items :
// Observer interface, Concrete observers : Terminals who are dependent on subject. If internal stae of subject changes then all the registered observers are notified 
// Subject interface, Concrete subject : A class which maintains list of observers along with add/remove feature and also maintain a state. If the state changes all registered observers are notified
// Client : Creates subject and observers and set internal state of subject

