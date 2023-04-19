package ensyu7_28;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_28
 *  概要     :演習問題7-28の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.19
 */
public class Ensyu7_28 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :addMatrix
	 * メソッドの説明   :二つの配列x,yの和を格納した２次元配列を返す
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :行列x　加算の対象になる一つ目の配列
	 *                   行列y　加算の対象になる二つ目の配列
	 * 返り値           :行列integerValueMatrix　配列xと配列yの和を格納する行列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	static int[][] addMatrix(int[][] x, int[][] y) {
		// 二つの行列の和を格納する行列をxの行数で初期化する
		int[][] integerValueMatrix = new int[x.length][];
		
		// 行列xの行数分繰り返す
		for(int rowNumber = 0; rowNumber < x.length; rowNumber++) {
			// 行列integerValueMatrixの各行に行列xと同じ列数を与えていく
			integerValueMatrix[rowNumber] = new int[x[rowNumber].length];
			// 行列xの列数分繰り返す
			for(int columnNumber = 0; columnNumber < x[rowNumber].length; columnNumber++) {
				// 行列x,yのそれぞれの要素の和を行列integerValueMatrixに代入していく
				integerValueMatrix[rowNumber][columnNumber] = x[rowNumber][columnNumber] + y[rowNumber][columnNumber];
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
	 * メソッドの説明   :メソッドaddMatrixを実行しその結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.19
	 */
	public static void main(String[] args) {
		// 一つ目の行列を生成することを表示する
		System.out.println("一つ目の行列firstIntegerMatrix");
		// int型の二次元配列firstIntegerMatrixをメソッドcreateMatrixを用いて生成する。ここでは2行3列とする。
		int[][] firstIntegerMatrix = new int[2][3];
		// メソッドinputMatrixを用いて要素を代入していく
		inputMatrix(firstIntegerMatrix);
		
		// 二つ目の行列を生成することを表示する
		System.out.println("二つ目の行列secondIntegerMatrix");
		// int型の二次元配列secondIntegerMatrixをメソッドcreateMatrixを用いて生成する。ここでは2行3列とする。
		int[][] secondIntegerMatrix = new int[2][3];
		// メソッドinputMatrixを用いて要素を代入していく
		inputMatrix(secondIntegerMatrix);
		
		// 一つ目の行列を表示することを伝える
		System.out.println("行列firstIntegerMatrix");
		// メソッドprintMatrixをもちいて"firstIntegerMatrix"の要素を表示する
		printMatrix(firstIntegerMatrix);
		
		// 二つ目の行列を表示することを伝える
		System.out.println("行列secondIntegerMatrix");
		// メソッドprintMatrixをもちいて"secondIntegerMatrix"の要素を表示する
		printMatrix(secondIntegerMatrix);
		
		// 行列の和を求めた旨を表示する
		System.out.println("firstIntegerMatrix + secondIntegerMatrix");
		// メソッドaddMatrixを呼び出し結果を表示する
		printMatrix(addMatrix(firstIntegerMatrix, secondIntegerMatrix));
	}
}