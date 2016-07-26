package toto.eventresult;

public class EventResultDTO {
	private int rSeq;
	private int rESeq;
	private String rId;

	public int getrSeq() {
		return rSeq;
	}

	public void setrSeq(int rSeq) {
		this.rSeq = rSeq;
	}

	public int getrESeq() {
		return rESeq;
	}

	public void setrESeq(int rESeq) {
		this.rESeq = rESeq;
	}

	public String getrId() {
		return rId;
	}

	public void setrId(String rId) {
		this.rId = rId;
	}

	@Override
	public String toString() {
		return "EventResultDTO [rSeq=" + rSeq + ", rESeq=" + rESeq + ", rId=" + rId + "]";
	}

}
