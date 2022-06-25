public class Menager extends BaseEmployee {

    private static final int DEFAULT_SALARY = 5000;
    private static final int DEFAULT_BONUS=500;
    private int bonus;


    public Menager(String name, String surname, int baseSallary, int yearOfEmployment) {
        super(name, surname, baseSallary, yearOfEmployment);
        this.bonus = 500;
    }

    public Menager(String name, String surname, int yearOfEmployment) {
        super(name, surname, DEFAULT_SALARY, yearOfEmployment);
        this.bonus = 500;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    int calculateMonthlySalary() {
        return getBaseSalary() + bonus;
    }

}
