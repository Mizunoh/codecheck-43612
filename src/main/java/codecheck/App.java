package codecheck;

public class App {
	public static void main(String[] args) {
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
		String result = Integer.toString(param, 9);
		String resultChar = result.replace("0", "A")
				.replace("1", "B")
				.replace("2", "C")
				.replace("3", "D")
				.replace("4", "E")
				.replace("5", "F")
				.replace("6", "G")
				.replace("7", "H")
				.replace("8", "I");
		return resultChar;
	}

	//与えられたアルファベット数字の値を10進数の数値に変換
	private static  int decode(String p){
		String paramInt = p.replace("A", "0")
				.replace("B", "1")
				.replace("C", "2")
				.replace("D", "3")
				.replace("E", "4")
				.replace("F", "5")
				.replace("G", "6")
				.replace("H", "7")
				.replace("I", "8");
		int result = Integer.parseInt(paramInt, 9);
		return result;
	}

	 //あるアルファベット数字に対して、足すとアルファベット数字の値が、すべてHになるような値に変換
	private static  String align(String p){
		String s = "7";

		int paramDecode = decode(p); // 数値にする
		String sevenStr = "";

		// 判定用に、長さ分「7」を繋げる
		for (int i = 0; i<=p.length(); i++){
			sevenStr = sevenStr + s;
		}

		// 判定
		if (paramDecode > Integer.parseInt(sevenStr)) {
			sevenStr = sevenStr + s;
		}
		String resultValue = encode(sevenStr);

		int addValue = Integer.parseInt(sevenStr) - paramDecode;
		String  addStr = encode(String.valueOf(addValue));

		String result = String.format("%s + %s = %s", p, addStr, resultValue);

		return result;
	}
}
