package ru.skillbench.tasks.basics.practical2;

/**
 * todo Document type Dog
 */
public class Dog implements Voice {
    @Override
    public void voice() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Woof! Woof!";
    }
}
