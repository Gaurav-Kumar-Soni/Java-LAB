class person {

    int age;
    int salary;

    person(int age, int salary) {
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

}

class employee extends person {
    int employee_id;
    String job_title;

    employee(int employee_id, int age, int salary, String job_title) {
        super(age, salary);
        this.employee_id = employee_id;
        this.job_title = job_title;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    @Override
    public int getAge() {
        System.out.println("employee job title is: " + job_title);
        return super.getAge();
    }
}

class Question1 {
    public static void main(String[] args) {
        person obj_p1 = new person(23, 1500000);
        employee obj_e1 = new employee(142, 25, 1800000, "SDE");

        System.out.println("person's age is: "+ obj_p1.getAge());
        System.out.println("Employee ID : " + obj_e1.getEmployee_id());
        System.out.println("After override of getAge function age : "+ obj_e1.getAge());
    }
}

