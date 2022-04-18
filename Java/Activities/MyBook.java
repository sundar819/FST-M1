package activities;

public class MyBook extends Activity5 {

	@Override
	public void setTitle(String s) {
		title=s;
		
	}
	
public static void main(String[] args) {
		
		MyBook newNovel = new MyBook();
		newNovel.setTitle("Readers Digest");
		System.out.println("Title of the book is  " +newNovel.getTitle());
	}

}
