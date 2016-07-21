/*
 Developed on 21/07/2016 by Murilo Campos
*/

package extraApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Link;
import extraApp.config.Config;

@ScreenMap(name = "Pagina de Resultado de Busca", base = Config.URLBUSCA, location = "/?strBusca=\"$local\"")
public class PaginaResultadoBusca {
	
	@ElementMap(name = "Primeiro Item da Busca", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/div[2]/div[2]/div[1]/div[2]/div[3]/div/ul/li[1]/div/a/span[1]/img")
	private Link primeiroItemDaBusca;
	
}