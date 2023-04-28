package ensyu15_5;

import java.util.Scanner;

/*
 *  クラス名 :HumanPlayer
 *  概要     :じゃんけんの人間プレイヤーを表す抽象クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.26
 */
public class HumanPlayer extends Player{
	// Randomクラスのインスタンスを生成
	private static Scanner standardInput = new Scanner(System.in);
	
	// グーを表す定数
	private static final int TYPE_ROCK = 0;
	// チョキを表す定数
	private static final int TYPE_SCISSORS = 1;
	// パーを表す定数
	private static final int TYPE_PAPER = 2;
	
	// コンストラクタ
	public HumanPlayer(String playerName){
		// プレイヤーの名前を引数として与えられたものにする
		super.setplayerName(playerName);
	}
	
	/*
	 * 関数名           :decideHandType
	 * メソッドの説明   :手の形を確定させる
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.26
	 */
	public void decideHandType() {
		// 出す手の入力を促す
		System.out.print("0以下…グー/1…チョキ/2以上…パー : ");
		// 入力された値を代入する
		int handType = standardInput.nextInt();
		// TYPE_ROCKより小さければ
		if(handType < TYPE_ROCK) {
			// "handType"を"TYPE_ROCK"とする
			handType = TYPE_ROCK;
			// TYPE_PAPERより小さければ
		}else if(handType > TYPE_PAPER) {
				// "TYPE_PAPER"を"TYPE_PAPER"とする
				handType = TYPE_PAPER;
		}
		// メソッドsetHandTypeを呼び出す
		setHandType(handType);
	}
}
