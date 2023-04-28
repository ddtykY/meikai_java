package ensyu14_3;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu14_3
 *  概要     :演習問題14-3の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public class Ensyu14_3 {
	// Scannerクラスのインスタンスを生成
	static Scanner standardInput = new Scanner(System.in);
	/*
	 * 関数名           :main
	 * メソッドの説明   :作成したDVDプレーヤクラスの動作確認をする
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.27
	 */
	public static void main(String[] args) {
		// DVDPlayerクラスのインスタンスを生成
		DVDPlayer playDVD = new DVDPlayer();
		// 再生の状態を表す文字列
		final String[] PLAY_STYLE = {"通常再生", "スロー再生"};
		// 通常再生の状態を表す定数
		final int NOMAL_PLAYING = 0;
		// スロー再生の状態をを表す定数
		final int SLOW_PLAYING = 1;
		
		// 選択に対してのyes確認用の文字列
		final String YES_ANSEWR = "y";
		// 選択に対しての解答を格納する文字列
		String answerCheck = YES_ANSEWR;
		
		// 再生
		playDVD.playRecord();
		// 再生しているかチェックするための変数
		boolean playCheck = true;
		// 再生状態を確認する変数
		int statePlaying = NOMAL_PLAYING;
		while (playCheck) {
			// 再生状態を変更するか問う
			System.out.println("\n" + PLAY_STYLE[statePlaying] + "中");
			// もし通常再生中なら
			if(statePlaying == NOMAL_PLAYING) {
				// 再生を終了するか問う
				System.out.print(PLAY_STYLE[SLOW_PLAYING] + "に変更しますか Yes…y / No…other : ");
				// "answerCheck"に入力された値を代入する
				answerCheck = standardInput.next();
				// 入力された値が"YES_ANSEWR"と等しいなら
				if(answerCheck.equals(YES_ANSEWR)) {
					// スロー再生 
					playDVD.slowPlay();
					// 再生状態を変更する
					statePlaying = SLOW_PLAYING;
					// ループの終了地点まで飛ばす
					continue;
				}
			// もしスロー再生中なら
			} else if(statePlaying == SLOW_PLAYING) {
				// 再生を終了するか問う
				System.out.print(PLAY_STYLE[NOMAL_PLAYING] + "に変更しますか Yes…y / No…other : ");
				// "answerCheck"に入力された値を代入する
				answerCheck = standardInput.next();
				// 入力された値が"YES_ANSEWR"と等しいなら
				if(answerCheck.equals(YES_ANSEWR)) {
					// スロー再生 
					playDVD.playRecord();
					// 再生状態を変更する
					statePlaying = NOMAL_PLAYING;
					// ループの終了地点まで飛ばす
					continue;
				}
			}
			// 再生を終了するか問う
			System.out.print("再生終了しますか Yes…y / No…other : ");
			// "answerCheck"に入力された値を代入する
			answerCheck = standardInput.next();
			// 入力された値が"YES_ANSEWR"と等しいなら
			if(answerCheck.equals(YES_ANSEWR)) {
				// "playCheck"をfalseにする
				playCheck = false;
				// 停止
				playDVD.stopRecord();
			}
		}
	}
}
