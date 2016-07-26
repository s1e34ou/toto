package toto.eventbbs;

public class EventBbsDTO {
	private int eSeq;
	private int eTitle;
	private String eContent;
	private String eNick;
	private int eReadcount;
	private String eWdate;
	private String eSdate;
	private String eEdate;
	private int eDel;
	private int eNotice;

	public int geteSeq() {
		return eSeq;
	}

	public void seteSeq(int eSeq) {
		this.eSeq = eSeq;
	}

	public int geteTitle() {
		return eTitle;
	}

	public void seteTitle(int eTitle) {
		this.eTitle = eTitle;
	}

	public String geteContent() {
		return eContent;
	}

	public void seteContent(String eContent) {
		this.eContent = eContent;
	}

	public String geteNick() {
		return eNick;
	}

	public void seteNick(String eNick) {
		this.eNick = eNick;
	}

	public int geteReadcount() {
		return eReadcount;
	}

	public void seteReadcount(int eReadcount) {
		this.eReadcount = eReadcount;
	}

	public String geteWdate() {
		return eWdate;
	}

	public void seteWdate(String eWdate) {
		this.eWdate = eWdate;
	}

	public String geteSdate() {
		return eSdate;
	}

	public void seteSdate(String eSdate) {
		this.eSdate = eSdate;
	}

	public String geteEdate() {
		return eEdate;
	}

	public void seteEdate(String eEdate) {
		this.eEdate = eEdate;
	}

	public int geteDel() {
		return eDel;
	}

	public void seteDel(int eDel) {
		this.eDel = eDel;
	}

	public int geteNotice() {
		return eNotice;
	}

	public void seteNotice(int eNotice) {
		this.eNotice = eNotice;
	}

	@Override
	public String toString() {
		return "EventBbsDTO [eSeq=" + eSeq + ", eTitle=" + eTitle + ", eContent=" + eContent + ", eNick=" + eNick
				+ ", eReadcount=" + eReadcount + ", eWdate=" + eWdate + ", eSdate=" + eSdate + ", eEdate=" + eEdate
				+ ", eDel=" + eDel + ", eNotice=" + eNotice + "]";
	}

}
