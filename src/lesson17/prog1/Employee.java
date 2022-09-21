/*
 * Copyright (c) 2021. By Sergey Makarichev
 */

package lesson17.prog1;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    transient double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
