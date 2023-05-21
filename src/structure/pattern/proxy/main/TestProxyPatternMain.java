package structure.pattern.proxy.main;

import structure.pattern.proxy.model.CockpitSecurityProxy;

public class TestProxyPatternMain {

	public static void main(String[] args) {
		CockpitSecurityProxy cockpitSecurityProxy = new CockpitSecurityProxy();
		cockpitSecurityProxy.cockpitEntry("pilot");
		cockpitSecurityProxy.cockpitEntry("crew");
	}
}
