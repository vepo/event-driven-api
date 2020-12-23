package io.vepo.eda.model;

public class Producer {
    private String actor;
    private String description;

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((actor == null) ? 0 : actor.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producer other = (Producer) obj;
        if (actor == null) {
            if (other.actor != null)
                return false;
        } else if (!actor.equals(other.actor))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Producer [actor=" + actor + ", description=" + description + "]";
    }

}
