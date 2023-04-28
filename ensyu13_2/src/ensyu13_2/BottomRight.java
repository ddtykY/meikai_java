package ensyu13_2;

/*
 *  クラス名 :BottomRight
 *  概要     :右下直角二等辺三角形を表すクラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public class BottomRight extends IsoscelesRightTriangle {
	// コンストラクタ
	public BottomRight(int heightLength) {
		// スーパークラスのコンストラクタを呼び出す
		super(heightLength);
	}

	/*
	 * 関数名           :toString
	 * メソッドの説明   :右下直角二等辺三角形に関する図形の情報を表す文字列を返却するメソッド
	 * パラメータの説明 :なし
	 * 返り値           :右下直角二等辺三角形に関する図形の情報を表す文字列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public String toString() {
		// 長方形に関する文字列を返却する
		return "BottomRight(height:" + getHeightLength() + ")";
	}

	/*
	 * 関数名           :draw
	 * メソッドの説明   :右下直角二等辺三角形を描画するためのメソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public void draw() {
		// スーパークラスの"getHeightLength"の値でint型の変数を初期化する
		int drawHeight = getHeightLength();

		// "drawHeight"(高さ)の数だけ繰り返す
		for (int heightNumber = drawHeight-1; heightNumber >= 0; heightNumber--) {
			// "drawHeight"(幅)の数から現在の高さの分だけ繰り返す
			for (int widthNumber = 0 ; widthNumber < drawHeight; widthNumber++) {
				// もし"widthNumber"が"heightNumber"より小さいときは
				if(widthNumber < heightNumber) {
					// スペースを表示する
					System.out.print(" ");
				// そうでない場合は
				} else {
					// *を表示する
					System.out.print('*');
				}
			}
			// 1行出力し終えたら1度改行を行う
			System.out.println();
		}
	}


}
