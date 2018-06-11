package com.training.mulesoft;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;


public class HelloMavenTest extends FunctionalTestCase {

	@Test
	public void  mavenFlowReturnHelloMaven()throws Exception {
		runFlowAndExpect("maven-demoFlow","This is Mule Maven Demo");
	}
	
	@Override
	protected String getConfigResources() {
		// TODO Auto-generated method stub
		return "maven-demo.xml";
	}

}
