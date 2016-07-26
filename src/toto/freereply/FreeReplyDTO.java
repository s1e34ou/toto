package toto.freereply;

public class FreeReplyDTO {
	private int frSeq;
	private int frFSeq;
	private String frWdate;
	private String frContent;
	private int frDel;
	private String frNick;
	private String frPimg;

	public int getFrSeq() {
		return frSeq;
	}

	public void setFrSeq(int frSeq) {
		this.frSeq = frSeq;
	}

	public int getFrFSeq() {
		return frFSeq;
	}

	public void setFrFSeq(int frFSeq) {
		this.frFSeq = frFSeq;
	}

	public String getFrWdate() {
		return frWdate;
	}

	public void setFrWdate(String frWdate) {
		this.frWdate = frWdate;
	}

	public String getFrContent() {
		return frContent;
	}

	public void setFrContent(String frContent) {
		this.frContent = frContent;
	}

	public int getFrDel() {
		return frDel;
	}

	public void setFrDel(int frDel) {
		this.frDel = frDel;
	}

	public String getFrNick() {
		return frNick;
	}

	public void setFrNick(String frNick) {
		this.frNick = frNick;
	}

	public String getFrPimg() {
		return frPimg;
	}

	public void setFrPimg(String frPimg) {
		this.frPimg = frPimg;
	}

	@Override
	public String toString() {
		return "FreeReplyDTO [frSeq=" + frSeq + ", frFSeq=" + frFSeq + ", frWdate=" + frWdate + ", frContent="
				+ frContent + ", frDel=" + frDel + ", frNick=" + frNick + ", frPimg=" + frPimg + "]";
	}

}
