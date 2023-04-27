package ensyu12_2;

/*
 *  クラス名 :TimeAccount
 *  概要     :定期預金付き銀行口座クラス
 *  作成者   :山川勇輝
 *  作成日   :2023.04.25
 */
public class TimeAccount extends Account {
	// フィールドの宣言
	// 預金残高（定期預金）
	private long timeBalance;
	
	// 預金の最低額
	private final long MINIMUM_TIME_DEPOSIT = 0;
	
	// コンストラクタ
	// Accountクラスのインスタンスと定期預金額を与えられた場合
	public TimeAccount(Account userAccount, long timeBalance){
		super(userAccount);
		// もし"timeBalance"が"MINIMUM_TIME_DEPOSIT"未満なら
		if(timeBalance < MINIMUM_TIME_DEPOSIT) {
			// "timeBalance"を"MINIMUM_TIME_DEPOSIT"にする
			timeBalance = MINIMUM_TIME_DEPOSIT;
		}
		// 預金残高（定期預金）フィールドのものに引数のそれを代入する
		this.timeBalance = timeBalance;
	}
	
	// 全てを引数として与えられた場合
	public TimeAccount(String accountHolder, String accountNumber, long depositBalance, long timeBalance){
		// クラスAccountのコンストラクタの呼び出し
		super(accountHolder, accountNumber, depositBalance);
		// もし"timeBalance"が"MINIMUM_TIME_DEPOSIT"未満なら
		if(timeBalance < MINIMUM_TIME_DEPOSIT) {
			// "timeBalance"を"MINIMUM_TIME_DEPOSIT"にする
			timeBalance = MINIMUM_TIME_DEPOSIT;
		}
		// 預金残高（定期預金）フィールドのものに引数のそれを代入する
		this.timeBalance = timeBalance;
	}
	
	/*
	 * 関数名           :getTimeBalance
	 * メソッドの説明   :定期預金を調べる
	 * パラメータの説明 :なし
	 * 返り値           :timeBalance　定期預金
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public long getTimeBalance() {
		// "timeBalance"を返却する
		return timeBalance;
	}
	
	/*
	 * 関数名           :cancelTimeBalance
	 * メソッドの説明   :定期預金を解約して全額普通預金に移す
	 * パラメータの説明 :なし
	 * 返り値           :なし
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public void cancelTimeBalance() {
		// メソッドmakeDepositを呼び出し普通預金に移す
		makeDeposit(timeBalance);
		// 定期預金を0にする
		timeBalance = 0;
	}
	
	/*
	 * 関数名           :toString
	 * メソッドの説明   :個人データの文字列を返却する
	 * パラメータの説明 :なし
	 * 返り値           :個人データの文字列
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.21
	 */
	public String toString() {
		// 返却する
		return String.format("%s\n定期預金額 : %d円", super.toString(), timeBalance);
	}
	
	// 以下演習12-2
	/*
	 * 関数名           :totalDeposit
	 * メソッドの説明   :預金残高を取得する
	 * パラメータの説明 :なし
	 * 返り値           :totalDeposit　普通預金と定期預金の合計を返却する
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public long totalDeposit() {
		// 合計を格納する変数を宣言する
		long totalDeposit = 0;
		// 普通預金と定期預金の合計を"totalDeposit"に代入する
		totalDeposit = getDepositBalance() + timeBalance;
		// "depositBalance"を返却する
		return totalDeposit;
	}
	
	/*
	 * 関数名           :compBalance
	 * メソッドの説明   :銀行口座クラス型変数a,bの普通預金と定期預金の合計額を比較した結果を返す
	 * パラメータの説明 :a　一つ目の銀行口座クラス
	 *                   b　二つ目の銀行口座クラス
	 * 返り値           :compareBalance　a方が大きければ1、等しいなら0、bの方が大きければ-1
	 * 作成者           :山川勇輝
	 * 作成日           :2023.04.25
	 */
	public static int compBalance(Account a, Account b) {
		// 比較し返却するための値を宣言する
		int compBalance = 0;
		// aの方が多い場合に返却する値
		final int A_IS_MORE = 1;
		// 等しい場合に返却する値
		final int EQUAL_BALANCE = 0;
		// bの方が多い場合に返却する値
		final int B_IS_MORE = -1;
		
		// もしaの方が大きければ
		if(a.totalDeposit() > b.totalDeposit()) {
			// "compBalance"をA_IS_MOREにする
			compBalance = A_IS_MORE;
		// もし等しいなら
		} else if(a.totalDeposit() == b.totalDeposit()) {
			// "compBalance"をEQUAL_BALANCEにする
			compBalance = EQUAL_BALANCE;
		// もしbの方が大きければ
		} else {
			// "compBalance"をB_IS_MOREにする
			compBalance = B_IS_MORE;
		}
		// "compBalance"を返却する
		return compBalance;
	}
}
