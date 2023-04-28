package ensyu13_2;

/*
 *  クラス名 :Shape
 *  概要     :図形の概念を表す抽象クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public abstract class Shape {
	/*
	 * 関数名           :toString
	 * メソッドの説明   :図形の情報を表す文字列を返却する抽象メソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public abstract String toString();
	
	/*
	 * 関数名           :draw
	 * メソッドの説明   :図形を描画するための抽象メソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public abstract void draw();
	
	/*
	 * 関数名           :print
	 * メソッドの説明   :図形の標示と描画を行う
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public void print() {
		// メソッドtoStringを呼び出して文字列を表示する
		System.out.println(toString());
		// メソッドdrawを呼び出して図形を描画する
		draw();
	}
}
