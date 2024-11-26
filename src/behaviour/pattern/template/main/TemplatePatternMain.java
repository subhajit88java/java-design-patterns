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
