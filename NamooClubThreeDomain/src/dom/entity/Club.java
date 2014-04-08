package dom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.namoo.ns1.common.Identifiable;

public class Club implements Identifiable {

	private static final long serialVersionUID = 3066633976084014659L;

	private String id;
	private String name;
	private String description;
	private String category;
	private Date openDate;

	private ClubManager manager;
	private List<ClubMember> members;

	// -------------------------------------------------------------------

	public Club(String id, String category, String clubName, String description, SocialPerson admin) {
		//
		this.id = id;
		this.name = clubName;
		this.description = description;
		this.category = category;
		this.members = new ArrayList<ClubMember>();

		setManager(admin);
		addMember(admin);
	}

	// --------------------------------------------------------------------

	public String getCategory() {
		return category;
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

	public String getId() {
		return id;
	}

	public ClubManager getManager() {
		return manager;
	}

	public List<ClubMember> getMembers() {
		return members;
	}
	
	
	public Date getOpenDate() {
		return openDate;
	}
	
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	// ------------------------------------------------------------------
	

	public ClubMember findMember(String email) {
		//
		for (ClubMember member : members) {
			if (member.getEmail().equals(email)) {
				return member;
			};
		}
		return null;
	}
	
	public void setManager(SocialPerson rolePerson) {
		//
		ClubManager manager = new ClubManager(name, rolePerson);
		this.manager = manager;
	}
	
	public void addMember(SocialPerson rolePerson) {
		//
		ClubMember memeber = new ClubMember(name, rolePerson);
		this.members.add(memeber);
	}
	
	public void removeMember(String email) {
		//
		ClubMember found = null;
		for (ClubMember member : members) {
			if (member.getEmail().equals(email)) {
				found = member;
			}
		}
		if (found != null) {
			members.remove(found);
		}
	}
	
	@Override
	public String getOId() {
		//
		return id;
	}
}
