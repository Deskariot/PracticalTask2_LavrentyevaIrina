package ru.skillbench.tasks.basics.practical2;

import java.util.Objects;

/**
 * todo Document type ExtendedClass
 */
public class ExtendedClass {
    private byte b;
    private int i;
    private double d;
    private String s;

    public ExtendedClass(byte b, int i, double d, String s) {
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object anObject){
        if (anObject instanceof ExtendedClass) {
            if ((this.b == ((ExtendedClass) anObject).getB()) && (this.i == ((ExtendedClass) anObject).getI()) && (this.d == ((ExtendedClass) anObject).getD()) && (this.s == ((ExtendedClass) anObject).getS())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getB(), getI(), getD(), getS());
    }

    @Override
    public String toString(){
        return("b: " + b + ", i: " + i + ", d: " + d + ", s: " + s);
    }
}
