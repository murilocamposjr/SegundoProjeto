/*
 * Developed on 21/07/2016 by Murilo Campos
*/

package extraApp.tests;

import org.junit.Test;
import br.gov.frameworkdemoiselle.behave.controller.BehaveContext;

public class BuscaTest {

	private BehaveContext eng = BehaveContext.getInstance();

	public BuscaTest() {
	}
	
	@Test
	public void BuscarTest() throws Throwable {
		eng.addStories("/stories/busca-produto/");
		eng.addStories("/stories/login/");
		eng.run();
	}	
}