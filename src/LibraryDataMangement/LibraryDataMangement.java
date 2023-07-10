package LibraryDataMangement;

 class LibraryItems 
 {
	 String title;
	 int year;
	private int id;
	 
	 public void setter(int id)
	 {
		 this.id=id;
	 } 
	 public int getter()
	 {
		 return id;
	 }
 }
 
 class Book extends LibraryItems
 {
	 String author;
 }
 
 class Magazine extends LibraryItems
 {
	 int issue;
 }
 
public class LibraryDataMangement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magazine magazine = new Magazine();
		Book book = new Book();
		magazine.setter(10);
		book.author="Megul";
		System.out.println(book.author);
		System.out.println(magazine.getter());
	}

}
