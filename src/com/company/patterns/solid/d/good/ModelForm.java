package com.company.patterns.solid.d.good;

public class ModelForm implements FormInterface{

    private int id;
    private int age;

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
