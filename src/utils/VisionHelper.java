package utils;

public class VisionHelper {

	/**
	 * @param widthIN Width of the object you are tracking, in inches
	 * @param focal Focal length of the camera
	 * @param widthP Width of the object, in pixels
	 * @return Distance from the object
	 */
	public static double getDistance(double widthIN, 
			double focal, double widthP) {		
		/*
		 * The focal length can be calculated by using this equation backwards
		 * Take a picture of the object, measure the distance from it with a ruler,
		 * and then solve for focal length: F = (widthPixels x distance)/ widthInches
		 */
		return (widthIN * focal) / widthP;
	}
	
	public static boolean inRange(double offset, double pos, double target) {
		
		if ((pos >= (target - offset)) || (pos <= (target + offset))) {
			return true;
		} else return false;
		
	}
	
	public static enum Direction {LEFT, RIGHT};
	
	public static Direction getDirection(double pos, double target) {
		if (pos >= target) {
			return Direction.RIGHT;
		} else return Direction.LEFT;
	}
	
}
