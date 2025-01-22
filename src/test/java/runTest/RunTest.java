package runTest;

import br.com.srbarriga.utils.commons.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import static io.cucumber.core.snippets.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
		plugin = {
				"pretty",
				"json:target/cucumber.json"
		},
		features = {
				"src/test/feature"
		},
		glue = {
				"steps",
				"br.com.srbarriga.utils.configuration"
		},
		tags = "@login")


public class RunTest extends BaseTest {

	// Método executado após todos os testes
	@AfterClass
	public static void afterTests() {
		if (webDriver != null) {
			closeWeb();
		}
	}
}
