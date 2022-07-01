class BookShelf {
	public static Book createBook(String sType) throws GenreInvalidException {
		Book s=null;

		if(sType.equals("Adventure")) {
			s=new Adventure("Adventure Odyssey", 149, 2);
		}
		else if(sType.equals("Classic")) {
			s=new Classic("Classic Dracula", 418, 4);
		}
		else if(sType.equals("Physics")) {
			s=new Physics("Physics NonFiction Cosmos", 1486, 3);
		}
		else if(sType.equals("History")) {
			s=new History("History NonFiction Orientalism", 243, 5);
		}else{
		    throw new GenreInvalidException();
		}
		return s;
	}
}


