/*
 Developed on 21/07/2016 by Murilo Campos
*/

package extraApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Element;
import extraApp.config.Config;

@ScreenMap(name = "Pagina Carrinho de Compras", base = Config.URLCARRINHO, location = "")
public class PaginaCarrinhoDeCompras {

	@ElementMap(name = "Item Carrinho", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/section/div[1]/div/table/tbody/tr/td[1]")
	private Element itemCarrinho;
	
}