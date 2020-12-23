package io.vepo.eda.model;

import java.util.Map;

public class EventDrivenSpec {
    private Map<String, Consumer> consumers;
    private String edapi;
    private ApiInfo info;
    private Map<String, Producer> producers;
    private Map<String, Schema> schemas;
    private Map<String, Topic> topics;
    private Map<String, Transformer> transformers;

    public Map<String, Consumer> getConsumers() {
        return consumers;
    }

    public String getEdapi() {
        return edapi;
    }

    public ApiInfo getInfo() {
        return info;
    }

    public Map<String, Producer> getProducers() {
        return producers;
    }

    public Map<String, Schema> getSchemas() {
        return schemas;
    }

    public Map<String, Topic> getTopics() {
        return topics;
    }

    public Map<String, Transformer> getTransformers() {
        return transformers;
    }

    public void setConsumers(Map<String, Consumer> consumers) {
        this.consumers = consumers;
    }

    public void setEdapi(String edapi) {
        this.edapi = edapi;
    }

    public void setInfo(ApiInfo info) {
        this.info = info;
    }

    public void setProducers(Map<String, Producer> producers) {
        this.producers = producers;
    }

    public void setSchemas(Map<String, Schema> schemas) {
        this.schemas = schemas;
    }

    public void setTopics(Map<String, Topic> topics) {
        this.topics = topics;
    }

    public void setTransformers(Map<String, Transformer> transformers) {
        this.transformers = transformers;
    }

    @Override
    public String toString() {
        return "EventDrivenSpec [edapi=" + edapi + ", info=" + info + ", topics=" + topics + ", transformers=" + transformers
                + ", consumers=" + consumers + ", producers=" + producers + ", schemas=" + schemas + "]";
    }
}
