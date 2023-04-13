package ensyu6_18;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_18
 *  概要     :演習問題6-18の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.13
 */
public class Ensyu6_18 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :行数・各行の列数・各要素の値をキーボードから読み込むようにList6-18を書き換える
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.13
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 行数を格納する変数を0で初期化する
		int rowValue = 0;
		
		// 行数として正の整数値が入力されるまで繰り返す
		do {
			// 行数の入力を促す
			System.out.print("行数 : ");
			// 入力された値を"rowValue"に代入する
			rowValue = standardInput.nextInt();
		// "rowNumber"が0以下の場合繰り返す
		}while (rowValue <= 0);
		
		// 改行文字の出力
		System.out.println();
		
		// 行数が"rowNumber"であるint型の二次元配列を生成する。これは表示される配列aにあたる
		int[][] integerValueArray = new int[rowValue][];
		
		// 各行の列数を一時的に格納する変数を0で初期化する
		int columnValue = 0;
		
		// 0で初期化されたint型の変数rowNumberで制御されるfor文、integerValueArrayの行数分繰り返す
		for(int rowNumber = 0; rowNumber < integerValueArray.length; rowNumber++) {
			// 列数として正の整数値が入力されるまで繰り返す
			do {
				// 行数の入力を促す
				System.out.print("a[" + rowNumber + "]の列数 : ");
				// 入力された値を"columnValue"に代入する
				columnValue = standardInput.nextInt();
			// "rowNumber"が0以下の場合繰り返す
			}while (columnValue <= 0);
			// "rowNumber"行目に要素数が"columnNumber"である配列を生成する
			integerValueArray[rowNumber] = new int[columnValue];
		}
		
		// 改行文字の出力
		System.out.println();
		
		// 0で初期化されたint型の変数rowNumberで制御されるfor文、integerValueArrayの行数分繰り返す
		for(int rowNumber = 0; rowNumber < integerValueArray.length; rowNumber++) {
			// 0で初期化されたint型の変数columnNumberで制御されるfor文、integerValueArrayの行数分繰り返す
			for(int columnNumber = 0; columnNumber < integerValueArray[rowNumber].length; columnNumber++) {
				//要素の入力を促す
				System.out.print("a[" + rowNumber + "][" + columnNumber + "] = ");
				// integerValueArray[rowNumber][columnNumber]に入力された値を代入する
				integerValueArray[rowNumber][columnNumber] = standardInput.nextInt();
			}
			// 各行ごとに確認しやすいように改行文字を出力する
			System.out.println();
		}
		
		//配列aを表示する旨を示す
		System.out.println("\n配列a");
		
		// 0で初期化されたint型の変数rowNumberで制御されるfor文、integerValueArrayの行数分繰り返す
		for(int rowNumber = 0; rowNumber < integerValueArray.length; rowNumber++) {
			// 0で初期化されたint型の変数columnNumberで制御されるfor文、integerValueArrayの行数分繰り返す
			for(int columnNumber = 0; columnNumber < integerValueArray[rowNumber].length; columnNumber++) {
				// 各要素を表示する
				System.out.print(integerValueArray[rowNumber][columnNumber] + "\t");
			}
			// 1行表示しきったら改行する
			System.out.println();
		}
	}
}