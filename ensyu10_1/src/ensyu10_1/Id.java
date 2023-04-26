package ensyu10_1;

/*
 *  クラス名 :Id
 *  概要     :連番クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.24
 */
public class Id {
	// クラス変数の宣言
	// 何番までの識別番号を与えたか
	private static int counterId = 0;
	
	// フィールドの宣言
	// 識別番号
	private int userId;
	
	// コンストラクタ
	public Id() {
		// "userId"に"counterId"をインクリメントした値を代入する
		userId = ++counterId;
	}
	
	/*
	 * 関数名           :getMaxId
	 * メソッドの説明   :最後に与えた識別番号を取得する
	 * パラメータの説明 :なし
	 * 返り値           :counterId　最後に与えた識別番号
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	static int getMaxId() {
		// "counterId"を返却する
		return counterId;
	}
	
	/*
	 * 関数名           :getUserId
	 * メソッドの説明   :識別番号を取得する
	 * パラメータの説明 :なし
	 * 返り値           :userId　識別番号
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public int getUserId() {
		// "userId"を返却する
		return userId;
	}
}
