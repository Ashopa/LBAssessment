package ObjOriPgm;

public class Text extends File {
	
	public void textFile () {
		System.out.println("Text Method");
	}
	
	public static void main(String[] args) {
		
			File f1 = new File ();
			f1.fileType();
			
			Text t1 = new Text ();
			t1.textFile();

	}

}
