// implementing multiple interface
interface A{
void add(int X, int y);
}
interface B{
public abstract void sub(int x, int y);
}
class Test implements A,B{
@Override
public void sub(int x, int y){
System.out.println(x-y);
}
@Override
public void add(int x, int y){
System.out.println(x+y);
}
}
class Demo4{
public static void main(String[]args)
{
Test t1 = new Test();
t1.add(100,200);
t1.sub(90,10);
}
}

