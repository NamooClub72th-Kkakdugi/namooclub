package dom.entity;

import com.namoo.ns1.common.Identifiable;

public class ClubManager implements Identifiable {

	private static final long serialVersionUID = 7096706829023569656L;

	private String clubName;
	private SocialPerson rolePerson;
	//----------------------------------------------------------------
	public ClubManager(String clubName, SocialPerson rolePerson) {
		//
		this.clubName = clubName;
		this.rolePerson = rolePerson;
	}
	//-------------------------------------------------------------------------
	
	public String getName() {
		//
		return rolePerson.getName();
	}
	
	public String getEmail() {
		//
		return rolePerson.getEmail();
	}
	
	@Override
	public String getOId() {
		//
		return clubName + "|" + rolePerson.getEmail();
	}

}
