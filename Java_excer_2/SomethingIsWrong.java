package training;
class Rectangle
{
	int width;
	int height;

	public int area()
	{
		return width*height;
	}
}

public class SomethingIsWrong {
	
	public static void main(String args[]) {
	
    Rectangle myRect = new Rectangle();
    myRect.width = 40;
    myRect.height = 50;
    System.out.println("myRect's area is " + myRect.area());


}
}