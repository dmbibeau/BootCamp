import java.util.ArrayList;


public class Erastrithenes {

public static void main(String[] args){

ArrayList<Integer> list= new ArrayList<>();

for(int i=2;i<101;i++){
list.add(i);
}

list=iterator(list);

for(int i = 0; i < list.size(); i++){
	System.out.print(list.get(i)+ " ");	
}
System.out.println();

} 
public static ArrayList<Integer> iterator(ArrayList<Integer> list){
	for(int i=0;i<list.size()-1; i++){
		if(list.get(i)%2==0)
	list.remove(i);
		if(list.get(i)%3==0)
	list.remove(i);
	}
	return list;
	
}}