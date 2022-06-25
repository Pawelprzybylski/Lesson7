public class TicketSeller extends BaseEmployee {

    public TicketSeller(String name, String surname, int baseSallary, int yearOfEmployment) {
        super(name, surname, baseSallary, yearOfEmployment);
    }

    public TicketSeller(String name, String surname, int yearOfEmployment) {
        super(name, surname, yearOfEmployment);
    }
    @Override
    int calculateMonthlySalary() {
        return getBaseSalary();
    }

}

