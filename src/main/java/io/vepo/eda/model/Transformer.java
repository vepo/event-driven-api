package io.vepo.eda.model;

public class Transformer {
    private String actor;
    private String listen;
    private String generate;
    private String description;

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getListen() {
        return listen;
    }

    public void setListen(String listen) {
        this.listen = listen;
    }

    public String getGenerate() {
        return generate;
    }

    public void setGenerate(String generate) {
        this.generate = generate;
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
        result = prime * result + ((generate == null) ? 0 : generate.hashCode());
        result = prime * result + ((listen == null) ? 0 : listen.hashCode());
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
        Transformer other = (Transformer) obj;
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
        if (generate == null) {
            if (other.generate != null)
                return false;
        } else if (!generate.equals(other.generate))
            return false;
        if (listen == null) {
            if (other.listen != null)
                return false;
        } else if (!listen.equals(other.listen))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Transformer [actor=" + actor + ", listen=" + listen + ", generate=" + generate + ", description=" + description + "]";
    }

}
