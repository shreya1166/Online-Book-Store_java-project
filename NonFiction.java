abstract class NonFiction extends Book {
	float cost;
	public NonFiction(String title, float cost) {
		super(title);
		this.cost = cost;
	}
	//Setters and Getters
	public void setCost(int cost) {
		this.cost = cost;
	}
	public float getCost() {
		return cost;
	}
}

