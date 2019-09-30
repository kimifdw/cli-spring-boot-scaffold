package br.com.generate.source.repository;

import java.io.IOException;

import br.com.generate.Layers;
import br.com.generate.helpers.FileHelper;

public class RepositoryGenerator extends FileHelper {

	@Override
	public String getLayer() {
		return Layers.REPOSITORY;
	}

	@Override
	public String operationGenerate(String javaStrings, String nameClass, String parameters) {
		return javaStrings.replace("${package}", getPackage() + ".repository")
				.replace("${package_model}", getPackage() + ".model")
				.replace("${className}", nameClass);
	}

	
	public static void main(String[] args) throws IOException {
		new RepositoryGenerator().generate("User", null, "template-repository.txt");
	}
	
}
