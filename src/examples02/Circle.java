package examples02;



class Circle implements Shape{
int r;
public Circle(int x){
r=x;
}
public double getArea(){
return PI*r*r;
}
public void draw(){
System.out.println("�������� "+r+"�� ���Դϴ�.");
}
}
