public class MyFirstProgramm {

	public static void main(String[] args) {
		hello("world");
		hello("user");
		hello("alexey");
		hello1("world111");
		hello1("user111");
		hello1("alexey111");

		int len = 5;
		System.out.println("ploshad kvadrata so storonoy " + len + " = " + area(len));

		int men = 10;
		System.out.println("ploshad kyba so storonoy " + men + " = " + area1(men));

		int den1 = 200;
		int den2 = 1000;
		System.out.println("ploshad pryamoygolnika so storonami " + den1 + " i " + den2 + " = " + area(den1, den2));
	}

	public static void hello (String somebody) {
		System.out.println("Hello, " + somebody + "world!");
	}

	public static void hello1 (String somebody) {
		System.out.println("Hello, " + somebody + "world!");
	}

	public static int area(int l) {
		return l * l;
	}

	public static int area1(int m) {
		return m * m * m + 999;
	}

	public static int area(int a, int b) {
		return a * b;
	}

}

