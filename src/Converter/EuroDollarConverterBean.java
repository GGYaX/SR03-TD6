package Converter;

public class EuroDollarConverterBean {
	private Float taux;
	private Float euros;
	private Float dollars;

	public Float getEuros() {
		if(euros  != null)
			return euros;
		else if(taux != null && dollars  != null)
			return dollars / taux;
		else
			return 0.0f;
	}

	public void setEuros(Float euros) {
		this.euros = euros;
	}

	public Float getDollars() {
		if(dollars != null)
			return dollars;
		else if(taux != null && euros != null)
			return euros * taux;
		else
			return 0.0f;
	}

	public void setDollars(Float dollars) {
		this.dollars = dollars;
	}

	public Float getTaux() {
		return taux;
	}

	public void setTaux(Float taux) {
		this.taux = taux;
	}
}
