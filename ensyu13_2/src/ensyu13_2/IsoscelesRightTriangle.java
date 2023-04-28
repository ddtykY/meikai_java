package ensyu13_2;

/*
 *  クラス名 :AbstLine
 *  概要     :直角二等辺三角形を表す抽象クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public abstract class IsoscelesRightTriangle extends Shape{
	// フィールドの宣言
	// 長方形の高さ
	private int heightLength;

	// 最低の高さ
	private final int MINIMUM_HEIGHT = 1;

	// コンストラクタ
	public IsoscelesRightTriangle(int heightLength) {
		// もし"heightLength"が"MINIMUM_HEIGHT"未満なら
		if(heightLength < MINIMUM_HEIGHT) {
			// "heightLength"を"MINIMUM_HEIGHT"とする
			heightLength = MINIMUM_HEIGHT;
		}
		// フィールドの高さに引数として与えられたものを代入する
		this.heightLength = heightLength;
	}
	
	/*
	 * 関数名           :getHeightLength
	 * メソッドの説明   :高さを取得する
	 * パラメータの説明 :なし
	 * 返り値           :heightLength　高さ
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public int getHeightLength(){
		// "heightLength"を返却する
		return heightLength;
	}
	
	/*
	 * 関数名           :getHeightLength
	 * メソッドの説明   :高さを設定する
	 * パラメータの説明 :heightLength　高さ
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public void getHeightLength(int heightLength){
		// フィールドの"heightLength"に引数のものを代入する
		this.heightLength = heightLength;
	}
	
}
