package toto.member;

public class TotoMemberDTO {
	private String tId;
	private String tPw;
	private String tName;
	private String tNick;
	private String tBirth;
	private String tMail;
	private int tPoint;
	private int tAuth;
	private String tPimg;

	public String gettId() {
		return tId;
	}

	public void settId(String tId) {
		this.tId = tId;
	}

	public String gettPw() {
		return tPw;
	}

	public void settPw(String tPw) {
		this.tPw = tPw;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettNick() {
		return tNick;
	}

	public void settNick(String tNick) {
		this.tNick = tNick;
	}

	public String gettBirth() {
		return tBirth;
	}

	public void settBirth(String tBirth) {
		this.tBirth = tBirth;
	}

	public String gettMail() {
		return tMail;
	}

	public void settMail(String tMail) {
		this.tMail = tMail;
	}

	public int gettPoint() {
		return tPoint;
	}

	public void settPoint(int tPoint) {
		this.tPoint = tPoint;
	}

	public int gettAuth() {
		return tAuth;
	}

	public void settAuth(int tAuth) {
		this.tAuth = tAuth;
	}

	public String gettPimg() {
		return tPimg;
	}

	public void settPimg(String tPimg) {
		this.tPimg = tPimg;
	}

	@Override
	public String toString() {
		return "TotoMemberDTO [tId=" + tId + ", tPw=" + tPw + ", tName=" + tName + ", tNick=" + tNick + ", tBirth="
				+ tBirth + ", tMail=" + tMail + ", tPoint=" + tPoint + ", tAuth=" + tAuth + ", tPimg=" + tPimg + "]";
	}

}
