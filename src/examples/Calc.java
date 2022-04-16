package examples;

abstract class Calc {
	int a;
	int b;
	public void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	abstract int calculate();
}

class Add extends Calc{
	int calculate() {
		return a+b;
	}
}
class Sub extends Calc{
	int calculate() {
		return a-b;
	}
}
class Mul extends Calc{
	int calculate() {
		return a*b;
	}
}
class Div extends Calc{
	int calculate() {
		return a/b;
	}
}