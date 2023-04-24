package ensyu7_33;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_33
 *  概要     :演習問題7-33の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.19
 */
public class Ensyu7_33 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :calculateDigit
	 * メソッドの説明   :integerValueの表示桁数を求める
	 * パラメータの説明 :integerValue　表示桁数を求める変数
	 * 返り値           :digitNumber　integerValueの表示桁数を表す変数
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static int calculateDigit(int integerValue) {
		// 表示桁数を表す変数を0で初期化する
		int digitNumber = 0;
		
		// もし"integreValue"が負の値なら
		if(integerValue < 0) {
			// "integerValue"が-1以下の間繰り返す
			while(integerValue <= -1) {
				// "integerValue"を10で割る
				integerValue /= 10;
				// "digitNumber"をインクリメントする
				digitNumber++;
			}
			// "-"の分インクリメントする
			digitNumber++;
		// もし"integreValue"が正の値なら
		} else if(integerValue > 0) {
			// "integerValue"が0より大きい間繰り返す
			while(integerValue > 0) {
				// "integerValue"を10で割る
				integerValue /= 10;
				// "digitNumber"をインクリメントする
				digitNumber++;
			}
		// もし"integreValue"が0なら
		} else if(integerValue == 0) {
			// "digitNumber"をインクリメントする
			digitNumber++;
		}
		// "digit"を返却する
		return digitNumber;
	}
	
	/*
	 * 関数名           :maximumColumnArray
	 * メソッドの説明   :行列integerValueArrayの各列の最大値を求める
	 * パラメータの説明 :行列integerValueArray　最大値を求める行列
	 * 返り値           :maximumArray　配列integerValueArrayの各列の最大値を表す配列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static int[] maximumColumnArray(int[][] integerValueArray) {
		// integerValueArrayの最大の列数を格納する変数
		int maximumColumn = integerValueArray[0].length;
		// integerValueArrayの行数分繰り返す
		for (int rowNumber = 1; rowNumber < integerValueArray.length; rowNumber++) {
			// "maximumColumn"と"integerValueArray[rowNumber]"の大きい方を最大値とする
			maximumColumn = maximumColumn > integerValueArray[rowNumber].length ? maximumColumn : integerValueArray[rowNumber].length;
		}
		
		// 最大値を表す配列を生成する
		int[] maximumArray = new int[maximumColumn];
		
		// maximumArrayの要素数分繰り返す
		for(int countNumber = 0; countNumber < maximumArray.length; countNumber++) {
			// 配列aの行数分繰り返す
			for(int rowNumber = 0; rowNumber < integerValueArray.length; rowNumber++) {
				// 配列aの各行の列数分繰り返す
				for(int columnNumber = 0; columnNumber < integerValueArray[rowNumber].length; columnNumber++) {
					// "columnNumber"が"countNumber"と等しいとき
					if(columnNumber == countNumber) {
						// "maximumArray[countNumber]"とintegerValueArrayの要素の大きい方をmaximumArrayに代入する
						maximumArray[countNumber] = maximumArray[countNumber] > integerValueArray[rowNumber][columnNumber] ? 
								maximumArray[countNumber] : integerValueArray[rowNumber][columnNumber];
					}
				}
			}
		}
		// "maximumArray"を返却する
		return maximumArray;
	}
	
	/*
	 * 関数名           :printArray
	 * メソッドの説明   :配列aの全要素を表示する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :a　表示させる配列
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static void printArray(int[] a) {
		// 配列aの要素数分繰り返す
		for(int countNumber = 0; countNumber < a.length; countNumber++) {
			// "a[countNumber]を表示する"
			System.out.print(a[countNumber]);
			// もし"countNumber"が配列aの長さ-1より小さければ
			if(countNumber < a.length-1) {
				// スペースを表示する
				System.out.print(" ");
			}
		}
		// すべての表示後に改行する
		System.out.println();
	}
	
	/*
	 * 関数名           :printArray
	 * メソッドの説明   :配列aの全要素を表示する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :a　表示させる二次元配列
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static void printArray(int[][] a) {
		
		// 行番号を表すint型の変数
		int rowNumber = 0;
		// 列番号を表すint型の変数
		int columnNumber = 0;
		
		// 各桁数を保存するための配列aと同じint型の配列を生成する
		int[][] digitArray = new int[a.length][];
		for(rowNumber = 0; rowNumber < a.length; rowNumber++) {
			// digitArrayの各行に行列aと同じだけの列数を与える
			digitArray[rowNumber] = new int[a[rowNumber].length];
		}

		// 配列aの行数分繰り返す
		for(rowNumber = 0; rowNumber < a.length; rowNumber++) {
			// 配列aの各行の列数分繰り返す
			for(columnNumber = 0; columnNumber < a[rowNumber].length; columnNumber++) {
				// "digitArray[rowNumber][columnNumber]"にaの要素の桁数を代入する
				digitArray[rowNumber][columnNumber] = calculateDigit(a[rowNumber][columnNumber]);
			}
		}
		
		// 各列の最大桁数を格納する変数
		int[] maximumDigitColumn = maximumColumnArray(digitArray);
		
		// 配列aの行数分繰り返す
		for(rowNumber = 0; rowNumber < a.length; rowNumber++) {
			// 配列aの各行の列数分繰り返す
			for(columnNumber = 0; columnNumber < a[rowNumber].length; columnNumber++) {
				// "a[rowNumber][columnNumber]を表示する"
				System.out.print(a[rowNumber][columnNumber]);
				// もし"countNumber"がa[rowNumber]の列数-1より小さければ
				if(columnNumber < a[rowNumber].length-1) {
					// "spaceNumer"を各列の最大桁数から表示されている数の桁数を引いた値で初期化し0以上の間繰り返す
					for(int spaceNumber = maximumDigitColumn[columnNumber] - digitArray[rowNumber][columnNumber]; spaceNumber >= 0 ; spaceNumber--) {
						// スペースを表示する
						System.out.print(" ");
					}
				}
			}
			// 一行表示するごとに改行する
			System.out.println();
		}
		// すべての表示後に改行する
		System.out.println();
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :多重定義されたメソッドprintArrayを実行しその結果をそれぞれ表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.19
	 */
	public static void main(String[] args) {
		// 配列の要素数を表す変数を0で初期化する
		int elementValue = 0;
		// 正の整数値が入力されるまで入力させる処理を繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("要素数 : ");
			// 入力された値を"elementValue"に代入する
			elementValue = standardInput.nextInt();
		// 0以下の値が入力されている間繰り返す
		} while (elementValue <= 0);

		// "elementNumber"だけ要素数を持つ配列を生成する
		int[] integerValueArray = new int[elementValue];

		// "integeValueArray"の要素数だけ繰り返す
		for(int countNumber = 0; countNumber < elementValue; countNumber++) {
			// 要素の入力を促す
			System.out.print("integerValueArray[" + countNumber + "] = ");
			// "integerValueArray[countNumber]"に入力された値を代入する
			integerValueArray[countNumber] = standardInput.nextInt();
		}
		// すべての入力後に改行する
		System.out.println();
		// メソッドprintArrayを呼び出して表示する
		printArray(integerValueArray);
		
		
		// 二次元配列の入力させる前に改行する
		System.out.println();
		// 配列の行数を表す変数を0で初期化する
		int rowValue = 0;
		// 行数を入力させる処理を正の整数値が入力されるまで繰り返す
		do {
			// 要素数の入力を促す
			System.out.print("行数 : ");
			// 入力された値を"elementNumber"に代入
			rowValue = standardInput.nextInt();
			// 0以下の値が入力されている間繰り返す
		} while (rowValue <= 0);

		// 行数が"rowValue"の二次元配列を生成する
		int[][] integerValueMatrix = new int[rowValue][];

		// 配列の列数を表す変数を0で初期化する
		int columnValue = 0;
		// integerValueMatrixの行数分繰り返す
		for(int rowNumber = 0; rowNumber < integerValueMatrix.length; rowNumber++) {
			// 列数を入力させる処理を正の整数値が入力されるまで繰り返す
			do {
				// 要素数の入力を促す
				System.out.print((rowNumber+1) + "行目の列数 : ");
				// "columnValueに"入力された値を代入する
				columnValue = standardInput.nextInt();
				// 0以下の値が入力されている間繰り返す
			} while (columnValue <= 0);
			// "rowNumber"行目に要素数が"columnNumber"である配列を生成する
			integerValueMatrix[rowNumber] = new int[columnValue];
		}
		// すべての入力後に改行する
		System.out.println();
		// integerValueMatrixの行数分繰り返す
		for(int rowNumber = 0; rowNumber < integerValueMatrix.length; rowNumber++) {
			// integerValueMatrixの列数分繰り返す
			for(int columnNumber = 0; columnNumber < integerValueMatrix[rowNumber].length; columnNumber++) {
				// 要素の入力を促す
				System.out.print((rowNumber+1) + "行" + (columnNumber+1) + "列目の要素 : ");
				// integerValueMatrix[rowNumber][columnNumber]に入力された値を代入する
				integerValueMatrix[rowNumber][columnNumber] = standardInput.nextInt();
			}
		}
		// すべての入力後に改行する
		System.out.println();
		// メソッドprintArrayを呼び出し表示する
		printArray(integerValueMatrix);
		
	}
}
