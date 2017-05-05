public class Square extends Shape{
	
	private double size;
	
	public Square(double size) {
		this.size = size;
	}
	
	@Override
	public double area() {
		return size * size;
	}
	
	@Override
	public double perimeter() {
		return size * 4;
	}
	
	public double getSize() {
		return size;
	}
	
	/*
	public int compareTo(Square rhs) {
		double diff = area() - rhs.area();
		if (diff < 0) {
			return -1;
		} else if (diff > 0) {
			return 1;
		} else {
			return 0;
		}
	}
	*/
}