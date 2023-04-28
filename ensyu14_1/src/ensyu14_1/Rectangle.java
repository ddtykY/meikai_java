package ensyu14_1;

/*
 *  クラス名 :Ractangle
 *  概要     :長方形を表すクラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public class Rectangle extends Shape implements Plane2D{
	// フィールドの宣言
	// 長方形の幅
	private int widthLength;
	// 長方形の高さ
	private int heightLength;
	
	// 最低の幅
	private final int MINMUM_WIDTH = 1;
	// 最低の高さ
	private final int MINIMUM_HEIGHT = 1;
	
	// コンストラクタ
	public Rectangle(int widthLength, int heightLength) {
		// もし"widthLength"が"MINMUM_WIDTH"未満なら
		if(widthLength < MINMUM_WIDTH) {
			// "widthLength"を"MINMUM_WIDTH"とする
			widthLength = MINMUM_WIDTH;
		}
		// もし"heightLength"が"MINIMUM_HEIGHT"未満なら
		if(heightLength < MINIMUM_HEIGHT) {
			// "heightLength"を"MINIMUM_HEIGHT"とする
			heightLength = MINIMUM_HEIGHT;
		}
		// フィールドの幅に引数として与えられたものを代入する
		this.widthLength = widthLength;
		// フィールドの高さに引数として与えられたものを代入する
		this.heightLength = heightLength;
	}

	/*
	 * 関数名           :toString
	 * メソッドの説明   :長方形に関する図形の情報を表す文字列を返却するメソッド
	 * パラメータの説明 :なし
	 * 返り値           :長方形に関する図形の情報を表す文字列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public String toString() {
		// 長方形に関する文字列を返却する
		return "Rectangle(width:" + widthLength + "height:" + heightLength + ")";
	}

	/*
	 * 関数名           :draw
	 * メソッドの説明   :長方形を描画するためのメソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public void draw() {
		// 高さの分繰り返す
		for(int heightNumber = 0; heightNumber < heightLength; heightNumber++) {
			// 幅の分繰り返す
			for(int widthNumber = 0; widthNumber < widthLength; widthNumber++) {
				// *を表示する
				System.out.print('*');
			}
			// 一行分表示したら改行する
			System.out.println();
		}
	}
	
	/*
	 * 関数名           :getArea
	 * メソッドの説明   :面積を求める
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public int getArea() {
		// 面積を求め返却する
		return widthLength * heightLength;
	}

}
