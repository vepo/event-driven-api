package io.vepo.eda.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

import io.vepo.eda.model.EventDrivenSpec;

public class EventDrivenSpecYamlReader implements EventDrivenSpecReader {

    public EventDrivenSpec read(File spec) {
        try {
            YamlReader reader = new YamlReader(new FileReader(spec));
            return reader.read(EventDrivenSpec.class);
        } catch (FileNotFoundException e) {
            System.err.println("Could not find the file: " + spec.getAbsolutePath());
            System.exit(-1);
            return null;
        } catch (YamlException e) {
            System.err.println("Invalid YAML file: " + spec.getAbsolutePath());
            System.err.println(e.getMessage());
            System.exit(-1);
            return null;
        }
    }

}
