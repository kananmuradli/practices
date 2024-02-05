package com.company.learn.factory;

public class Software {

    public static void main(String[] args) {
        var developer = createDeveloperFactoryByLanguage(ProgrammingLanguage.PYTHON);
        developer.writeCode();
    }

    public static Developer createDeveloperFactoryByLanguage(ProgrammingLanguage language){

        return switch (language) {
            case JAVA -> new JavaDeveloperFactory().createDeveloper();
            case KOTLIN -> new KotlinDeveloperFactory().createDeveloper();
            case PYTHON -> new PythonDeveloperFactory().createDeveloper();
        };
    }
}
