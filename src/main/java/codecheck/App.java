package codecheck;

public class App {
	public static void main(String[] args) {
		if (args[0] == "encode") {
			String output = encode(args[1]);
			System.out.println(output);
		} else if (args[0] == "decode") {
			int output = decode(args[1]);
			System.out.println(output);
		} else if (args[0] == "align") {
			String output = align(args[1]);
			System.out.println(output);
		}
	}

	//与えられた10進数の数値をアルファベット数字に変換
	private static  String encode(String p){
		int param = Integer.parseInt(p);

		return null;
	}

	//与えられたアルファベット数字の値を10進数の数値に変換
	private static  int decode(String p){
		int param = Integer.parseInt(p);
		return 0;
	}

	 //あるアルファベット数字に対して、足すとアルファベット数字の値が、すべてHになるような値に変換
	private static  String align(String p){
		int param = Integer.parseInt(p);
		return null;
	}
}
