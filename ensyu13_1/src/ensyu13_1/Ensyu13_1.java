package ensyu13_1;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu13_1
 *  概要     :演習問題13-1の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public class Ensyu13_1 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	 * 関数名           :inputData
	 * メソッドの説明   :引数として与えられた文字列の値を入力させ返却する
	 * パラメータの説明 :dataName　入力させる値についての説明の文字列
	 * 返り値           :inputData　入力された値
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.25
	 */
	public static int inputData(String dataName) {
		// 入力を促す
		System.out.print(dataName + " : ");
		// 入力された値を返却する
		return standardInput.nextInt();
	}
	
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成した図形クラス群の動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.26
	 */
	public static void main(String[] args) {
		// 表示する図形の個数を表す変数を初期化する
		int numberOfShape = 0;
		
		// 図形の形を表すString型の配列
		String[] shapeString = {"点","水平直線","垂直直線","長方形"};
		// 分岐に用いる点を表す値
		final int POINT_VALUE = 1;
		// 分岐に用いる水平直線を表す値
		final int HORIZONTAL_VALUE = 2;
		// 分岐に用いる垂直直線を表す値
		final int VERTICAL_VALUE = 3;
		// 分岐に用いる長方形を表す値
		final int RECTANGLE_VALUE = 4;
		
		
		// 直線の長さを表す変数
		int lineLength = 0;
		// 図形の幅を表す変数
		int shapeWidth = 0;
		// 図形の高さを表す変数
		int shapeHeight = 0;
		
		// プログラムについて説明する
		System.out.println("図形を表示します。\n長さや幅、高さとして0以下の値が入力された場合1として扱います。\n");
		
		// 図形の個数として正の整数値が入力されるまで繰り返す
		do {
			// 表示する図形の数の入力を促す
			System.out.print("図形は何個 : ");
			// 入力された値を"numberOfShape"に代入する
			numberOfShape = standardInput.nextInt();
		// 0以下の数が入力されている間繰り返す
		}while(numberOfShape <= 0);
		
		// Shapeクラスの配列を生成する
		Shape[] shapeArray = new Shape[numberOfShape];
		
		// 配列の要素数だけ繰り返す
		for(int indexShapeArray = 0; indexShapeArray < numberOfShape; indexShapeArray++) {
			// 図形の種類を表すための分岐に用いる変数
			int shapeType = 0;
			// 促した数が入力されるまで繰り返す
			do {
				// 図形の種類を問う
				System.out.print((indexShapeArray+1) + "番の図形の種類\n (");
				// shapeStringの要素数だけ繰り返す
				for(int indexShapeString = 0; indexShapeString < shapeString.length; indexShapeString++) {
					// 図形に対応する文字列を表示する
					System.out.print((indexShapeString+1) + "…" + shapeString[indexShapeString]);
					// もし最後の要素でなければ
					if(indexShapeString != shapeString.length-1) {
						// 文字列の区切りを表示
						System.out.print("/");
					}
				}
				// 入力を促す
				System.out.print(") : ");
				// 入力された値を"shapeType"に代入する
				shapeType = standardInput.nextInt();
			// 0以下かshapeStringの長さより大きい値が入力されている間繰り返す
			}while(shapeType <= 0 || shapeType > shapeString.length);
			
			// Shapeクラスの配列を用いてそれぞれの形に対応したインスタンスを生成していく
			switch(shapeType) {
			// "POINT_VALUE"なら
			case POINT_VALUE : 
				// Pointクラスのインスタンスを生成
				shapeArray[indexShapeArray] = new Point();
				// switch文を抜ける
				break;
			// "HORIZONTAL_VALUE"なら
			case HORIZONTAL_VALUE : 
				// メソッドinputDataを呼び出し長さを表す変数に代入する
				lineLength = inputData("長さ");
				// HorzLineクラスのインスタンスを生成
				shapeArray[indexShapeArray] = new HorzLine(lineLength);
				// switch文を抜ける
				break;
			// "VERTICAL_VALUE"なら
			case VERTICAL_VALUE : 
				// メソッドinputDataを呼び出し長さを表す変数に代入する
				lineLength = inputData("長さ");
				// HorzLineクラスのインスタンスを生成
				shapeArray[indexShapeArray] = new VirtLine(lineLength);
				// switch文を抜ける
				break;
			// "RECTANGLE_VALUE"なら
			case RECTANGLE_VALUE:
				// メソッドinputDataを呼び出し幅を表す変数に代入する
				shapeWidth = inputData("幅");
				// メソッドinputDataを呼び出し高さを表す変数に代入する
				shapeHeight = inputData("高さ");
				// Rectangleクラスのインスタンスを生成
				shapeArray[indexShapeArray] = new Rectangle(shapeWidth, shapeHeight);
			}
			// それぞれの入力後に改行する
			System.out.println();
		}
		
		// 拡張for分を用いてそれぞれの図形を描画していく
		for(Shape printShape : shapeArray) {
			// メソッドprintを呼び出す
			printShape.print();
			// 描画が完了したら改行する
			System.out.println();
		}
	}

}
