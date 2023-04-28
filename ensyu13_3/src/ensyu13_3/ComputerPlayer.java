package ensyu13_3;

import java.util.Random;

/*
 *  クラス名 :HumanPlayer
 *  概要     :じゃんけんの人間プレイヤーを表す抽象クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public class ComputerPlayer extends Player{
	// Randomクラスのインスタンスを生成
	private static Random randomNumber = new Random();
	// じゃんけんの手の形の種類
	private static final int KIND_OF_HAND = 3;
	// コンピュータの識別番号
	private static int computerId = 0;
	
	// コンストラクタ
	public ComputerPlayer(){
		// プレイヤーの名前をCPU+識別番号をインクリメントした値とする
		super.setplayerName("CPU" + (++computerId));
	}
	
	/*
	 * 関数名           :decideHandType
	 * メソッドの説明   :手の形を確定させる
	 * パラメータの説明 :なし
	 * 返り値           :生成した乱数
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public void decideHandType() {
		// 手の形を表す変数に"KIND_OF_HAND"の範囲で乱数を生成し代入する
		int handType = randomNumber.nextInt(KIND_OF_HAND);
		// メソッドsetHandTypeを呼び出す
		setHandType(handType);
	}
}
