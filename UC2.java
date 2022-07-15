public class UC2 {

	double distance (int x1,int y1,int x2, int y2)
	{
		double distance;
		distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return distance;
	}
public static void main(String[] args) {
          UC2 Line_Equality = new UC2();
          double line1 = Line_Equality.distance(98,55,22,44);
          double line2 = Line_Equality.distance(98,55,22,44);
          if (line1 == line2) {
              System.out.println("Line1 and Line2 are equal");
          }
          else {
        	  System.out.println("Line1 and Line2 are not equal");
        	  
           }

}
          
}
