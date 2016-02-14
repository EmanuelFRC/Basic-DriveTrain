package utils;

import java.io.IOException;
import java.util.ArrayList;

import edu.wpi.first.wpilibj.networktables.NetworkTable;

public class GRIPVision {

	private static GRIPVision instance;
	private static NetworkTable grip;
	private static String tableName = "GRIP/myContoursReport";
	public static final int screenHeight = 640;
	public static final int screenWidth = 480;
	
	public static void init() {
		instance = new GRIPVision();
		grip = NetworkTable.getTable(tableName);
		try {
			new ProcessBuilder("/home/lvuser/grip").inheritIO().start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static GRIPVision get() {
		if (instance == null) {
			init();
		}
		return instance;
	}
	
	public class Contour {
		private double area,
		centerX, 
		centerY, 
		height, 
		width, 
		solidity;

		public Contour(double area, double centerX, double centerY,
				double height, double width, double solidity) {
			this.area = area;
			this.centerX = centerX;
			this.centerY = centerY;
			this.height = height;
			this.width = width;
			this.solidity = solidity;
		}

		public double getArea() {
			return area;
		}

		public double getCenterX() {
			return centerX;
		}

		public double getCenterY() {
			return centerY;
		}

		public double getHeight() {
			return height;
		}

		public double getWidth() {
			return width;
		}

		public double getSolidity() {
			return solidity;
		}
		
		public void printContour() {
			System.out.println("Contour found:"
					+ "\n\tArea : " + area
					+ "\n\tCenterX : " + centerX
					+ "\n\tCenterY : " + centerY
					+ "\n\tHeight : " + height
					+ "\n\tWidth : " + width
					+ "\n\tSolidity : " + solidity
					);
		}
		
	}
	
	public ArrayList<Contour> getContours() {
		ArrayList<Contour> contours = new ArrayList<>();
		
		double[] areas = grip.getNumberArray("area", new double[0]);
		double[] centerXs = grip.getNumberArray("centerX", new double[0]);
		double[] centerYs = grip.getNumberArray("centerY", new double[0]);
		double[] heights = grip.getNumberArray("height", new double[0]);
		double[] widths = grip.getNumberArray("width", new double[0]);
		double[] solidities = grip.getNumberArray("solidity", new double[0]);
		
		for (int i = 0; i <= areas.length; i++) {
			Contour c = new Contour(areas[i], centerXs[i], centerYs[i], heights[i], widths[i], solidities[i]);
			contours.add(c);
		}
		
		return contours;
	}
	
}
