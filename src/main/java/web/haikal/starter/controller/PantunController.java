package web.haikal.starter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import web.haikal.starter.bean.PantunRepo;

@RestController
public class PantunController {

	@GetMapping("/random-pantun")
	public String getRandom() {
        return String.format("<pre>\n%s\n</pre>", PantunRepo.getText());
	}

/**
    @GetMapping("/welcome-with-object")
	public WelcomeBean welcomeWithObject() {
		return new WelcomeBean("Hello World");
	}

	private static final String helloWorldTemplate = "Hello World, %s!";

	@GetMapping("/welcome-with-parameter/name/{name}")
	public WelcomeBean welcomeWithParameter(@PathVariable String name) {
		return new WelcomeBean(String.format(helloWorldTemplate, name));
    }
 */
}