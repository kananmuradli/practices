package com.company.patterns.factory;

import static com.company.patterns.factory.ProgrammingLanguage.JAVA;

public class Software {
    public static void main(String[] args) {
        createDeveloperByLanguage(JAVA).writeCode();
    }

    public static Developer createDeveloperByLanguage(ProgrammingLanguage programmingLanguage) {
        return switch (programmingLanguage) {
            case KOTLIN -> new KotlinDeveloperFactory().createDeveloper();
            case JAVA -> new JavaDeveloperFactory().createDeveloper();
        };
    }
}
