public abstract class Book {
	String title;
	Book(String title) {
		this.title=title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}

	public abstract float getCost();
	public abstract void setCost(float cost);
	public abstract void displayInfo();
}


