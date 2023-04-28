package ensyu14_2;

/*
 *  クラス名 :Pet
 *  概要     :ペットクラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public class Pet {
	// ペットの名前
	private String petName;
	// 飼い主の名前
	private String masterName;

	// コンストラクタ
	public Pet(String petName, String masterName) {
		// フィールドの"petName"に引数として与えられたそれを代入する
		this.petName = petName;
		// フィールドの"masterName"に引数として与えられたそれを代入する
		this.masterName = masterName;
	}

	/*
	 * 関数名           :getPetName
	 * メソッドの説明   :ペットの名前を返却するメソッド
	 * パラメータの説明 :なし
	 * 返り値           :petName　ペットの名前
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public String getPetName() {
		// ペットの名前を返却する
		return petName;
	}

	/*
	 * 関数名           :getMasterName
	 * メソッドの説明   :飼い主の名前を返却するメソッド
	 * パラメータの説明 :なし
	 * 返り値           :masterName　飼い主の名前
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public String getMasterName() {
		// 飼い主の名前を返却する
		return masterName;
	}

	/*
	 * 関数名           :introduceName
	 * メソッドの説明   :ペットとその飼い主の名前を表示するメソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public void introduceName() {
		// ペットの自己紹介
		System.out.println("■僕の名前は" + petName + "です！"); 
		// 飼い主の自己紹介
		System.out.println("■ご主人様は" + masterName + "です！");
	}

}
