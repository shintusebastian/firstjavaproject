package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount customer1=new BankAccount("Shintu Sebastian", 9400443177L, 5483336577L);
customer1.depositAmount(500.50D);

        customer1.depositAmount(500);
        System.out.println(customer1);
        customer1.withdraw(500);
        Employee employee1=new Employee(793537,"Shintu","King Street");
        System.out.println(Employee.getCompanyName());
Student student= new Student("80 Roseview Avenue","Neethu", 897283);
        System.out.println(student);


    }

    }

