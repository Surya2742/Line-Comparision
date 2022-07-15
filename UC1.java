public class UC1 {
		
public static void main(String[] args) {
	UC1 Calculation = new UC1();
	double Length = Calculation.Co_Ordinates(1, 5, 3, 4);
	System.out.println("Distance between two point is : " + Length);
}

double Co_Ordinates (int x1, int x2, int y1, int y2)
{
	double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	return distance;
}

}
