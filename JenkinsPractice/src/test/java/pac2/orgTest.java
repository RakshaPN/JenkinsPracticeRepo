package pac2;

import org.testng.annotations.Test;

public class orgTest {
@Test(groups="smoke")
	public void createorgTest() {
	String BROWSER=System.getProperty("browser","chrome");
	String URL = System.getProperty("url");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	System.out.println(URL);
	System.out.println(BROWSER);
	System.out.println(USERNAME);
	System.out.println(PASSWORD);
	System.out.println("created org");
}
@Test(groups="FullRegression")
public void modifyorgTest() {
	System.out.println("executed modify org");
}

}
