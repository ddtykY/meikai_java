package ensyu7_29;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_29
 *  概要     :演習問題7-29の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.19
 */
public class Ensyu7_29 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :aryClone2
	 * メソッドの説明   :二次元配列aと同じ配列を生成して返却する
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :行列a　複製の対象になる配列
	 * 返り値           :行列integerValueMatrix　配列aと同じ配列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static int[][] aryClone2(int[][] a) {
		// 新たな行列をaと同じ長さの行数初期化する
		int[][] integerValueMatrix = new int[a.length][];
		// 行列xの行数分繰り返す
		for(int rowNumber = 0; rowNumber < a.length; rowNumber++) {
			// 行列integerValueMatrixの各行に行列xと同じ列数を与えていく
			integerValueMatrix[rowNumber] = new int[a[rowNumber].length];
			// 行列xの列数分繰り返す
			for(int columnNumber = 0; columnNumber < a[rowNumber].length; columnNumber++) {
				// 行列x,yのそれぞれの要素の和を行列integerValueMatrixに代入していく
				integerValueMatrix[rowNumber][columnNumber] = a[rowNumber][columnNumber];
			}
		}
		// 行列integerValueMatrixを返却する
		return integerValueMatrix;
	}
	
	/*
	 * 関数名           :printMatrix
	 * メソッドの説明   :行列integerValueMatrixの全要素を表示する
	 * パラメータの説明 :行列integerValueMatrix　表示する行列
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	static void printMatrix(int[][] integerValueMatrix) {
		// integerValueMatrixの行数分繰り返す
		for(int rowNumber = 0; rowNumber < integerValueMatrix.length; rowNumber++) {
			// integerValueMatrixの列数分繰り返す
			for(int columnNumber = 0; columnNumber < integerValueMatrix[rowNumber].length; columnNumber++) {
				// 要素を表示する
				System.out.print(integerValueMatrix[rowNumber][columnNumber] + "\t");
			}
			// 一行出力したのち改行する
			System.out.println();
		}
		// 全て表示したのち改行する
		System.out.println();
	}
	
	/*
	 * 関数名           :createMatrix
	 * メソッドの説明   :二次元配列を生成し返却する
	 * パラメータの説明 :なし
	 * 返り値           :integerValueMatrix　生成した二次元配列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	static int[][] createMatrix() {
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
		
		// integerValueMatrixを返却する
		return integerValueMatrix;
	}
	
	/*
	 * 関数名           :inputMatrix
	 * メソッドの説明   :与えられた二次元配列に要素を代入する
	 * パラメータの説明 :配列integerValueMatrix　要素を代入していく二次元配列
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	static void inputMatrix(int[][] integerValueMatrix){
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
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :メソッドaryClone2を実行しその結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	public static void main(String[] args) {
		// 行列を生成することを表示する
		System.out.println("行列integerMatrix");
		// int型の二次元配列integerMatrixをメソッドcreateMatrixを用いて生成する
		int[][] integerMatrix = createMatrix();
		// メソッドinputMatrixを用いて要素を代入していく
		inputMatrix(integerMatrix);
		
		// 行列を表示することを伝える
		System.out.println("行列integerMatrix");
		// メソッドprintMatrixをもちいて"integerMatrix"の要素を表示する
		printMatrix(integerMatrix);
		
		// 行列の和を求めた旨を表示する
		System.out.println("行列を複製しました");
		// メソッドaryClone2を呼び出し結果を表示する
		printMatrix(aryClone2(integerMatrix));
	}
}