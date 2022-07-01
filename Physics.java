class Physics extends NonFiction {
	float rating;
	public Physics(String title, float cost, float rating) {
		super(title, cost);
		this.rating = rating;
	}
	//Setters and Getters
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	//Setters and Getters
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void displayInfo() {
		System.out.println("Title: " + super.getTitle());
		System.out.println("Cost: " + super.getCost());
		System.out.println("Rating: " + rating);
		System.out.println(" ");
	}
}