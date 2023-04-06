package ensyu3_18;

//Scannerクラスを用いるためにimportする
import java.util.Scanner;

/*
 * クラス名:ensyu3_18
 * 概要    :演習問題3-18の回答クラスです。
 * 作成者  :山川勇輝
 * 作成日  :2023.04.06
 */
public class ensyu3_18 {
	/*
	 * 関数名           :main
	 * メソッドの説明   :月を1～12の整数値として読み込んで、それに対応する季節を表示する
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.06
	 */
	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
		Scanner standardInput = new Scanner(System.in);
		
		// 季節を求めるという旨を表示する
		System.out.println("季節を求めます");
		// 月を表す整数値の入力を促す
		System.out.print("何月ですか : ");
		// int型の変数"month"に入力された整数値を代入する
		int month = standardInput.nextInt();
		
		switch (month) {  // "month"の値によって分岐させる
		  case  3:
		  case  4:
		  case  5: System.out.println("それは春です"); // "month"が3～5の場合は春であることを表示
		           break;                              // これ以上表示しないようswich文を抜け出す
		  case  6:
		  case  7:
		  case  8: System.out.println("それは夏です"); // "month"が6～8の場合は夏であることを表示
		           break;                              // これ以上表示しないようswich文を抜け出す
		  case  9:
		  case 10:
		  case 11: System.out.println("それは秋です"); // "month"が9～11の場合は秋であることを表示
		           break;                              // これ以上表示しないようswich文を抜け出す
		  case 12:
		  case  1:
		  case  2: System.out.println("それは冬です"); // "month"が12～1の場合は冬であることを表示
		           break;                              // これ以上表示しないようswich文を抜け出す
		  default: System.out.println("不正な値です"); // "month"が1～12でない場合は不正な値であると表示
		           break;                              // これ以上表示しないようswich文を抜け出す
		}
		
		//standardInputを閉じる
		standardInput.close();
	}

}
