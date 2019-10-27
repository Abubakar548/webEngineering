import java.util.*;
public class Main{
	
	public static void main (String [] args)
	{
		
		System.out.println("FOR Square");
		Square sqr = new Square (1,2,3);
		sqr.calculateArea();
		sqr.calculateVolume();
		sqr.toString();
		
		System.out.println();
		
		System.out.println("FOR Sphere");
		Sphere sph = new Sphere (1);
		sph.calculateArea();
		sph.calculateVolume();
		sph.toString();
		
		System.out.println();
		
		System.out.println("FOR UPcasting");
		Shape s = new Sphere (2);
		s.calculateArea();
		s.calculateVolume();
		s.toString();

		System.out.println();
		
		System.out.println("FOR DOWNcasting");
		Shape s1 = new Sphere (3);
		Sphere sp = new Sphere(4);
		sp = (Sphere)s1;
		sp.calculateArea();
		sp.calculateVolume();
		sp.toString();		
	}
}