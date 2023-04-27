package ensyu10_2;

/*
 *  クラス名 :ExId
 *  概要     :連番クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.24
 */
public class ExId {
	// クラス変数の宣言
	// 何番までの識別番号を与えたか
	private static int counterId = 0;
	// 識別番号をいくらずつ増やしていくか
	private static int widthId = 1;
	
	// フィールドの宣言
	// 識別番号
	private int userId;
	
	// コンストラクタ
	public ExId() {
		// "counterId"を"widthId"だけ増やす
		counterId += widthId;
		// "userId"に"counterId"の値を代入する
		userId = counterId;
	}
	
	/*
	 * 関数名           :getMaxId
	 * メソッドの説明   :最後に与えた識別番号を取得する
	 * パラメータの説明 :なし
	 * 返り値           :counterId　最後に与えた識別番号
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static int getMaxId() {
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
	
	/*
	 * 関数名           :getWidthId
	 * メソッドの説明   :識別番号の幅を取得する
	 * パラメータの説明 :なし
	 * 返り値           :widthId　識別番号の幅
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static int getWidthId() {
		// "widthId"を返却する
		return widthId;
	}
	
	/*
	 * 関数名           :changeWidthId
	 * メソッドの説明   :"widthId"を与えられた値に変化させる
	 * パラメータの説明 :widthValue　与えられた正の整数値
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.24
	 */
	public static void changeWidthId(int widthValue) {
		// "counterId"に引数の"widthValue"を代入する
		widthId = widthValue;
	}

}
