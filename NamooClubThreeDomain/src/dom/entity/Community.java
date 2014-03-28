package dom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.namoo.ns1.common.Identifiable;

public class Community implements Identifiable {

	private static final long serialVersionUID = -1649818789572216203L;
	
	private String id;
	private String name;
	private String description;
	private Date openDate;
	
	private CommunityManager manager;
	private List<CommunityMember> members;
	private List<Club> clubs;

	//--------------------------------------------------------------------------
	// constructors
	
	/**
	 * 
	 * @param communityName
	 * @param admin
	 */
	public Community(String id, String communityName, String description, SocialPerson admin){
		//
		this.id = id;
		this.name = communityName;
		this.description = description;
		this.members = new ArrayList<CommunityMember>();
		this.clubs = new ArrayList<Club>();
		this.openDate = new Date();
		
		setManager(admin);
		addMember(admin);
	}

	//--------------------------------------------------------------------------
	// getter/setter
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CommunityManager getManager() {
		return manager;
	}

	public List<CommunityMember> getMembers() {
		return members;
	}
	
	public List<Club> getClubs() {
		return clubs;
	}
	

	//--------------------------------------------------------------------------
	// public methods
	
	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public CommunityMember findMember(String email) {
		//
		for (CommunityMember member : members) {
			if(member.getEmail().equals(email)) {
				return member;
			};
		}
		return null;
	}
	
	/**
	 * 
	 * @param rolePerson
	 */
	public void setManager(SocialPerson rolePerson){
		//
		CommunityManager manager = new CommunityManager(name, rolePerson);
		this.manager = manager;
	}

	/**
	 * 
	 * @param rolePerson
	 */
	public void addMember(SocialPerson rolePerson){
		//
		CommunityMember member = new CommunityMember(name, rolePerson);
		this.members.add(member);
	}

	public void removeMember(String email) {
		// 
		CommunityMember found = null;
		for (CommunityMember member : members) {
			if (member.getEmail().equals(email)) {
				found = member;
			}
		}
		if (found != null) {
			members.remove(found);
		}
	}
	
	public void addClub(Club club) {
		//
		if (this.clubs == null) {
			this.clubs = new ArrayList<Club>();
		}
		this.clubs.add(club);
	}
	
	public void removeClub(String clubId) {
		//
		Club found = null;
		for (Club club : clubs) {
			if (club.getId().equals(clubId)) {
				found = club;
			}
		}
		if (found != null) {
			clubs.remove(found);
		}
	}
	
	@Override
	public String getOId() {
		// 
		return id;
	}
}