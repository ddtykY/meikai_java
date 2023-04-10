package ensyu4_24;

import java.util.Scanner;

/*
 *  クラス名 :ensyu4_24
 *  概要     :演習問題4-24の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.10
 */
public class ensyu4_24 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :入力された数字が素数であるか判定する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.10
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 素数かどうか判定する旨を知らせる
		System.out.println("素数かどうか判定します");
		
		// 入力された正の整数値を格納する変数
		int integerValue;
		
		do { // 正の整数値が入力されるまで繰り返す 
			// 2以上の正の整数の入力を促す
			System.out.print("正の整数(2～): ");
			// int型の変数"stepNumber"を入力された値で初期化する
			integerValue = standardInput.nextInt();
		} while (integerValue <= 1); // "integerValue"が1以下である場合繰り返す
		
		// 素数の判定は2以上"integerValue"未満のいずれの数でも割り切れないかで行うため
		// for文の制御を行うint型の"countNumber"を2で初期化し,入力された"integerValue-1"まで繰り返す
		for (int countNumber = 2; countNumber < integerValue; countNumber++) {
			if (integerValue % countNumber == 0) { // "integerValue"が"countNumber"で割り切れる場合
				// 入力された値が素数ではないことを表示する
				System.out.println("その値は素数ではありません");
				// その値が素数でないと分かった時点でfor分を中断する
				break;
			}
			if (countNumber == integerValue - 1) { // "countNumber"と"integerValue-1"が同じ値の場合
				// この時点でfor分が中断されていないということは入力された値は素数であるということなのでその旨を表示する
				System.out.println("その値は素数です");
			}
		}		
	}
}