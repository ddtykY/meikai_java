package ensyu13_1;

/*
 *  クラス名 :VirtLine
 *  概要     :垂直直線を表すクラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */

public class VirtLine extends AbstLine {
	// コンストラクタ
	public VirtLine(int lineLength) {
		// スーパークラスのコンストラクタを呼び出す
		super(lineLength);
	}

	/*
	 * 関数名           :toString
	 * メソッドの説明   :垂直直線に関する図形の情報を表す文字列を返却するメソッド
	 * パラメータの説明 :なし
	 * 返り値           :垂直直線に関する図形の情報を表す文字列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public String toString() {
		// 垂直直線に関する図形情報を表す文字列を返却する
		return "VirtLine(length:" + getLineLength() + ")";
	}

	/*
	 * 関数名           :draw
	 * メソッドの説明   :垂直直線を描画するためのメソッド
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
			// |を表示し改行する
			System.out.println('|');
		}
	}

}
