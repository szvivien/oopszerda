package factory;

public class ShapeTest {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		  IShape shape1 = shapeFactory.getShape("CIRCLE");
	      System.out.println("A kor kerulete: " + shape1.getKerulet() + " terulete: " + shape1.getTerulet());
	      
	      IShape shape2 = shapeFactory.getShape("RETANGLE");
	      System.out.println("A teglalap kerulete: " + shape2.getKerulet() + " terulete: " + shape2.getTerulet());
	      
	      IShape shape3 = shapeFactory.getShape("SQUARE");
	      System.out.println("A negyzet kerulete: " + shape3.getKerulet() + " terulete: " + shape3.getTerulet());
	       
	}
		
}


