class Book{
	private int pageNumber;


	public int getPageNumber() {
		return pageNumber;
	}


	public void setPageNumber(int x) {
		if(x>0) {
		pageNumber = x;
		} else {
		System.out.println("Invalid page number");
		}
	}
}

public class LaunchBook {

	public static void main(String[] args) {
		Book b = new Book();
		b.setPageNumber(100);
		b.getPageNumber();
		System.out.println(b.getPageNumber());

	}

}
