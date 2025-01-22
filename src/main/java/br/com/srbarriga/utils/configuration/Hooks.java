
package br.com.srbarriga.utils.configuration;

import br.com.srbarriga.utils.commons.BaseTest;
import br.com.srbarriga.utils.commons.PropertiesManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.time.Duration;

/**
 * @since 2020-02-11
 */
public class Hooks extends BaseTest {
	@Before(value = "@web")
	public void beforeScenarioWebWindows() {
		System.out.println("Teste execução Hooks Web");
		initializeWebApplication(Web.CHROME_WINDOWS);
		webDriver.get(PropertiesManager.getPropertiesValue("URL_SRBARRIGA"));
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Timeout implícito de 20 segundos
	}

	@After(value = "@web")
	public void afterScenarioWeb(Scenario scenario) {
		closeWeb();
	}
}