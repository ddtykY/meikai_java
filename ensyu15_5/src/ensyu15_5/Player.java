package ensyu15_5;

/*
 *  クラス名 :Player
 *  概要     :じゃんけんのプレイヤーを表す抽象クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public abstract class Player {
	// フィールドの宣言
	// 手の形を表す
	private int handType = 0;
	// プレイヤーの名前を表す
	private String playerName = "player";
	
	// 手の形を表す配列
	private String[] handArray = {"グー", "チョキ", "パー"};
	
	/*
	 * 関数名           :getHandType
	 * メソッドの説明   :手の形を表す整数を返却する
	 * パラメータの説明 :なし
	 * 返り値           :handType　手の形を表す
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public int getHandType() {
		// "handType"を返却する
		return handType;
	}
	
	/*
	 * 関数名           :getplayerName
	 * メソッドの説明   :プレイヤーの名前を取得する
	 * パラメータの説明 :なし
	 * 返り値           :playerName　プレイヤーの名前
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public String getplayerName() {
		// "playerName"を返却する
		return playerName;
	}
	
	/*
	 * 関数名           :setHandType
	 * メソッドの説明   :手の形を表す整数を返却する
	 * パラメータの説明 :handType　手の形を表す
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public void setHandType(int handType) {
		// フィールドの"handType"を引数のものに設定する
		this.handType = handType;
	}
	
	/*
	 * 関数名           :setplayerName
	 * メソッドの説明   :プレイヤーの名前を設定する
	 * パラメータの説明 :playerName　プレイヤーの名前
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public void setplayerName(String playerName) {
		// フィールドの"playerName"を引数のものに設定する
		this.playerName = playerName;
	}
	
	/*
	 * 関数名           :decideHandType
	 * メソッドの説明   :手の形を確定させる
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public abstract void decideHandType();
	
	/*
	 * 関数名           :toString
	 * メソッドの説明   :手の形の情報を表す文字列を返却する抽象メソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public String toString() {
		// プレイヤーの情報を表す文字列を返却する
		return String.format("%s : %s", playerName, handArray[handType]);
	}
}
