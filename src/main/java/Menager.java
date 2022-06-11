public class Menager extends BaseEmployee {

    private final int sallary = 5000;
    private int bonus;

    public Menager(String name, String surname, int baseSallary, int yearOfEmployment, int bonus) {
        super(name, surname, baseSallary, yearOfEmployment);
        this.bonus = bonus;
    }

    @Override
    int calculateMonthlySalary() {
        return getBaseSallary() + bonus;
    }

}
