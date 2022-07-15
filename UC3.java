public class UC3 {

	double distance (int x1,int y1,int x2, int y2)
	{
		double distance;
		distance=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return distance;
	}
public static void main(String[] args) {
          UC2 Line_Equality = new UC2();
          double line1 = Line_Equality.distance(47,52,27,64);
          double line2 = Line_Equality.distance(74,25,72,46);
          System.out.println("Line1 value is : " + line1);
          System.out.println("Line2 value is : " + line2);
          if (Double.compare(line1,line2) < 0) {
              System.out.println("Line_2 is greater than Line_1");
              }
          else if (Double.compare(line1, line2) > 0) {
        	  System.out.println("Line_1 is greater Line_2");
        	  }
          else {
        	  System.out.println("Line1 and Line2 are equal");
          }

}
	
}
