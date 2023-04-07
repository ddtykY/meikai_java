package ensyu4_4;

import java.util.Scanner;

/*
 * クラス名:ensyu4_4
 * 概要    :演習問題4_4の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.06
 */
public class ensyu4_4 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :正の整数値を0までカウントダウンした後、
	 *                   while文の終了時にその制御に使っていた値が-1であることを確認する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		//カウントダウンを行う旨を表示する
		System.out.println("カウントダウンします。");
		
		int countNumber;  // カウントダウンに用いる数でユーザーの入力した値を格納する変数
		
		do {// 正の整数値が入力されるまで何度もユーザーに値を入力させる
			// 正の整数値の入力を促す
			System.out.print("正の整数値 : ");
			// "countNumber"に入力された値を代入する
			countNumber = standardInput.nextInt();
		} while (countNumber <= 0); // 正の整数値が入力されるまで繰り返す 
		
		while (countNumber >= 0) { // "countNumber"が0以上の場合繰り返す、1ずつ減らすことでカウントダウンを実現させる
			// "countNumber"の値を表示する
			System.out.println(countNumber);
			// "countNumber"を1減らす
			countNumber--;
		}
		
		// while文終了時の"countNumber"の値を確認する
		System.out.println("while文終了時のcountNumber : " + countNumber);		
	}
}