package com.company.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        var dbConnection = DbConnection.getDbConnection();
        dbConnection.addQuery("First query");
        dbConnection.addQuery("Second query");
        dbConnection.showQueries();

        var dbConnection2 = DbConnection.getDbConnection();
        dbConnection2.addQuery("Third query");
        dbConnection2.showQueries();
        System.out.println("------");
        dbConnection.showQueries();
    }
}
