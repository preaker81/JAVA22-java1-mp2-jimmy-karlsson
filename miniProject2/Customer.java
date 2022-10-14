package miniProject2;

class Customer {
	private int prodAmount = 0;
	private double sumCost = 0;

	Customer(int prodAmount, double sumCost) {
		this.prodAmount = prodAmount;
		this.sumCost = sumCost;
	}

	// Metoder
	void setAddToCart(int prodAmount, double sumCost) {
		this.prodAmount += prodAmount;
		this.sumCost += sumCost;
	}

	int getProdAmount() {
		return this.prodAmount;
	}

	double getsumCost() {
		return this.sumCost;
	}

}