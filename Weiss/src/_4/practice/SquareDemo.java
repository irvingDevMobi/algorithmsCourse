public class SquareDemo {

	public static void main(String [] args) {
		Square [] squares = new Square[5];
		squares[1] = new Square(3);
		squares[2] = new Square(5);
		squares[3] = new Square(1);
		squares[4] = new Square(4);
		squares[0] = new Square(3);
		Square max = squares[0];
		for(int i = 1; i < squares.length; i++) {
			if (max.compareTo(squares[i]) < 0) {
				max = squares[i];
			}
		}
		System.out.println("Square: " + max.getSize());
	}
}