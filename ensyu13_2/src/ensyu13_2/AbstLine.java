package ensyu13_2;

/*
 *  クラス名 :AbstLine
 *  概要     :直線を表す抽象クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public abstract class AbstLine extends Shape{
	// フィールドの宣言
	// 直線の長さを表す
	private int lineLength;
	
	// 直線の最低の長さ
	private final int MINIMUM_LENGTH = 1;
	
	// コンストラクタ
	public AbstLine(int lineLength) {
		// もし"lineLength"が"MINIMUM_LENGTH"未満なら
		if(lineLength < MINIMUM_LENGTH) {
			// "lineLength"を"MINIMUM_LENGTH"とする
			lineLength = MINIMUM_LENGTH;
		}
		// メソッドsetLengthを呼び出しlineLengthを引数として与える
		setLineLength(lineLength);
	}
	
	/*
	 * 関数名           :getLineLength
	 * メソッドの説明   :直線の長さを取得する
	 * パラメータの説明 :なし
	 * 返り値           :lineLength　直線の長さ
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public int getLineLength(){
		// "lineLength"を返却する
		return lineLength;
	}
	
	/*
	 * 関数名           :setLineLength
	 * メソッドの説明   :直線の長さを設定する
	 * パラメータの説明 :lineLength　直線の長さ
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public void setLineLength(int lineLength){
		// フィールドの"lineLength"に引数のものを代入する
		this.lineLength = lineLength;
	}

	/*
	 * 関数名           :toString
	 * メソッドの説明   :直線に関する図形の情報を表す文字列を返却するメソッド
	 * パラメータの説明 :なし
	 * 返り値           :直線に関する図形の情報を表す文字列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public String toString() {
		// 直線の長さの文字列を返却する
		return "AbstLine(length: " + lineLength + ")";
	}
}
