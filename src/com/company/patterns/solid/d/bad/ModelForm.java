package com.company.patterns.solid.d.bad;

public class ModelForm {
    int id;
    int age;

    public ModelForm(int id, int age) {
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ModelForm{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
}
