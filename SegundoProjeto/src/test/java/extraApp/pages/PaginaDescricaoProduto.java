/*
 Developed on 21/07/2016 by Murilo Campos
*/

package extraApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import extraApp.config.Config;

@ScreenMap(name = "Pagina Descricao do Produto", base = Config.URLBASE, location = "")
public class PaginaDescricaoProduto {

	@ElementMap(name = "Botao Adicionar ao Carrinho", locatorType = ElementLocatorType.XPath, locator = "/html/body/form/div[5]/div[4]/div[1]/div[2]/div[2]/div[2]/div/a")
	private Button botaoAdicionarAoCarrinho;
	
}