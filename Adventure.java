class Adventure extends Book {
	float cost;
	int rating;
	public Adventure(String title, float cost, int rating) {
		super(title);
		this.cost = cost;
		this.rating = rating;
	}
	//Setters and Getters
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void displayInfo() {
		System.out.println("Title: " + super.getTitle());
		System.out.println("Cost: " + cost);
		System.out.println("Rating: " + rating);
		System.out.println(" ");
	}
}
