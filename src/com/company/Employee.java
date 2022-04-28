package com.company;

public class Employee {
    // if the company name is same for all employees, make that property as a static property.
    //So that, the company name will be same for all employees. if it is not static, company name will be allocated for
    //all the objects(employees) of the class and it's a wastage of memory.
    private static String companyName="Pragra";//this is in the class level and not in the object level.
    //public static String companyName="Pragra";
    //it is good to make those static things as public.


    private int id;
    private String name;
    private String address;
    //below line specifies how to declare a parameterized constructor
    public Employee (int id,String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }

    public static String getCompanyName() {
        return companyName;
    }

    // the toString method will return the stringified object combining all the properties inside the object.
    // if toString method is not created, sout ing the object will return the hash code of the object.
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    //    int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }


}
