package activityTwo1;

public class Activity2 extends MyBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title="Autocar India";
		MyBook newNovel = new MyBook();
		newNovel.setTitle(title);
		
		System.out.println("The title of Book is "+ newNovel.getTitle());
		

	}

}
