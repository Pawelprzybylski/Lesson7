public class TicketSeller extends BaseEmployee {

    public final int sallary = 3000;
    static final int actualYear = 2022;
    final static int yearOfEmployment = 2020;

    public TicketSeller(String name, String surname, int baseSallary) {
        super(name, surname, baseSallary);
    }

    @Override
    int calculateMonthlySalary() {
        return getBaseSallary();
    }

    int yearsOfService() {
        return actualYear - yearOfEmployment;
    }

}

