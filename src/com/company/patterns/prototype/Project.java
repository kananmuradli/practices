package com.company.patterns.prototype;

public class Project implements VersionControlCommands<Project> {

    private Long id;
    private String name;
    private String sourceCode;

    public Project(long id, String name, String sourceCode) {
        this.id = id;
        this.name = name;
        this.sourceCode = sourceCode;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sourceCode='" + sourceCode + '\'' +
                '}';
    }

    @Override
    public Project copy() {
        return new Project(id, name, sourceCode);
    }
}
