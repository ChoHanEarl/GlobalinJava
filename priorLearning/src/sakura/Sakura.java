package sakura;

import java.util.Scanner;

public class Sakura {
	public static void main(String[] args) {
		// あなたはある桜の木の枝を見ています。
		//　枝にはｎ個のつぼみがついています。
		//　この桜は一つのつぼみごとに5枚の花びらが開きます。
		//　すべての蕾が開いた時、合計で何個の花びらになるか出力してください。
		
		Scanner sc = new Scanner(System.in);
		System.out.println("入力例１");
		int eda = sc.nextInt();
		int hanabira = eda * 5;
		System.out.println("花びらの個数：" + hanabira);
		
	}
}
