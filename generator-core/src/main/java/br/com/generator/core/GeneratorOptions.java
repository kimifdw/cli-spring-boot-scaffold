package br.com.generator.core;

import java.util.List;
import java.util.Map;

public class GeneratorOptions {

    private String destination;
    private String templatePath;
    private String name;
    private String properties;
    private Map<String, String> pluginValues;
    private Map<String, String> keyValue;
    private List<String> dependencies;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public void setTemplatePath(String templatePath) {
        this.templatePath = templatePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(Map<String, String> keyValue) {
        this.keyValue = keyValue;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public Map<String, String> getPluginValues() {
        return pluginValues;
    }

    public void setPluginValues(Map<String, String> pluginValues) {
        this.pluginValues = pluginValues;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }
}
