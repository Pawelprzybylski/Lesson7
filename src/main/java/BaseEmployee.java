public abstract class BaseEmployee {

    private String name;
    private String surname;
    private int baseSallary = 3000;
    private int yearOfEmployment;
    private static final int Default_Sallary = 3000;

    public BaseEmployee(String name, String surname, int baseSallary, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.baseSallary = baseSallary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public BaseEmployee(String name, String surname, int yearOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.yearOfEmployment = yearOfEmployment;
        this.baseSallary = Default_Sallary;

    }

    public int getBaseSallary() {
        return baseSallary;
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
                ", surname=" + surname + "" + ", Sallary" + baseSallary;
    }

    abstract int calculateMonthlySalary();

}


