package org.prog.session7.object;

public class Bike {
    public String color;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Bike) {
            Bike b = (Bike) obj;
            return b.color.equals(this.color);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.color.hashCode();
    }

    @Override
    public String toString() {
        return "Bike [color=" + color + "]";
    }
}
