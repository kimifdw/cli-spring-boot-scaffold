package br.com.templates.config.jms_aws_sqs;

import br.com.generator.core.Generator;
import br.com.generator.core.GeneratorOptions;

import java.io.File;
import java.io.IOException;

public class EntryPointMessageGenerator extends Generator {

    private GeneratorOptions generatorOptions;

    public EntryPointMessageGenerator() {
    }

    public EntryPointMessageGenerator(GeneratorOptions generatorOptions) {
        this.generatorOptions = generatorOptions;
    }

    public File runGenerate() throws IOException {
        this.generatorOptions.setTemplatePath("/templates/config/template-entrypoint-listener.txt");
        this.generatorOptions.setName("EntryPointMessage.java");
        return generate(this.generatorOptions);
    }

}
