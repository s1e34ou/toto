package toto.betting;

public class BettingDTO {
	private int bSeq;
	private String bId;
	private String bBat;
	private String bBdate;
	private int bMoney;
	private int bRate;
	private int bResult;

	public int getbSeq() {
		return bSeq;
	}

	public void setbSeq(int bSeq) {
		this.bSeq = bSeq;
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public String getbBat() {
		return bBat;
	}

	public void setbBat(String bBat) {
		this.bBat = bBat;
	}

	public String getbBdate() {
		return bBdate;
	}

	public void setbBdate(String bBdate) {
		this.bBdate = bBdate;
	}

	public int getbMoney() {
		return bMoney;
	}

	public void setbMoney(int bMoney) {
		this.bMoney = bMoney;
	}

	public int getbRate() {
		return bRate;
	}

	public void setbRate(int bRate) {
		this.bRate = bRate;
	}

	public int getbResult() {
		return bResult;
	}

	public void setbResult(int bResult) {
		this.bResult = bResult;
	}

	@Override
	public String toString() {
		return "BettingDTO [bSeq=" + bSeq + ", bId=" + bId + ", bBat=" + bBat + ", bBdate=" + bBdate + ", bMoney="
				+ bMoney + ", bRate=" + bRate + ", bResult=" + bResult + "]";
	}

}
