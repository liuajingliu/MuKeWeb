package community.pojo;

public class Answer {
		private String community_id;
		private String answer_stuid;
		private String answer_desc;
		@Override
		public String toString() {
			return "Answer [community_id=" + community_id + ", answer_stuid="
					+ answer_stuid + ", answer_desc=" + answer_desc + "]";
		}
		public Answer() {
			super();
		}
		public Answer(String community_id, String answer_stuid,
				String answer_desc) {
			super();
			this.community_id = community_id;
			this.answer_stuid = answer_stuid;
			this.answer_desc = answer_desc;
		}
		public String getCommunity_id() {
			return community_id;
		}
		public void setCommunity_id(String community_id) {
			this.community_id = community_id;
		}
		public String getAnswer_stuid() {
			return answer_stuid;
		}
		public void setAnswer_stuid(String answer_stuid) {
			this.answer_stuid = answer_stuid;
		}
		public String getAnswer_desc() {
			return answer_desc;
		}
		public void setAnswer_desc(String answer_desc) {
			this.answer_desc = answer_desc;
		}
}
