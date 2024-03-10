package Pertemuan5;

public class StrukturListTest {
	public static void main(String[] args) {
		 StrukturList list = new StrukturList();
		 System.out.println("Latihan 2");
	     list.addHead(2);
	     list.addMiddle(6,2);
	     list.addMiddle(3,3);
	     list.addMiddle(5,4);     
	     list.addTail(1);
	     list.displayElement();
	     System.out.println("\nHapus elemen di akhir list : ");
	     list.removeMid(3);
	     list.displayElement();
	     System.out.println("\nHapus elemen di akhir list : ");
	     list.removeMid(6);
	     list.removeMid(5);
	     list.displayElement();
    }
}
