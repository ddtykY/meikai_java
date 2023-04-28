package ensyu13_1;

/*
 *  クラス名 :HorzLine
 *  概要     :水平直線を表すクラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */

public class HorzLine extends AbstLine {
	// コンストラクタ
	public HorzLine(int lineLength) {
		// スーパークラスのコンストラクタを呼び出す
		super(lineLength);
	}

	/*
	 * 関数名           :toString
	 * メソッドの説明   :水平直線に関する図形の情報を表す文字列を返却するメソッド
	 * パラメータの説明 :なし
	 * 返り値           :水平直線に関する図形の情報を表す文字列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public String toString() {
		// 水平直線に関する図形情報を表す文字列を返却する
		return "HorzLine(length:" + getLineLength() + ")";
	}

	/*
	 * 関数名           :draw
	 * メソッドの説明   :水平直線を描画するためのメソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public void draw() {
		// スーパークラスの"lineLength"の値でint型の変数を初期化する
		int drawLength = getLineLength();
		
		// "drawLength"の値の数だけ繰り返す
		for(int countNumber = 0; countNumber < drawLength; countNumber++) {
			// -を表示する
			System.out.print('-');
		}
		// すべての表示後に改行する
		System.out.println();
	}

}
