package com.practice.StringBuilder;

public class QyeryConstructor extends Object {

    public static String Query = "Employee Id";

    public String constructorQuery(String empId, int emp_salary) {
        StringBuilder finalQuery = new StringBuilder(Query);

        if (empId != null) {
            finalQuery.append("where empId = " + empId);
        } else if (emp_salary != 0) {
            finalQuery.append("emp_salary " + emp_salary);
        } else {
            finalQuery.append(" nothing is here ");
        }

        return finalQuery.toString();
    }
}