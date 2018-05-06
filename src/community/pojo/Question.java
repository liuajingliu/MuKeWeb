package community.pojo;

/**
 * @author Αυ666
 *
 */
public class Question {
	
	private String community_id;
	private String community_name;
	private String community_desc;	
	private String community_stuid;
	
	
	public Question() {
		super();
	}
	public Question(String community_id, String community_name,
			String community_desc, String community_stuid) {
		super();
		this.community_id = community_id;
		this.community_name = community_name;
		this.community_desc = community_desc;
		this.community_stuid = community_stuid;
	}
	@Override
	public String toString() {
		return "Question [community_id=" + community_id + ", community_name="
				+ community_name + ", community_desc=" + community_desc
				+ ", community_stuid=" + community_stuid + "]";
	}
	public String getCommunity_id() {
		return community_id;
	}
	public void setCommunity_id(String community_id) {
		this.community_id = community_id;
	}
	public String getCommunity_name() {
		return community_name;
	}
	public void setCommunity_name(String community_name) {
		this.community_name = community_name;
	}
	public String getCommunity_desc() {
		return community_desc;
	}
	public void setCommunity_desc(String community_desc) {
		this.community_desc = community_desc;
	}
	public String getCommunity_stuid() {
		return community_stuid;
	}
	public void setCommunity_stuid(String community_stuid) {
		this.community_stuid = community_stuid;
	}	
	

}
