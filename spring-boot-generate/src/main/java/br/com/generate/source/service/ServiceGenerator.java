package br.com.generate.source.service;

import java.io.IOException;

import br.com.generate.Layers;
import br.com.generate.helpers.FileHelper;

public class ServiceGenerator extends FileHelper {
	
	@Override
	public String getLayer() {
		return Layers.SERVICE;
	}

	@Override
	public String operationGenerate(String javaStrings, String nameClass, String parameters) {
		if ( getSpringVersion().equals("2.x") ) {
			javaStrings = javaStrings.replace(".findOne(id)", ".findById(id).get()");
		}
		return javaStrings.replace("${package}", getPackage() + ".service")
				.replace("${package_model}", getPackage() + ".model")
				.replace("${package_repository}", getPackage() + ".repository")
				.replace("${className}", nameClass)
				.replace("${paramClassName}", nameClass.toLowerCase());
	}

	public static void main(String[] args) throws IOException {
		new ServiceGenerator().generate("User", null, "template-service.txt");
	}
	
}

