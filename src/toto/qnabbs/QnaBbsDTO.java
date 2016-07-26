package toto.qnabbs;

public class QnaBbsDTO {
	private int qSeq;
	private String qTitle;
	private String qContent;
	private String qNick;
	private int qReadcount;
	private String qWdate;
	private int qDel;
	private int qReplycount;

	public int getqSeq() {
		return qSeq;
	}

	public void setqSeq(int qSeq) {
		this.qSeq = qSeq;
	}

	public String getqTitle() {
		return qTitle;
	}

	public void setqTitle(String qTitle) {
		this.qTitle = qTitle;
	}

	public String getqContent() {
		return qContent;
	}

	public void setqContent(String qContent) {
		this.qContent = qContent;
	}

	public String getqNick() {
		return qNick;
	}

	public void setqNick(String qNick) {
		this.qNick = qNick;
	}

	public int getqReadcount() {
		return qReadcount;
	}

	public void setqReadcount(int qReadcount) {
		this.qReadcount = qReadcount;
	}

	public String getqWdate() {
		return qWdate;
	}

	public void setqWdate(String qWdate) {
		this.qWdate = qWdate;
	}

	public int getqDel() {
		return qDel;
	}

	public void setqDel(int qDel) {
		this.qDel = qDel;
	}

	public int getqReplycount() {
		return qReplycount;
	}

	public void setqReplycount(int qReplycount) {
		this.qReplycount = qReplycount;
	}

	@Override
	public String toString() {
		return "QnaBbsDTO [qSeq=" + qSeq + ", qTitle=" + qTitle + ", qContent=" + qContent + ", qNick=" + qNick
				+ ", qReadcount=" + qReadcount + ", qWdate=" + qWdate + ", qDel=" + qDel + ", qReplycount="
				+ qReplycount + "]";
	}

}
