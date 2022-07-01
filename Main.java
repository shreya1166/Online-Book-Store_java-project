import java.util.*;
public class Main {
	public static void main(String[] args) {
		int n;
		float totalCost = 0;
		String sType;
		Scanner sc = new Scanner(System.in);
		ArrayList<Book> bookList = new ArrayList<Book>();
		System.out.println("Enter Number of Books");
			n = sc.nextInt();
			sc.nextLine();
		for(int i=0;i<n;i++) {
			try{
			    System.out.println("Enter the type of Book (Options: Adventure, Classic; non-Fiction options: Physics, History)");
		    	sType = sc.nextLine();
			    bookList.add(BookShelf.createBook(sType));
			    bookList.get(bookList.size() - 1).displayInfo();
		        
			}catch(GenreInvalidException e){
                System.out.println(e);
                System.out.println();
			}
		}
		System.out.println("Do you want to buy the book(s)?\ntype true for yes\nand false for no");
		boolean b = sc.nextBoolean();
		if(b) {
    		for(Book s:bookList) {
    			s.displayInfo();
    			totalCost += s.getCost();
    		}
		    System.out.println("And that would be Rs "+totalCost+"\n Thanks for shopping!");
		}
		sc.close();
	}
}