package behaviour.pattern.template.main;

import behaviour.pattern.template.model.Aws;
import behaviour.pattern.template.model.Docker;
import behaviour.pattern.template.model.TechnologyOnboard;

public class TemplatePatternMain {
	
	public static void main(String[] args) {
		
		TechnologyOnboard docker = new Docker();
		docker.onboardTech();
		
		System.out.println("--------------------------------------------");
		
		TechnologyOnboard aws = new Aws();
		aws.onboardTech();
	}

}

// Items :
// 1. Template : An abstract class containing the template to be followed by concrete subclasses
// 2. Concrete subclasses : Follows template
// 3. Client : Initiates subclasses and executes flow
