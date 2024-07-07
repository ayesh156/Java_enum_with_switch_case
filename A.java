enum Size{
	XS,S,M,L,XL,XXL
}

class A {

	public static void main(String[] args){
		Size size = Size.S;
		switch(size){
			case XS:
				System.out.println("10");
			case S:
				System.out.println("20");
			case M:
				System.out.println("30");
			default:
			System.out.println("A");
		}
	}
}