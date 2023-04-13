package ensyu6_16;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu6_16
 *  概要     :演習問題6-16の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.13
 */
public class Ensyu6_16 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :4行3列の行列と3行4列の行列の積を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.13
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 4行3列のint型の二次元配列を生成
		int[][] firstValueArray = new int[4][3];
		
		// 3行4列のint型の二次元配列を生成
		int[][] secondValueArray = new int[3][4];
		
		// 2つの行列の積を代入するint型の二次元配列
		int[][] thirdValueArray = new int[4][4];
		
		// 0で初期化されたint型の変数rowNumberで制御されるfor文
		// firstValueArrayの行数分繰り返す
		for (int rowNumber = 0; rowNumber < firstValueArray.length; rowNumber++) {
			// 0で初期化されたint型の変数columnNumberで制御されるfor文
			// firstIndexArrayの列数分繰り返す
			for(int columnNumber = 0; columnNumber < firstValueArray[0].length; columnNumber++) {
				// firstValueArray[rowNumber][columnNumber]への数値の入力を促す
				System.out.print("a[" + rowNumber + "][" + columnNumber + "] = ");
				// firstValueArray[rowNumber][columnNumber]に入力された数値を代入する
				firstValueArray[rowNumber][columnNumber] = standardInput.nextInt();
			}
		}
		
		// 改行を行う
		System.out.println();
		
		// 0で初期化されたint型の変数rowNumberで制御されるfor文
		// secondValueArrayの行数分繰り返す
		for (int rowNumber = 0; rowNumber < secondValueArray.length; rowNumber++) {
			// 0で初期化されたint型の整変数columnNumberで制御されるfor文
			// secondValueArrayの列数分繰り返す
			for(int columnNumber = 0; columnNumber < secondValueArray[0].length; columnNumber++) {
				// secondValueArray[rowNumber][columnNumber]への数値の入力を促す
				System.out.print("b[" + rowNumber + "][" + columnNumber + "] = ");
				// secondValueArray[rowNumber][columnNumber]に入力された数値を代入する
				secondValueArray[rowNumber][columnNumber] = standardInput.nextInt();
			}
		}
		
		//行列a(firstValueArray)の要素の値を表示することをわかりやすくする
		System.out.println("\n行列a");
		// 0で初期化されたint型の変数rowNumberで制御されるfor文
		// firstValueArrayの行数分繰り返す
		for (int rowNumber = 0; rowNumber < firstValueArray.length; rowNumber++) {
			// 0で初期化されたint型の変数columnNumberで制御されるfor文
			// firstIndexArrayの列数分繰り返す
			for(int columnNumber = 0; columnNumber < firstValueArray[0].length; columnNumber++) {
				// firstValueArray[rowNumber][columnNumber]を表示する
				System.out.printf("%d\t", firstValueArray[rowNumber][columnNumber]);
			}
			// 1行ごとに改行する
			System.out.println();
		}
		
		//行列b(secondValueArray)の要素の値を表示することをわかりやすくする
		System.out.println("\n行列b");
		// 0で初期化されたint型の変数rowNumberで制御されるfor文
		// secondValueArrayの行数分繰り返す
		for (int rowNumber = 0; rowNumber < secondValueArray.length; rowNumber++) {
			// 0で初期化されたint型の変数columnNumberで制御されるfor文
			// secondValueArrayの列数分繰り返す
			for(int columnNumber = 0; columnNumber < secondValueArray[0].length; columnNumber++) {
				// secondValueArray[rowNumber][columnNumber]を表示する
				System.out.printf("%d\t", secondValueArray[rowNumber][columnNumber]);
			}
			// 1行ごとに改行する
			System.out.println();
		}
		
		// 行列aと行列bの積を求める
		// 0で初期化されたint型の変数rowNumberで制御されるfor文
		// thirdValueArrayの行数分繰り返す
		for (int rowNumber = 0; rowNumber < thirdValueArray.length; rowNumber++) {
			// 0で初期化されたint型の変数columnNumberで制御されるfor文
			// thirdValueArrayの列数分繰り返す
			for(int columnNumber = 0; columnNumber < thirdValueArray[0].length; columnNumber++) {
				// 0で初期化されたint型の変数productCountで制御されるfor文
				// firstValueArrayの列あるいはsecondValeArrayの行の数だけ繰り返す
				// ここではsecondValeArrayの行の数だけ繰り返す
				for(int productCount = 0; productCount < secondValueArray.length; productCount++) {
					// thirdValueArrayの各要素に行列の積を代入していく
					thirdValueArray[rowNumber][columnNumber] += firstValueArray[rowNumber][productCount] * secondValueArray[productCount][columnNumber];
				}	
			}
		}
		
		
		//行列a(firstValueArray)と行列b(secondValueArray)の積を表示する旨を示す
		System.out.println("\n行列a * 行列b");
		// 0で初期化されたint型の変数rowNumberで制御されるfor文
		// thirdValueArrayの行数分繰り返す
		for (int rowNumber = 0; rowNumber < thirdValueArray.length; rowNumber++) {
			// 0で初期化されたint型の変数columnNumberで制御されるfor文
			// thirdValueArrayの列数分繰り返す
			for(int columnNumber = 0; columnNumber < thirdValueArray[0].length; columnNumber++) {
				// thirdValueArray[rowNumber][columnNumber]を表示する
				System.out.printf("%d\t", thirdValueArray[rowNumber][columnNumber]);
			}
			// 1行ごとに改行する
			System.out.println();
		}

		
	}
}