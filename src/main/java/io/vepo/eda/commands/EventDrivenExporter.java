package io.vepo.eda.commands;

import java.io.File;
import java.util.Objects;
import java.util.concurrent.Callable;

import io.vepo.eda.exporter.EventDrivenSpecExporter;
import io.vepo.eda.exporter.EventDrivenSpecPngExporter;
import io.vepo.eda.model.EventDrivenSpec;
import io.vepo.eda.reader.EventDrivenSpecReader;
import io.vepo.eda.reader.EventDrivenSpecYamlReader;
import picocli.CommandLine.Command;
import picocli.CommandLine.Help.Visibility;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "export", mixinStandardHelpOptions = true, description = "Export API")
public class EventDrivenExporter implements Callable<Integer> {

    @Parameters(index = "0", description = "Event-Driven API spec")
    private File specFile;

    @Option(names = {
        "-f",
        "--formater" }, description = "Export Mode. Valid values: ${COMPLETION-CANDIDATES}", defaultValue = "PNG", showDefaultValue = Visibility.ALWAYS)
    private ExportFormat exportFormat;

    @Option(names = {
        "-r",
        "--reader" }, description = "Input reader. Valid values: ${COMPLETION-CANDIDATES}", defaultValue = "YAML", showDefaultValue = Visibility.ALWAYS)
    private InputFormat inputFormat;

    @Option(names = {
        "-o",
        "--output" }, description = "Output file. If not file is passed it will create a temporary file")
    private File outputFile;

    @Override
    public Integer call() throws Exception {
        System.out.println(outputFile);
        EventDrivenSpecReader reader = getReader();
        EventDrivenSpecExporter exporter = getExporter();
        EventDrivenSpec spec = reader.read(specFile);
        
        File exportedFile;
        if (Objects.isNull(this.outputFile)) {
            exportedFile = exporter.export(spec);
        } else {
            exportedFile = outputFile;
            exporter.export(spec, outputFile);
        }

        System.out.println("Event-Driven API exported: " + exportedFile.getAbsolutePath());
        return 0;
    }

    private EventDrivenSpecReader getReader() {
        switch (inputFormat) {
            case YAML:
                return new EventDrivenSpecYamlReader();
            default:
                throw new UnsupportedOperationException("Reader not implemented! reader=" + inputFormat);
        }
    }

    private EventDrivenSpecExporter getExporter() {
        switch (exportFormat) {
            case PNG:
                return new EventDrivenSpecPngExporter();
            default:
                throw new UnsupportedOperationException("Exporter not implemented! export=" + exportFormat);
        }
    }

}
