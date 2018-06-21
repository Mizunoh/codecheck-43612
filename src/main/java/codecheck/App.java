package codecheck;

public class App {
	public static void main(String[] args) {
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		String sub = args[0];
		switch (sub) {
			case "encode": {
				String output = encode(args[1]);
				System.out.println(output);
				break;
			}
			case "decode": {
				int output = decode(args[1]);
				System.out.println(output);
				break;
			}
			case "align": {
				String output = align(args[1]);
				System.out.println(output);
				break;
			}
		}
	}

	//与えられた10進数の数値をアルファベット数字に変換
	private static  String encode(String p){
		int param = Integer.parseInt(p);
		String result = Integer.toString(param, 8);
		result.replace("0", "A")
				.replace("1", "B")
				.replace("2", "C")
				.replace("3", "D")
				.replace("4", "E")
				.replace("5", "F")
				.replace("6", "G")
				.replace("7", "H")
				.replace("8", "I");
		return result;
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
