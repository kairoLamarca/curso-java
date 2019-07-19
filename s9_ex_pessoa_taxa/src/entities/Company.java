package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {

		double total = 0.0;

		if (numberOfEmployees > 10) {
			total = anualIncome * 0.14;
		} else {
			total = anualIncome * 0.16;
		}

		return total;
	}

}
