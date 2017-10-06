package Exercise_3;

import java.text.DecimalFormat;

public class Volume_SurfaceArea {
	public static void main(String args[]) {
		int radius = 5;
		DecimalFormat fmt = new DecimalFormat ( "0.####"); 
		double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;
		double Surfacearea = 4 * Math.PI * Math.pow(radius, 2);
		System.out.println( "Volume : " + fmt.format(volume));
		System.out.println( "SurfaceArea : " + fmt.format(Surfacearea));
	}
}
