package ensyu14_2;

/*
 *  クラス名 :SkinnalbleRobotPet
 *  概要     :着せ替え可能なロボットペットクラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public class SkinnableRobotPet extends RobotPet implements Skinnable{
	// スキンの色
	private int kindSkin = BLACK;
	
	// コンストラクタ
	public SkinnableRobotPet(String petName, String masterName) {
		//スーパークラスのコンストラクタを呼び出す
		super(petName, masterName);
	}
	
	/*
	 * 関数名           :putSkinColor
	 * メソッドの説明   :現在のスキンの色を返却する
	 * パラメータの説明 :なし
	 * 返り値           :kindSkin　スキンの色
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public String putSkinColor() {
		// スキンの色を返却する
		return skinColor[kindSkin];
	}
	
	/*
	 * 関数名           :changeSkin
	 * メソッドの説明   :スキン変更用のメソッド
	 * パラメータの説明 :kindSkin　スキンの種類
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public void changeSkin(int kindSkin) {
		// フィールドの"kindSkin"を引数のものに変更する
		this.kindSkin = kindSkin;
		// スキンを変更した旨を表示する
		System.out.println("スキンを" + skinColor[kindSkin] + "に変更しました。");
	}
	
}
