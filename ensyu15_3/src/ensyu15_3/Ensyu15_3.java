package ensyu15_3;

import java.util.Scanner;

/*
 *  クラス名 :Ensyu15_3
 *  概要     :演習問題15-3の解答クラスです。
 *  作成者   :山川勇輝
 *  作成日   :2023.04.27
 */
public class Ensyu15_3 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :文字列を探索し一致する部分が上下でそろうように表示する(List15-6の改変)
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝 
	 * 作成日           :2023.04.27
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを生成
		Scanner standardInput = new Scanner(System.in);
		
		// 探索失敗時メソッドindexOfで探索失敗時に返ってくる値
		final int SEARCH_FAILD = -1;
		// 全角文字のバイト数
		final int FULL_WIDTH = 3;
		// 半角カタカナｦのバイト配列最終要素の値
		final int HALF_WIDTH_FIRST = -17;
		// 半角カタカナｦのバイト配列最終要素の値
		final int HALF_WIDTH_SECOND = -67;
		// 半角カタカナｦのバイト配列最終要素の値
		final int HALF_WIDTH_THIRD = -90;
		
		// 文字列の入力を促す
		System.out.print("文字列を入力してください\ns1 : ");
		// 入力された値をString型の変数に代入する
		String scanString = standardInput.next();

		// 文字列の入力を促す
		System.out.print("探索する文字列を入力してください\ns2 : ");
		// 入力された値をString型の変数に代入する
		String keyString = standardInput.next();
		
		// 区切りを表示する
		System.out.println("--------------------------------------");
		
		// 読み込んだ文字列を表示する
		System.out.println("\ns1:" + scanString.toString());
		
		// 探索する文字列の表示の準備をする
		System.out.print("s2:");
		
		// 探索の結果を格納する変数
		int searchValue = 0;
		// 探索の開始するインデックスを表す変数
		int startIndex = 0;
		// searchValueが"SEARCH_FAILD"になるまで繰り返す
		do {
			// indexOfメソッドを呼び出し探索する
			searchValue = scanString.indexOf(keyString, startIndex);
			// もし"searchValue"が"SEARCH_FAILD"でないなら
			if(searchValue != SEARCH_FAILD) {
				// "searchValue"と"startIndex"の間のインデックスの数だけ繰り返す
				for(int countValue = startIndex; countValue < searchValue; countValue++) {
					// インデックスが"countValue"の文字を取得しString型にする
					String newString = String.valueOf(scanString.charAt(countValue));
					// メソッドgetBytsを呼び出しその長さをint型の変数に格納する
					byte[] spaseByte = newString.getBytes();
					// スペースの長さを確認するための変数に配列spaseByteの要素数を代入する
					int spaceLength =  spaseByte.length;
					// "spaceLength"が"FULL_WIDTH"の場合
					if(spaceLength == FULL_WIDTH) {
						// 半角文字でない場合
						if((spaseByte[0] == HALF_WIDTH_FIRST && spaseByte[1] == HALF_WIDTH_SECOND && spaseByte[2] < HALF_WIDTH_THIRD)
							|| spaseByte[0] < HALF_WIDTH_FIRST || spaseByte[1] < HALF_WIDTH_SECOND) {
						// スペースを二つ表示する
						System.out.print("  ");
						// 全角文字なら
						} else {
							// スペースを一つ表示する
							System.out.print(" ");
						}
					// もし上記に該当しないなら
					}else{
						// スペースを一つ表示する
						System.out.print(" ");
					}
				}
				
				// 探索する文字列を表示する
				System.out.print(keyString.toString());
			}
			// "startIndex"を"searchValue"と"keyString"の長さの和とする
			startIndex = searchValue + keyString.length();
		// "searchValue"が"SEARCH_FAILD"でないなら繰り返す
		} while (searchValue != SEARCH_FAILD);
	}
}
