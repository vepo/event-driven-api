package io.vepo.eda.reader;

import java.io.File;

import io.vepo.eda.model.EventDrivenSpec;

public interface EventDrivenSpecReader {
    public EventDrivenSpec read(File spec);
}
