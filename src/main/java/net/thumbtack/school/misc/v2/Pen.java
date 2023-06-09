package net.thumbtack.school.misc.v2;

import net.thumbtack.school.iface.v2.Colored;

import java.util.Objects;

public class Pen implements Colored{

    private int color;

    public Pen(){
        color = 2;
    }

    public Pen(int color){
        this.color = color;
    }

    @Override
    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public int getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pen apple = (Pen) o;
        return color == apple.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}