package io.vepo.eda.model;

public class Topic {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Topic [description=" + description + "]";
    }
}
