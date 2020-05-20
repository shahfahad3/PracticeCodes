import java.lang.*;
import java.util.Scanner;
public class clock {

	public static double angle(int hour, int minute) {
		if (hour < 0 || minute < 0) {
			return -1;
		}
		if (hour == 12) {
			hour = 0;
		}
		if (minute == 60) {
			minute = 0;
			hour += 1;
		}
		double hourAngle = (hour * 60 + minute) * 0.5;
		double minAngle = minute * 6;
		double bwAngle = Math.abs(hourAngle - minAngle);
		return Math.min(360 - bwAngle, bwAngle);

	}

	public static void main(String[] args) {
      int p;
      Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
      float r=sc.nextFloat();
     float p1=(p*r)/360;;
      int dec=(int)p1;
      int fl=(int)(((p1-dec)*100)/1.666);
      
		System.out.println(String.format("%.2f",angle((int)p1, fl)));
		//System.out.println(p1+" "+ fl);
		//System.out.println(angle(2, 23));

	}

}