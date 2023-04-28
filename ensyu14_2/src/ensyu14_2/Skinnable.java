package ensyu14_2;

/*
 *  インターフェース名 :Skinnable
 *  概要     :着せ替えインターフェース
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public interface Skinnable {
	// 黒
	public static final int BLACK = 0;
	// 赤
	public static final int RED = 1;
	// 緑
	public static final int GREEN = 2;
	// 青
	public static final int BLUE = 3;
	// 豹柄
	public static final int LEOPARD = 4;
	
	// スキンの色を格納した配列
	String[] skinColor = {"黒", "赤", "緑", "青", "豹柄"};
	
	/*
	 * 関数名           :changeSkin
	 * メソッドの説明   :スキン変更用のメソッド
	 * パラメータの説明 :kindSkin　スキンの種類
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public abstract void changeSkin(int kindSkin);
}
