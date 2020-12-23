package io.vepo.eda.geometry;

public class Position {
    private final int step;
    private final int frame;

    public Position(int frame, int step) {
        this.frame = frame;
        this.step = step;
    }

    public int getStep() {
        return step;
    }

    public int getFrame() {
        return frame;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + frame;
        result = prime * result + step;
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
        Position other = (Position) obj;
        if (frame != other.frame)
            return false;
        if (step != other.step)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Position [step=" + step + ", frame=" + frame + "]";
    }

}
