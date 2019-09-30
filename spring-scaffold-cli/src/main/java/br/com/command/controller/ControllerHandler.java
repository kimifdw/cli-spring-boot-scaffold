package br.com.command.controller;

import java.io.IOException;
import java.util.Arrays;

import org.springframework.boot.cli.command.options.OptionHandler;
import org.springframework.boot.cli.command.status.ExitStatus;

import br.com.generate.source.controller.ControllerCleanGenerator;
import br.com.generate.thymeleaf.ThymeleafCleanGenerator;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;

/**
 * @author NetoDevel
 * @since 0.0.1
 */
public class ControllerHandler extends OptionHandler {

	@SuppressWarnings("unused")
	private OptionSpec<String> nameEntity;
	
	@Override
	protected void options() {
		this.nameEntity = option(Arrays.asList("nameEntity", "n"), "Name of entity to generate controller").withRequiredArg();
	}
	
	@Override
	protected ExitStatus run(OptionSet options) throws Exception {
		String nameClass = (String) options.valueOf("n");
		generateControllerJava(nameClass.trim());
		return ExitStatus.OK;
	}
	
	private void generateControllerJava(String nameClass) throws IOException {
		new ControllerCleanGenerator().generate(nameClass, null, "template-clean-controller.txt");
		new ThymeleafCleanGenerator().index(nameClass, null);
	}
	
}
