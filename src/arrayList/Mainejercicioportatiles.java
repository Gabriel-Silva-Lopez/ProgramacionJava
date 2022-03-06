package arrayList;
import java.util.ArrayList;

public class Mainejercicioportatiles {
	
	public static void main (String[]args) {
	ArrayList<Portatil> p = new ArrayList<Portatil>();
	
	Portatil p1 = new Portatil("Toshiba", "475485I", "i7-9700K", "Intel(R)UHD Graphics", 8, 256);
	Portatil p2 = new Portatil("Asus", "85874YF", "i9-10900K", "Nvidia GTX 1650" , 16, 512);
	Portatil p3 = new Portatil("Apple", "588586L", "i3-10300K", "Intel (R)UHD Graphics", 16, 480);
	Portatil p4 = new Portatil("HP", "685849U", "i7-7700U", "Nvidia GTX 780", 16, 1024);
	Portatil p5 = new Portatil("Acer", "557591P", "i5-6600", "Intel (R) UHD Graphics", 8, 256);
	Portatil p6 = new Portatil("Dell", "O37495R", "i9-9900", "Radeon 5600M", 16, 512);
	
	p.add(p1);
	p.add(p2);
	p.add(p3);
	p.add(p4);
	p.add(p5);
	p.add(p6);
	}
}
