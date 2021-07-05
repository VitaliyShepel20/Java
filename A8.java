public class A8{

    public static void main(String[] args) {
        Employee person = new Employee(12345);
        Employee.addMoney(person, 200);
        System.out.println(person.getEmployeeID());
        System.out.println(person.getMoney());
        person.payMoney(300);
        System.out.println(person.getMoney());

    }
}

interface IPerson {
    int payMoney(int toPay);

}

class Person implements IPerson{

    private int money;


    //getter for money
    public int getMoney(){
        return this.money;
    }

    public int payMoney(int toPay){
        money = this.money - toPay;
        return money;
    }

    public Person(){
        this.money = 10000;
    }

    public String toString(){
        return String.format("$%3.2f",(((double)money)/100));
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return money == other.money;
    }

}

class Employee extends Person {

    private final int employeeID;

    public Employee(int employeeID){
        super();
        this.employeeID = employeeID;//Set the field employeeID to the parameter employeeID. These should have the same name.
    }

    public int payMoney(int toPay){
        int temp = Math.round(toPay / 2);
        return super.payMoney(temp);
    }

    public String toString() {
        return "Employee " +employeeID + " has " +super.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (employeeID != other.employeeID)
            return false;
        return this.getMoney() == other.getMoney();
    }

    public static void addMoney(IPerson person, int amount){
        if (person instanceof Employee) {
            person.payMoney(amount*2*-1);
        }
        else {
            person.payMoney(amount*-1);
        }
    }

    //getter for employee id
    public int getEmployeeID() {
        return employeeID;

    }

}