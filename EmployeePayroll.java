class Payroll {

    // a. employeeID only
    void salary(int employeeID) {
        System.out.println("Employee ID: " + employeeID);
    }

    // b. hours_worked and rate
    void salary(int hours, double rate) {
        double pay = hours * rate;
        System.out.println("Salary (Hours * Rate): " + pay);
    }

    // c. ID with bonus
    void salary(int employeeID, double bonus) {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Bonus: " + bonus);
    }

    // d. annual_salary
    void salary(double annualSalary) {
        System.out.println("Annual Salary: " + annualSalary);
    }

    // e. with_overtime
    void salary(int hours, double rate, int overtimeHours) {
        double pay = (hours * rate) + (overtimeHours * rate * 1.5);
        System.out.println("Salary with Overtime: " + pay);
    }

    // f. with_deductions
    void salary(double salary, double deductions) {
        double finalPay = salary - deductions;
        System.out.println("Salary after Deductions: " + finalPay);
    }

    // g. with_bonus and deductions
    void salary(double salary, double bonus, double deductions) {
        double finalPay = salary + bonus - deductions;
        System.out.println("Salary with Bonus and Deductions: " + finalPay);
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {

        Payroll p = new Payroll();

        p.salary(101);                      // employeeID
        p.salary(40, 20);                   // hours_worked and rate
        p.salary(101, 5000.0);              // ID with bonus
        p.salary(600000.0);                 // annual_salary
        p.salary(40, 20, 5);                // with_overtime
        p.salary(50000.0, 5000.0);          // with_deductions
        p.salary(50000.0, 5000.0, 2000.0);  // bonus and deductions
    }
}
