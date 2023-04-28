package ensyu14_2;

/*
 *  クラス名 :RobotPet
 *  概要     :ロボットペットクラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public class RobotPet extends Pet{
	// 家事の種類を格納した配列
	public String[] kindsWork = {"掃除", "洗濯", "炊事"};
	
	// コンストラクタ
	public RobotPet(String petName, String masterName) {
		//スーパークラスのコンストラクタを呼び出す
		super(petName, masterName);
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
		System.out.println("◇僕の名前は" + getPetName() + "です！"); 
		// 飼い主の自己紹介
		System.out.println("◇ご主人様は" + getMasterName() + "です！");
	}
	
	/*
	 * 関数名           :hoseWork
	 * メソッドの説明   :家事をする
	 * パラメータの説明 :switchWork　家事の種類を切り替える
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public void hoseWork(int switchWork) {
		// 家事の内容を表示する
		System.out.println(kindsWork[switchWork] + "します。");
	}

}
