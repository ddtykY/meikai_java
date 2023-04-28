package ensyu14_3;

/*
 *  インターフェース名 :Player
 *  概要     :プレーヤ インターフェース
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public interface Player {
	/*
	 * 関数名           :playRecord
	 * メソッドの説明   :再生用メソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public abstract void playRecord();
	
	/*
	 * 関数名           :stopRecord
	 * メソッドの説明   :停止メソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public abstract void stopRecord();
}
