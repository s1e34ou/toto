package toto.bbs;

public class TotoBbsDTO {
	private int fSeq;
	private String fTitle;
	private String fContent;
	private String fNick;
	private int fReadcount;
	private String fWdate;
	private int fDel;
	private int fReplycount;

	public String getfContent() {
		return fContent;
	}

	public void setfContent(String fContent) {
		this.fContent = fContent;
	}

	public int getfSeq() {
		return fSeq;
	}

	public void setfSeq(int fSeq) {
		this.fSeq = fSeq;
	}

	public String getfTitle() {
		return fTitle;
	}

	public void setfTitle(String fTitle) {
		this.fTitle = fTitle;
	}

	public String getfNick() {
		return fNick;
	}

	public void setfNick(String fNick) {
		this.fNick = fNick;
	}

	public int getfReadcount() {
		return fReadcount;
	}

	public void setfReadcount(int fReadcount) {
		this.fReadcount = fReadcount;
	}

	public String getfWdate() {
		return fWdate;
	}

	public void setfWdate(String fWdate) {
		this.fWdate = fWdate;
	}

	public int getfDel() {
		return fDel;
	}

	public void setfDel(int fDel) {
		this.fDel = fDel;
	}

	public int getfReplycount() {
		return fReplycount;
	}

	public void setfReplycount(int fReplycount) {
		this.fReplycount = fReplycount;
	}

	@Override
	public String toString() {
		return "TotoBbsDTO [fSeq=" + fSeq + ", fTitle=" + fTitle + ", fContent=" + fContent + ", fNick=" + fNick
				+ ", fReadcount=" + fReadcount + ", fWdate=" + fWdate + ", fDel=" + fDel + ", fReplycount="
				+ fReplycount + "]";
	}

}
