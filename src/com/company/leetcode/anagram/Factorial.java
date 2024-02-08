package com.company.leetcode.anagram;

/* Write Java code for finding factorial of number -> input 3 -> 6 */

public class Factorial {

    public static void main(String[] args) {
        System.out.println(findFactorialWithIteration(5));
        System.out.println(findFactorialWithRecursion(5));
    }

    public static int findFactorialWithIteration(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        int pow = 1;
        for (int i = 1; i <= number; i++) {
            pow = pow * i;
        }
        return pow;
    }

    public static int findFactorialWithRecursion(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * findFactorialWithIteration(number-1);
    }
}

/*

SQL injection - SQL Injection veb applere dağıdıcı təsir göstərə bilən kritik security acigidir.
Attacker proqramın input datalari vasitesile SQL sorğusunu manipulyasiya etdikdə baş verir.
Sql injection ne zaman bas vere biler ? --- sql injection esasen user inputlari ile backde her hansi validation etmeden
sql statement create edilerse bas vere biler.

Sql injectionun common entry pointleri bunlardir :

1.User input fields in web forms
2.url parameters
3.http headers
4.cookies

Examples of SQL injection
-- Simple java code ile baxaq :

String query = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password + "'";

Example of an SQL Injection Attack:

SELECT * FROM users WHERE username = 'admin' --' AND password = ''

-- sqlde commentdir ve potensial olaraq unauthorized sekilde sisteme girise access verir.

In a Spring Boot application, you can prevent SQL injection attacks by following several best practices:

1. Use Spring Data JPA or Spring JDBC Templates:
Spring Data JPA Example:

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

Spring JDBC Templates Example:

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{username}, new UserRowMapper());
    }
}


2. Prepared Statements:

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = :username";
        Map<String, Object> params = Collections.singletonMap("username", username);
        return namedParameterJdbcTemplate.queryForObject(sql, params, new UserRowMapper());
    }
}

3. Input Validation:

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserService {

    public User findByUsername(String username) {
        if (StringUtils.isEmpty(username)) {
            throw new IllegalArgumentException("Username must not be empty");
        }
        // Perform database operation...
    }
}

4. Avoid Dynamic SQL Generation:

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Query methods provided by Spring Data JPA
    User findByUsername(String username);
}

5. Database Configuration:

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/mydatabase?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC
    username: myusername
    password: mypassword
    validation-query: SELECT 1   ----In this example, we configure the validation-query property to validate connections before use, helping to detect and reject invalid connections.

6. Database User Permissions:
Ensure that the database user account used by your Spring Boot application has limited privileges,
 granting only the necessary permissions required for database operations.

************************************************************************************************************************

Trigger -
logback.xml -

*/
