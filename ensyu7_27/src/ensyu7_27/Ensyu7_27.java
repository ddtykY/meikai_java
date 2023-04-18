package ensyu7_27;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu7_27
 *  概要     :演習問題7-27の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.18
 */
public class Ensyu7_27 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :addMatrix
	 * メソッドの説明   :三つの配列x,y,zの配列の要素数が等しければ加算を行いtrueを返し,
	 *                   等しくなければ加算を行わずにfalseを返す
	 *                   ※この問題では教本により関数名と変数名が指定されている
	 * パラメータの説明 :配列x　加算の対象になる一つ目の配列
	 *                   配列y　加算の対象になる二つ目の配列
	 *                   配列z　配列xと配列yの和を格納する配列
	 * 返り値           :true　三つの配列の要素数が等しい時に返却(equalCheck == 0)
	 *                   false　三つの配列の要素数が等しくない時に返却(equalCheck == 1)
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		// trueとfalseのどちらを返すかを判別する変数
		boolean equalCheck = true;
		
		// もし配列xとyの行数が等しく配列yとzの行数が等しければ
		if(x.length == y.length && y.length == z.length) {
			// 配列xの行数分処理を繰り返す
			for(int rowNumber = 0; rowNumber < x.length; rowNumber++) {
				// もしx,y,zの各行の列数がすべて等しければ
				if(x[rowNumber].length == y[rowNumber].length && y[rowNumber].length == z[rowNumber].length) {
					// 配列xの列数分繰り返す
					for(int columnNumber = 0; columnNumber < x[rowNumber].length; columnNumber++) {
						// 配列zに配列x,yそれぞれの値を加算する
						z[rowNumber][columnNumber] = x[rowNumber][columnNumber] + y[rowNumber][columnNumber];
					}
				// もしx,y,zの各行の列数で等しくないものがあれば
				} else {
					// equalCheckにfalseを代入する
					equalCheck = false;
				}
			}
		// もしx,y,zの行数で等しくないものがあれば
		} else {
			// equalCheckにfalseを代入する
			equalCheck = false;
		}
		
		// "equalCheck"を返す
		return equalCheck;
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
		
		// 行数が"elementNumber"の二次元配列を生成する
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
	 * メソッドの説明   :メソッドaddMatrixを実行しその結果を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.18
	 */
	public static void main(String[] args) {
		// 一つ目の行列を生成することを表示する
		System.out.println("一つ目の行列firstIntegerMatrix");
		// int型の二次元配列firstIntegerMatrixをメソッドcreateMatrixを用いて生成する
		int[][] firstIntegerMatrix = createMatrix();
		// メソッドinputMatrixを用いて要素を代入していく
		inputMatrix(firstIntegerMatrix);
		
		// 二つ目の行列を生成することを表示する
		System.out.println("二つ目の行列secondIntegerMatrix");
		// int型の二次元配列secondIntegerMatrixをメソッドcreateMatrixを用いて生成する
		int[][] secondIntegerMatrix = createMatrix();
		// メソッドinputMatrixを用いて要素を代入していく
		inputMatrix(secondIntegerMatrix);
		
		// 三つ目の行列を生成することを表示する
		System.out.println("三つ目の行列thirdIntegerMatrix");
		// int型の二次元配列thirdIntegerMatrixをメソッドcreateMatrixを用いて生成する
		int[][] thirdIntegerMatrix = createMatrix();
		
		
		// 改行する
		System.out.println();
		
		// 一つ目の行列を表示することを伝える
		System.out.println("行列firstIntegerMatrix");
		// メソッドprintMatrixをもちいて"firstIntegerMatrix"の要素を表示する
		printMatrix(firstIntegerMatrix);
		
		// 二つ目の行列を表示することを伝える
		System.out.println("行列secondIntegerMatrix");
		// メソッドprintMatrixをもちいて"secondIntegerMatrix"の要素を表示する
		printMatrix(secondIntegerMatrix);
		
		// 改行する
		System.out.println();
		
		
		// メソッドaddMatrixを呼び出しtrueが返ってきたら
		if(addMatrix(firstIntegerMatrix, secondIntegerMatrix, thirdIntegerMatrix)) {
			// 三つ目の行列を表示することを伝える
			System.out.println("行列thirdIntegerMatrix");
			// メソッドprintMatrixをもちいて"thirdIntegerMatrix"の要素を表示する
			printMatrix(thirdIntegerMatrix);
		// もしfalseが返ってきたら
		} else {
			// いずれかの行列の要素数が異なる旨を表示します
			System.out.println("いずれかの行列の要素数が異なります");
		}
	}
}