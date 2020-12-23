package io.vepo.eda.geometry;

import java.util.HashSet;
import java.util.Set;

import io.vepo.eda.model.EventDrivenSpec;

public class SpecGeometryAnalyzer {

    public Analysis generate(EventDrivenSpec spec) {
        Analysis analysis = new Analysis();
        Set<Node> nodes = new HashSet<>();
        spec.getProducers().keySet().stream().map(Node::new).forEach(nodes::add);
        System.out.println(nodes);
        return analysis;
    }

}
