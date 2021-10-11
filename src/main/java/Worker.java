public class Worker {
    public String fullName;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

    public Worker(String fullName, String position, String email, String phoneNumber,
                  int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(fullName);
        System.out.println(position);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(salary + " $");
        System.out.println(age);
        System.out.println("________________");
    }

}
