package io.vepo.eda;

import java.util.concurrent.Callable;

import io.vepo.eda.commands.EventDrivenExporter;
import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "eda", mixinStandardHelpOptions = true, version = "eda 1.0", description = "Generate Event-Driven API docs.", subcommands = {
    EventDrivenExporter.class })
public class EventDrivenApi implements Callable<Integer> {
    public static void main(String[] args) {
        int exitCode = new CommandLine(new EventDrivenApi()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        CommandLine.usage(this, System.out);
        return 0;
    }
}