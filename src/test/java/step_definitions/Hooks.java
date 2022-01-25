package step_definitions;

import base.MainClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends MainClass{
	
	// Handle pre-requisite and post-requisite steps
	// Pre-requisite
	@Before
	public void loadBrowser() {
		intialization();
	}
	
	// Post-requisite
	@After
	public void closeBrowser() {
		tearDown();
	}

}
