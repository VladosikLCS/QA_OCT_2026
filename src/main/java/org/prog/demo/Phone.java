package org.prog.demo;

import java.util.Objects;

public class Phone {
     public String color;
     public String model;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Phone)) {
            return false;
        }

        Phone other = (Phone) obj;

        return color.equals(other.color) && model.equals(other.model);
    }
    @Override
    public int hashCode() {
        return Objects.hash(color, model);
    }
    }