package ru.skillbench.tasks.basics.practical2;

/**
 * todo Document type Cow
 */
public class Cow implements Voice{
    @Override
    public void voice() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Moo! Moo!";
    }
}
