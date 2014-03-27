package dom.entity;

import java.util.ArrayList;
import java.util.List;

import com.namoo.ns1.common.Identifiable;

public class Club implements Identifiable {

	private static final long serialVersionUID = 3066633976084014659L;

	private String id;
	private String name;
	private String description;

	private ClubManager manager;
	private List<ClubMemeber> members;

	// -------------------------------------------------------------------

	public Club(String id, String clubName, String description, SocialPerson admin) {
		//
		this.id = id;
		this.name = clubName;
		this.description = description;
		this.members = new ArrayList<ClubMemeber>();

		setManager(admin);
		addMemeber(admin);
	}

	// --------------------------------------------------------------------

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

	public List<ClubMemeber> getMembers() {
		return members;
	}

	// ------------------------------------------------------------------
	
	public ClubMemeber findMemeber(String email) {
		//
		for (ClubMemeber member : members) {
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
	
	public void addMemeber(SocialPerson rolePerson) {
		//
		ClubMemeber memeber = new ClubMemeber(name, rolePerson);
		this.members.add(memeber);
	}
	
	public void removeMemeber(String email) {
		//
		ClubMemeber found = null;
		for (ClubMemeber member : members) {
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
