package ensyu14_3;

/*
 *  インターフェース名 :ExPlayer
 *  概要     :拡張プレーヤ インターフェース
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public interface ExPlayer extends Player{
	/*
	 * 関数名           :slowPlay
	 * メソッドの説明   :スロー再生用メソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public abstract void slowPlay();
}
