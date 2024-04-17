package POM;

import java.io.IOException;

public class VALIDLOGIN extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest test= new BaseTest();
		test.setUp();
		LoginPage lp= new LoginPage(driver);
		FLib lib = new FLib();
		lp.VALIDLOGIN(lib.getDataFromProperty(PROP_PATH, "username"),lib.getDataFromProperty(PROP_PATH, "password"));
          test.createuser();
          test.createTask();
	
		
		

	}

}


