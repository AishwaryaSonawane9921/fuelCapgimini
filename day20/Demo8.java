//ArrayList class
import java.util.*;
public class Demo8{
public static void main(String[]args){
//create Arraylist object
ArrayList<String> ar;
ar = new
ArrayList<>();
//check size of ArrayList
System.out.print(ar.size());
// add item in arraylist
ar.add("A");
ar.add("B");
ar.add("C");
ar.add("D");


ar.add("E");
System.out.println(ar.get(0));
// System.out.println(ar.Size());
// add item ata specific index
ar.add(1, "X");
System.out.println("By using for loop....");
for(int i=0;i< ar.size();i++){
System.out.println(ar.get(i));
}
System.out.println("By using for each loop");
for (String s: ar){
System.out.println(s);
}
System.out.println("By using Iterator");

Iterator<String>it;
it=ar.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
System.out.println(" By using ListIterator");
ListIterator it1;
it1=ar.listIterator();
System.out.println("Forward....");
while(it1.hasNext()){
System.out.println(it1.next());
}
System.out.println("Backward....");
while(it1.hasPrevious()){
System.out.println(it1.previous());
}
}
}









