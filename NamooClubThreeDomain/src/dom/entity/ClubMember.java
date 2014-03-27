package dom.entity;

import com.namoo.ns1.common.Identifiable;

public class ClubMember implements Identifiable {

	private static final long serialVersionUID = -7152338592818382357L;

	private String clubName;
	private SocialPerson rolePerson;
	
	//--------------------------------------------------------------------
	
	public ClubMember(String clubName, SocialPerson rolePerson) {
		//
		this.clubName = clubName;
		this.rolePerson = rolePerson;
	}
	//---------------------------------------------------------------------------
	
	public String getName() {
		return rolePerson.getName();
	}
	
	public String getEmail() {
		return rolePerson.getEmail();
	}
	
	@Override
	public String getOId() {
		//
		return clubName + "|" + rolePerson.getEmail();
	}

}
