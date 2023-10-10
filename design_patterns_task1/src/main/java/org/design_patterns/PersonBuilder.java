package org.design_patterns;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Установите корректный возраст!");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) {
            throw new IllegalArgumentException("Введите имя человека. Обязательно!");
        } else if (surname == null) {
            throw new IllegalArgumentException("Введите фамилию человека. Обязательно!");
        }

        if (!address.isEmpty()) {
            return new Person(name, surname, age, address);
        }
        return new Person(name, surname, age);
    }
}
