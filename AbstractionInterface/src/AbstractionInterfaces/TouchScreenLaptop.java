package AbstractionInterfaces;

public interface TouchScreenLaptop {

	void scroll();
	void click();
	
	public static void main(String[] args) {
		TouchScreenLaptop t = new HPNoteBook();
		t.click();
		t.scroll();
		TouchScreenLaptop d = new DellNoteBook2();
		d.click();
		d.scroll();
		
	}
}
