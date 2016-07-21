/*
 * Developed on 21/07/2016 by Murilo Campos
*/

package extraApp.tests;

import org.junit.Test;
import br.gov.frameworkdemoiselle.behave.controller.BehaveContext;

public class TesteLogin {

	private BehaveContext eng = BehaveContext.getInstance();

	public TesteLogin() {
	}
	
	@Test
	public void testLogin() throws Throwable {
		eng.addStories("/stories/login/");
		eng.run();
	}	
}