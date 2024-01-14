import java.time.Year;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;


    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        } else {
            return 0.0;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double riseSalary() {
        int currentDate = Year.now().getValue();
        int workingYears = currentDate - this.hireYear;

        if (workingYears < 10) {
            return this.salary * 0.05;
        }
        else if (workingYears > 9 && workingYears < 20) {
            return this.salary * 0.10;
        }
        else if (workingYears > 19) {
            return this.salary * 0.15;
        } else {
            return this.salary;
        }

    }

    void printInfo() {

        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş artışı : " + this.riseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary + this.bonus() - this.tax()));
        System.out.println("Toplam Maaş : " + (this.salary + this.bonus() - this.tax() + this.riseSalary()));
    }


}
