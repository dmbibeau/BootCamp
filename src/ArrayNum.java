import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayNum {int left;
int right;
int count;
	Scanner kb = new Scanner(System.in);

	public int Smaller() {
		ArrayList<Integer> num = new ArrayList<>();
		System.out.println("please inter in a ray of numbers");
		while (kb.hasNextInt()) {
			int an = kb.nextInt();
			num.add(an);
		}
		return Collections.min(num);
	}
public int poplateArray(int left, int right,int count){
	int array []= new int[3];
	 array[0]=left;
	 array[1]=right;
	 array [2]=count;
	
	return array[3]; 
}
public double poplateArray(double left, double right, double count){
	double array []= new double[3];
	 array[0]=left;
	 array[1]=right;
	 array [2]=count;
	return array[3];
}
public int identifierGrow(){
	ArrayList<Integer>small= new ArrayList<>();
	small.add(1);
	small.add(1);
	small.add(1);
	small.add(1);
	//trimToSize()
	return List.get(small);
	
}
}
