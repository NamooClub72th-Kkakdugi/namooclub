package dom.entity;

import com.namoo.ns1.common.Identifiable;

public class IdValue implements Identifiable {

	private static final long serialVersionUID = 7955846604033722562L;

	private int value;
	private String name;
	
	public IdValue(String name) {
		//
		this.name = name;
	}

	//--------getter---------------------------------------------------------
	public int getId() {
		return value;
	}

	
	//-------------method-----------------------------------------------------
	
	public int increaseId() {
		//
		return value++;
	}

	@Override
	public String getOId() {
		//
		return name;
	}

}
