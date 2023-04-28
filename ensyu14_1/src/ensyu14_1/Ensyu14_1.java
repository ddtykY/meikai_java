package ensyu14_1;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu14_1
 *  概要     :演習問題14-1の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public class Ensyu14_1 {
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
		String[] shapeString = {"点","水平直線","垂直直線","長方形","平行四辺形"};
		// 分岐に用いる点を表す値
		final int POINT_VALUE = 1;
		// 分岐に用いる水平直線を表す値
		final int HORIZONTAL_VALUE = 2;
		// 分岐に用いる垂直直線を表す値
		final int VERTICAL_VALUE = 3;
		// 分岐に用いる長方形を表す値
		final int RECTANGLE_VALUE = 4;
		// 分岐に用いる平行四辺形を表す値
		final int PARALLELOGRAM__VALUE = 5;
		
		// 種類の表示の際に何個表示したら改行するのかを格納する定数
		final int NEW_LINE = 4;
		
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
		
		// 配列の要素数だけ繰り返す
		for(int countShape = 0; countShape < numberOfShape; countShape++) {
			// 図形の種類を表すための分岐に用いる変数
			int shapeType = 0;
			// 図形の種類を問う
			System.out.print((countShape+1) + "番の図形の種類\n (");
			// 図形の種類の表示をしていく
			// shapeStringの要素数だけ繰り返す
			for(int indexShapeString = 0; indexShapeString < shapeString.length; indexShapeString++) {
				// 図形に対応する文字列を表示する
				System.out.print((indexShapeString+1) + "…" + shapeString[indexShapeString]);
				// 最後の要素であれば
				if(indexShapeString == shapeString.length-1) {
					// 入力を促す
					System.out.print(") : ");
				// もし"indexShapeString"を"NEW_LINE"で割った数が"NEW_LINE-1"なら
				} else if(indexShapeString % NEW_LINE == NEW_LINE-1) {
					// 改行する
					System.out.println();
				// もし最後の要素でなければ
				}else if(indexShapeString != shapeString.length-1) {
					// 文字列の区切りを表示
					System.out.print("/");
				} 
			}
			// 入力された値を"shapeType"に代入する
			shapeType = standardInput.nextInt();
			// 0以下かshapeStringの長さより大きい値が入力されている間繰り返す
			while(shapeType <= 0 || shapeType > shapeString.length) {
				// 不正な値であることを伝えもう一度入力を促す
				System.out.print("不正な値です。もう一度入力してください : ");
				// 入力された値を"shapeType"に代入する
				shapeType = standardInput.nextInt();
			}

			// Shapeクラスの配列を用いてそれぞれの形に対応したインスタンスを生成していく
			switch(shapeType) {
			// "POINT_VALUE"なら
			case POINT_VALUE : 
				// Pointクラスのインスタンスを生成
				Point shapePoint = new Point();
				// メソッドprintを呼び出す
				shapePoint.print();
				// switch文を抜ける
				break;
			// "HORIZONTAL_VALUE"なら
			case HORIZONTAL_VALUE : 
				// メソッドinputDataを呼び出し長さを表す変数に代入する
				lineLength = inputData("長さ");
				// HorzLineクラスのインスタンスを生成
				HorzLine shapeHorzLine = new HorzLine(lineLength);
				// メソッドprintを呼び出す
				shapeHorzLine.print();
				// switch文を抜ける
				break;
			// "VERTICAL_VALUE"なら
			case VERTICAL_VALUE : 
				// メソッドinputDataを呼び出し長さを表す変数に代入する
				lineLength = inputData("長さ");
				// VirtLineクラスのインスタンスを生成
				VirtLine shapeVirtLine = new VirtLine(lineLength);
				// メソッドprintを呼び出す
				shapeVirtLine.print();
				// switch文を抜ける
				break;
			// "RECTANGLE_VALUE"なら
			case RECTANGLE_VALUE:
				// メソッドinputDataを呼び出し幅を表す変数に代入する
				shapeWidth = inputData("幅");
				// メソッドinputDataを呼び出し高さを表す変数に代入する
				shapeHeight = inputData("高さ");
				// Rectangleクラスのインスタンスを生成
				Rectangle shapeRectangle = new Rectangle(shapeWidth, shapeHeight);
				// メソッドprintを呼び出す
				shapeRectangle.print();
				// 面積を表示する
				System.out.println("Area : " + shapeRectangle.getArea());
				// switch文を抜ける
				break;
			// "PARALLELOGRAM__VALUE"なら
			case PARALLELOGRAM__VALUE:
				// メソッドinputDataを呼び出し幅を表す変数に代入する
				shapeWidth = inputData("幅");
				// メソッドinputDataを呼び出し高さを表す変数に代入する
				shapeHeight = inputData("高さ");
				// Rectangleクラスのインスタンスを生成
				Parallelogram shapeParallelogram = new Parallelogram(shapeWidth, shapeHeight);
				// メソッドprintを呼び出す
				shapeParallelogram.print();
				// 面積を表示する
				System.out.println("Area : " + shapeParallelogram.getArea());
				// switch文を抜ける
				break;
			}
			// それぞれの入力後に改行する
			System.out.println();
		}
	}

}
