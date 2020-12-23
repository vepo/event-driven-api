package io.vepo.eda.exporter;

import java.io.File;
import java.io.IOException;

import io.vepo.eda.model.EventDrivenSpec;

public interface EventDrivenSpecExporter {

    public default File export(EventDrivenSpec spec) {
        try {
            File outputFile = File.createTempFile("temp", "." + extension());
            export(spec, outputFile);
            return outputFile;
        } catch (IOException e) {
            System.err.println("Could not create a temp file!");
            System.exit(-1);
            return null;
        }
    }

    public String extension();

    public void export(EventDrivenSpec spec, File outputFile);
}
