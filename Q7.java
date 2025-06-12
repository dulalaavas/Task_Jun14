interface Employee {
    void work();
    double getSalary();
}

class Chef implements Employee {
    public void work() {
        System.out.println("Chef is cooking delicious meals.");
    }

    public double getSalary() {
        return 50000;
    }
}

class Waiter implements Employee {
    public void work() {
        System.out.println("Waiter is serving customers.");
    }

    public double getSalary() {
        return 30000;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Employee chef = new Chef();
        Employee waiter = new Waiter();

        chef.work();
        System.out.println("Chef Salary: " + chef.getSalary());

        waiter.work();
        System.out.println("Waiter Salary: " + waiter.getSalary());
    }
}
