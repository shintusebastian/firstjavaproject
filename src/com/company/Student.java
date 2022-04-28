package com.company;

public class Student {
    public static final String SCHOOL_NAME = "Pragra";
    //thumb rule: according to naming convention, all the constants must be in upper case.

    // Thumb rule: if we are creating a static data member, make it as final.
// thumb rule: if we declare a final data member, we should initialize it. Otherwise, it will throw error.

//    static {
//        schoolName = "Pragra";// if we need to initialize this way, do not make it final.
//    }

    private String studentName;
    private long studentID;
    private String studentAddress;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public long getStudentID() {
        return studentID;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student(long studentID) {
        this.studentID = studentID;
    }

    //if we try to define public Student(String studentAddress it will show error because the signature is not different
    //So, line 35 and 42 will be taken as same by Java as the signature is same. So Java will show error.
    public Student(String studentAddress, String studentName) {
        this(studentName);
        this.studentAddress = studentAddress;
    }

    public Student(String studentName, String studentAddress, long studentID) {
        this(studentName, studentAddress);
        this.studentID = studentID;
    }

//thumb rule: from the static level we can only see the static things.
    //in the below class, we can only access static members of the class and if we try to access the object members,
    // it will throw error.

    // On contrary, we can see the static things of a class from the object level because the static things are
    //already loaded before the object was created.
    // So, the instance can see the static things of a class.
    public static void greet() {
        System.out.println(SCHOOL_NAME);
        // this is possible because SCHOOL_NAME is a static member of the class.
        System.out.println("Hello..Good Morning. Have a nice day....");
    }

    public void goodMorning() {
        System.out.println(SCHOOL_NAME);// this is a static variable. This verifies that the instance level can see the static things.
        System.out.println(studentID);//studentID is an instance related thing.
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID=" + studentID +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
