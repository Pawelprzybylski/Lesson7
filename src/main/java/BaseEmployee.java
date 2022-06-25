public abstract class BaseEmployee {

    static final int ACTUAL_YEAR = 2022;
    private static final int DEFAULT_SALARY = 3000;
    private final int yearOfEmployment;
    private String name;
    private String surname;
    private int baseSalary;

    public BaseEmployee(String name, String surname, int yearOfEmployment) {
        this(name, surname, DEFAULT_SALARY, yearOfEmployment);
    }

    public BaseEmployee(String name, String surname, int baseSalary, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    @Override
    public String toString() {
        return "BaseEmployee{" +
                "name=" + name + "" +
                ", surname=" + surname + "" + ", Sallary" + baseSalary;
    }

    abstract int calculateMonthlySalary();

    int getYearsOfService() {
        return ACTUAL_YEAR - yearOfEmployment;
    }

}
