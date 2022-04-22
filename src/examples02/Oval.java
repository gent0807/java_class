package examples02;

public class Oval implements Shape{
int x, y;
public Oval(int x, int y){
this.x=x;
this.y=y;
}
public void draw(){
System.out.println(x+"x"+y+"에 내접하는 타원입니다.");
}

public double getArea(){
return PI*(x/2)*(y/2);
}
}
