package toto.pointlist;

public class PointListDTO {
	private int pSeq;
	private String pTId;
	private String pDate;
	private int pCpoint;
	private int pTpoint;
	private int pType;

	public int getpSeq() {
		return pSeq;
	}

	public void setpSeq(int pSeq) {
		this.pSeq = pSeq;
	}

	public String getpTId() {
		return pTId;
	}

	public void setpTId(String pTId) {
		this.pTId = pTId;
	}

	public String getpDate() {
		return pDate;
	}

	public void setpDate(String pDate) {
		this.pDate = pDate;
	}

	public int getpCpoint() {
		return pCpoint;
	}

	public void setpCpoint(int pCpoint) {
		this.pCpoint = pCpoint;
	}

	public int getpTpoint() {
		return pTpoint;
	}

	public void setpTpoint(int pTpoint) {
		this.pTpoint = pTpoint;
	}

	public int getpType() {
		return pType;
	}

	public void setpType(int pType) {
		this.pType = pType;
	}

	@Override
	public String toString() {
		return "PointListDTO [pSeq=" + pSeq + ", pTId=" + pTId + ", pDate=" + pDate + ", pCpoint=" + pCpoint
				+ ", pTpoint=" + pTpoint + ", pType=" + pType + "]";
	}

}
