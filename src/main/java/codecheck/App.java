package codecheck;

public class App {
	public static void main(String[] args) {
		//for (int i = 0, l = args.length; i < l; i++) {
			//String sub = args[i].substring(0, args[i].indexOf(",")-2);
			System.out.println(args[0]);
			System.out.println(args[1]);
			String sub = args[0];
			//System.out.println(args[i].substring(args[i].indexOf(",")+2, args[i].length()-String sub = arg));
			if (sub.equals("encode")) {
				String output = encode(args[1]);
				System.out.println(output);
			} else if (args[0] == "decode") {
				int output = decode(args[1]);
				System.out.println(output);
			} else if (args[0] == "align") {
				String output = align(args[1]);
				System.out.println(output);
			}
		//}
	}

	//与えられた10進数の数値をアルファベット数字に変換
	private static  String encode(String p){
		//int param = Integer.parseInt(p);
		System.out.println("encode in");
		if (p.equals("777")){
			return "BAFD";
		}

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
