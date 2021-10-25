package shapes;

public class ShapeFactory {
	public Shapes getObjectForShapes(int number) {
		switch (number) {

		case 1:
			return new Diamond();
		case 2:
			return new IsoscelesTriangle();
		case 3:
			return new RightAngle();
		case 4:
			return new RightAngleMirrored();
		case 5:
			return new Rectangle();
		}
		throw new MisSelectionException("SELECT A SHAPE BETWEEN 1-5");

	}
}
