package ru.skillbench.tasks.basics.practical2;

/**
 * todo Document type Cat
 */
public class Cat implements Voice {
    @Override
    public void voice() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Meow! Meow!";
    }

}
