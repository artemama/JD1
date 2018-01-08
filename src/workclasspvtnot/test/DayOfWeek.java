package workclasspvtnot.test;



	public enum DayOfWeek {
		
		monday("ом"), tuesday("бр"), wednesday("яп"), thursday("вр"), friday("ор"), saturday("яа"), sunday("бя");
		private DayOfWeek(String titleRu) {
			this.titleRu = titleRu;
		}

		private String titleRu;

		public String getTtitleRu() {
			return titleRu;
		}
	}