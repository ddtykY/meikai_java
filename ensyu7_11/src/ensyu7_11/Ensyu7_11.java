package ensyu7_11;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_11
 *  概要     :演習問題7-11の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.15
 */
public class Ensyu7_11 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :powerTwo
	 * メソッドの説明   :与えられた整数を指数とする2のべき乗を返す
	 * パラメータの説明 :integerValue　2のべき乗の指数に当たる
	 * 返り値           :powerValue　2の"integerValue"乗の値
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.15
	 */
	public static int powerTwo (int integerValue) {
		// 2の"integerValue"乗の値を格納する変数を1で初期化する
		int powerValue = 1;
		// "integerValue"回分2をかける処理を行う
		for(int countNumber = 0; countNumber < integerValue; countNumber++) {
			// "powerValue"に2をかける
			powerValue *= 2;
		}
		// "powerValue"を返却する
		return powerValue;
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :整数を左右にシフトした値が2のべき乗での乗算や除算と等しくなることを確認する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.15
	 */
	public static void main(String[] args) {
		// シフトできる数の最大値を31で初期化する
		int maximumShift = 31;
		
		// シフトさせる整数"integerValue"を0で初期化する
		int integerValue = 0;
		// シフトさせる量"shiftNumber"を0で初期化する
		int shiftNumber = 0;
		
		// 正の整数値が入力されるまで処理を繰り返す
		do {
			// 整数値の入力を促す
			System.out.print("整数 : ");
			// "integrValue"に入力された値を代入する
			integerValue = standardInput.nextInt();
		// 負の数が入力されている間繰り返す
		} while (integerValue < 0);
		
		// シフトできる数を求めるために一時的に"integerValue"を格納する変数
		int temporaryValue = integerValue;
		
		// "temporaryValue"を2で割った値が1以上なら
		while(temporaryValue / 2 >= 1){
			// "temporaryValue"を2で割る
			temporaryValue /= 2;
			// "maximumShift"をデクリメントする
			maximumShift--;
		}
		
		// シフトさせる数を入力させる処理を0～"maximumShift"以下の値が入力されるまで繰り返す
		do {
			// シフトするビット数の入力を促す
			System.out.print("シフトするビット数(0～" + maximumShift + "): ");
			// int型の変数"integerValue"を入力された値で初期化する
			shiftNumber = standardInput.nextInt();
		// 0～"MAXIMUM_NUMBER"以下の値が入力されるまで繰り返す
		} while (shiftNumber < 0 || shiftNumber > maximumShift);
		
		// 改行文字の出力
		System.out.println();
		
		// 2のべき乗での乗算の結果を表示する
		System.out.println(integerValue + " * (2^" + shiftNumber +  ") = " + integerValue * powerTwo(shiftNumber));
		// 2のべき乗での除算の結果を表示する
		System.out.println(integerValue + " / (2^" + shiftNumber +  ") = " + integerValue / powerTwo(shiftNumber));
		
		// 改行文字の出力
		System.out.println();
		
		// 入力された値を左に"shiftNumber"だけシフトした値を表示する
		System.out.println("左シフト : " + (integerValue << shiftNumber));
		// 入力された値を右に"shiftNumber"だけシフトした値を表示する
		System.out.println("右シフト : " + (integerValue >>> shiftNumber));
	}
}