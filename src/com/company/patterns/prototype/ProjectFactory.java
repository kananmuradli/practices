package com.company.patterns.prototype;

public class ProjectFactory {

    private final Project project;

    public ProjectFactory(Project project){
        this.project = project;
    }

    public Project cloneProject() {
        return project.copy();
    }
}
