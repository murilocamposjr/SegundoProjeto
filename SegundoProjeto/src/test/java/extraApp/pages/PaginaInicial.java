/*
 Developed on 21/07/2016 by Murilo Campos
*/

package extraApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;
import extraApp.config.Config;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;

@ScreenMap(name = "Pagina Inicial", base = Config.URLBASE, location = "")
public class PaginaInicial {

	@ElementMap(name = "Campo Buscar", locatorType = ElementLocatorType.XPath, locator = "/html/body/form/div[4]/div[1]/div[1]/div/div/div/div/div[1]/span/input")
	private TextField campoBuscar;
	
	@ElementMap(name = "Botao Buscar", locatorType = ElementLocatorType.XPath, locator = "/html/body/form/div[4]/div[1]/div[1]/div/div/div/div/div[2]/button")
	private Button BotaoBuscar;
	
}