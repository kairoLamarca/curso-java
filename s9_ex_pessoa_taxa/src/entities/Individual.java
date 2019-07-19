package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {

		double total = 0.0;

		if (anualIncome < 20000.0) {
			total = anualIncome * 0.15;
		} else {
			total = anualIncome * 0.25;
		}

		if (healthExpenditures > 0.0) {
			total -= healthExpenditures * 0.5;
		}

		return total;
	}

}
