package ensyu14_1;

/*
 *  クラス名 :Point
 *  概要     :点を表すクラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public class Point extends Shape{
	// コンストラクタ
	public Point() {}

	/*
	 * 関数名           :toString
	 * メソッドの説明   :点に関する図形の情報を表す文字列を返却するメソッド
	 * パラメータの説明 :なし
	 * 返り値           :点に関する図形の情報を表す文字列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public String toString() {
		// 文字列"Point"を返却する
		return "Point";
	}
	
	/*
	 * 関数名           :draw
	 * メソッドの説明   :点を描画するためのメソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public void draw() {
		// +を一つだけ表示する
		System.out.println('+');
	}
}
