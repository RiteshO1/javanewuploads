package com.itp.task;

public class Box {
	
	private double length;
    private double width;
    private double height;
    
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
        }
   
        public Box createNewBox(double lOffset, double wOffset, double hOffset) {
            return new Box(this.length + lOffset, 
            				this.width + wOffset,
            					this.height + hOffset);
        }

        public String getDetails() {
            return "Box Dimensions -> Length: " + this.length + ", Width: " + this.width + ", Height: " + this.height;
        }
}
