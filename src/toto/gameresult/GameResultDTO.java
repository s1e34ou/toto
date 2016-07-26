package toto.gameresult;

public class GameResultDTO {
	private int gSeq;
	private String gInfo;
	private String gDate;
	private String gTime;
	private String gHteam;
	private String gHemblem;
	private int gHscore;
	private String gAteam;
	private String gAemblem;
	private int gAscore;
	private int gWin;
	private int gDraw;
	private int gLose;

	public int getgSeq() {
		return gSeq;
	}

	public void setgSeq(int gSeq) {
		this.gSeq = gSeq;
	}

	public String getgInfo() {
		return gInfo;
	}

	public void setgInfo(String gInfo) {
		this.gInfo = gInfo;
	}

	public String getgDate() {
		return gDate;
	}

	public void setgDate(String gDate) {
		this.gDate = gDate;
	}

	public String getgTime() {
		return gTime;
	}

	public void setgTime(String gTime) {
		this.gTime = gTime;
	}

	public String getgHteam() {
		return gHteam;
	}

	public void setgHteam(String gHteam) {
		this.gHteam = gHteam;
	}

	public String getgHemblem() {
		return gHemblem;
	}

	public void setgHemblem(String gHemblem) {
		this.gHemblem = gHemblem;
	}

	public int getgHscore() {
		return gHscore;
	}

	public void setgHscore(int gHscore) {
		this.gHscore = gHscore;
	}

	public String getgAteam() {
		return gAteam;
	}

	public void setgAteam(String gAteam) {
		this.gAteam = gAteam;
	}

	public String getgAemblem() {
		return gAemblem;
	}

	public void setgAemblem(String gAemblem) {
		this.gAemblem = gAemblem;
	}

	public int getgAscore() {
		return gAscore;
	}

	public void setgAscore(int gAscore) {
		this.gAscore = gAscore;
	}

	public int getgWin() {
		return gWin;
	}

	public void setgWin(int gWin) {
		this.gWin = gWin;
	}

	public int getgDraw() {
		return gDraw;
	}

	public void setgDraw(int gDraw) {
		this.gDraw = gDraw;
	}

	public int getgLose() {
		return gLose;
	}

	public void setgLose(int gLose) {
		this.gLose = gLose;
	}

	@Override
	public String toString() {
		return "GameResultDTO [gSeq=" + gSeq + ", gInfo=" + gInfo + ", gDate=" + gDate + ", gTime=" + gTime
				+ ", gHteam=" + gHteam + ", gHemblem=" + gHemblem + ", gHscore=" + gHscore + ", gAteam=" + gAteam
				+ ", gAemblem=" + gAemblem + ", gAscore=" + gAscore + ", gWin=" + gWin + ", gDraw=" + gDraw + ", gLose="
				+ gLose + "]";
	}

}
