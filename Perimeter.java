import java.util.*;

public class Perimeter {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int l, b;
		System.out.println("Enter len and bred");
		l = scan.nextInt();
		b = scan.nextInt();
		peri p1 = new peri(l,b);
		p1.cal_peri();
	}
}

class peri {
	int len;
	int bred;

	peri(int x, int y)// Constructor
	{
		len = x;
		bred = y;
	}

	void cal_peri() {
		int p;
		p = 2 * (len + bred);
		System.out.println("Perimeter is:" + p);
	}
}
