package week3.day1;

public class Desktop extends computer {
	
	public void desktopSize() {
		System.out.println("Size of the Desktop");
	}
	public static void main(String[] args) {
		
		//Single inheritance
		Desktop objD=new Desktop();
		objD.desktopSize();
		objD.computerModel();
	}

}
