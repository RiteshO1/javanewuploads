package com.itp.task;

public class Point2D {
	
	private int x,y;
	
	public Point2D(int x,int y) {
		this.x = x;
        this.y = y;
		
	}
	public String getDetails() {
		return "cordinates are"+ x+" "+y;
	}
	public boolean isEquals(Point2D p3) {
		return this.x == p3.x && this.y == p3.y;
	}
	
	Point2D createNewPoint(int xoffset,int yoffset) {
		Point2D newPoint = new Point2D(this.x+xoffset, this.y+yoffset);
		return newPoint;
	}
	
	public int calcDistance(Point2D p3) {
		    return (int) Math.sqrt(Math.pow(this.x - p3.x, 2) + Math.pow(this.y - p3.y, 2));
		
	}


}
