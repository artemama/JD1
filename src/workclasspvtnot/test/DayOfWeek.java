package workclasspvtnot.test;



	public enum DayOfWeek {
		
		monday("��"), tuesday("��"), wednesday("��"), thursday("��"), friday("��"), saturday("��"), sunday("��");
		private DayOfWeek(String titleRu) {
			this.titleRu = titleRu;
		}

		private String titleRu;

		public String getTtitleRu() {
			return titleRu;
		}
	}