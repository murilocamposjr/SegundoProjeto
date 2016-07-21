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

@ScreenMap(name = "Pagina Login", base = Config.URLCARRINHO, location = "/Checkout?ReturnUrl=http://www.extra.com.br#login")
public class PaginaLogin {

	@ElementMap(name = "Campo Email", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[3]/section/section[2]/div/div[2]/form/fieldset/p[1]/input")
	private TextField campoCarrinho;
	
	@ElementMap(name = "Campo Senha", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[3]/section/section[2]/div/div[2]/form/fieldset/p[2]/input[2]")
	private TextField campoSenha;
	
	@ElementMap(name = "Botao Continuar", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[3]/section/section[2]/div/div[2]/form/fieldset/input")
	private Button botaoContinuar;
	
}