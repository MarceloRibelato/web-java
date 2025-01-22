package br.com.srbarriga.utils.configuration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;
import java.util.Map;

public enum Web implements WebApplication {

	CHROME_MAC {

		@Override
		public WebDriver getDriver() {
			// Configuração automática do WebDriver para Chrome
			WebDriverManager.chromedriver().setup();

			// Configurações de preferências para Chrome
			Map<String, Object> prefs = new HashMap<>();
			prefs.put("profile.default_content_setting_values.notifications", 2); // Bloqueia notificações
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080"); // Adiciona modo headless

			return new ChromeDriver(options);
		}

	},

	CHROME_WINDOWS {

		@Override
		public WebDriver getDriver() {
			// Configuração automática do WebDriver para Chrome
			WebDriverManager.chromedriver().setup();

			// Configurações de preferências para Chrome
			Map<String, Object> prefs = new HashMap<>();
			prefs.put("profile.default_content_setting_values.notifications", 2); // Bloqueia notificações
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080"); // Adiciona modo headless

			return new ChromeDriver(options);
		}

	},

	FIREFOX {

		@Override
		public WebDriver getDriver() {
			// Configuração automática do WebDriver para Firefox
			WebDriverManager.firefoxdriver().setup();

			// Configurações opcionais para Firefox
			FirefoxOptions options = new FirefoxOptions();
			// Adicionar configurações aqui se necessário
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080"); // Adiciona modo headless

			return new FirefoxDriver(options);
		}

	}

}
