package curso_java;

public class ProcessamentoDados {

	public static void main(String[] args) {
		int x,y,m;
		double p,b,B,h,area;
		x = 5;
		y= 2 * x;
		m = 5;
		p = 2 * m;
		b=6.0;
		B=8.0;
		h=5.0;
		area = (b+B)/2.0*h;
		
		System.out.println(area);
		System.out.println(x);
		System.out.println(y);
		System.out.println(m);
		System.out.println(p);
		System.out.println("================");
		x = 5;
		y = 2;
		p = (double)x / y;//casting
		System.out.println(p);
		
		p = 5.0;
		x = (int)p;//casting
		System.out.println("================");
		System.out.println(x);
	}

}
