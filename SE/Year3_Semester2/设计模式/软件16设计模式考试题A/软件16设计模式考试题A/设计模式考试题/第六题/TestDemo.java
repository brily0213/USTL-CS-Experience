package µÚÁùÌâ;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeFactory redShapeFactory = new RedShapeFactory();
        Shape circle = redShapeFactory.getCircle();
		circle.draw();   
		Shape rectangle = redShapeFactory.getRectangle();		
		rectangle.draw();	
		
		ShapeFactory BlueShapeFactory = new BlueShapeFactory();		        
		Shape BlueCircle = BlueShapeFactory.getCircle();
		BlueCircle.draw();
		Shape Bluerectangle = BlueShapeFactory.getRectangle();
		Bluerectangle.draw();
	   
	}

}
