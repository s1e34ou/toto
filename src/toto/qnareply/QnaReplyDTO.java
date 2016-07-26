package toto.qnareply;

public class QnaReplyDTO {
	private int qrSeq;
	private int qrQSeq;
	private String qrWdate;
	private String qrContent;
	private int qrDel;
	private String qrNick;
	private String qrPimg;

	public int getQrSeq() {
		return qrSeq;
	}

	public void setQrSeq(int qrSeq) {
		this.qrSeq = qrSeq;
	}

	public int getQrQSeq() {
		return qrQSeq;
	}

	public void setQrQSeq(int qrQSeq) {
		this.qrQSeq = qrQSeq;
	}

	public String getQrWdate() {
		return qrWdate;
	}

	public void setQrWdate(String qrWdate) {
		this.qrWdate = qrWdate;
	}

	public String getQrContent() {
		return qrContent;
	}

	public void setQrContent(String qrContent) {
		this.qrContent = qrContent;
	}

	public int getQrDel() {
		return qrDel;
	}

	public void setQrDel(int qrDel) {
		this.qrDel = qrDel;
	}

	public String getQrNick() {
		return qrNick;
	}

	public void setQrNick(String qrNick) {
		this.qrNick = qrNick;
	}

	public String getQrPimg() {
		return qrPimg;
	}

	public void setQrPimg(String qrPimg) {
		this.qrPimg = qrPimg;
	}

	@Override
	public String toString() {
		return "QnaReplyDTO [qrSeq=" + qrSeq + ", qrQSeq=" + qrQSeq + ", qrWdate=" + qrWdate + ", qrContent="
				+ qrContent + ", qrDel=" + qrDel + ", qrNick=" + qrNick + ", qrPimg=" + qrPimg + "]";
	}

}
