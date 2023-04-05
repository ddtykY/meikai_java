package ensyu2_10;

// Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
 * クラス名:ensyu2_10
 * 概要    :演習2-10の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.05
 */
public class ensyu2_10 {
	/**
	 * 関数名           :main
	 * メソッドの説明   :名前の姓と名を個別にキーボードに読み込み挨拶を行う
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.05
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成する
		Scanner standardInput = new Scanner(System.in);
		
		// 姓の入力を促す
		System.out.print("姓 : ");
		// String型の変数に入力した姓を代入する
		String lastName = standardInput.next();
		
		// 名の入力を促す
		System.out.print("名 : ");
		// String型の変数に入力した名を代入する
		String firstName = standardInput.next();
		
		// "lastName""firstName"の順に表示し挨拶を行う
		System.out.println("こんにちは" + lastName + firstName + "さん。");

		//standardInputを閉じる
		standardInput.close();
	}
}
