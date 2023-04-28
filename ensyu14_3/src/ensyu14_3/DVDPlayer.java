package ensyu14_3;

/*
 *  クラス名 :DVDPlayer
 *  概要     :DVDプレーヤクラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public class DVDPlayer implements ExPlayer {
	/*
	 * 関数名           :playRecord
	 * メソッドの説明   :再生用メソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public void playRecord() {
		// 再生する旨を表示する
		System.out.println("■DVD再生開始！");	
	}
	
	/*
	 * 関数名           :stopRecord
	 * メソッドの説明   :停止メソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public void stopRecord() {
		// 再生終了する旨を表示する
		System.out.println("■DVD再生終了！");	
	}
	
	/*
	 * 関数名           :slowPlay
	 * メソッドの説明   :スロー再生用メソッド
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.27
	 */
	public void slowPlay() {
		// スロー再生する旨を表示する
		System.out.println("■DVDスロー再生開始！");	
	}

}
