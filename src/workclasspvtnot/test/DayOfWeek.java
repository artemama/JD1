package workclasspvtnot.test;



	public enum DayOfWeek {
		
		monday("Пн"), tuesday("Вт"), wednesday("Ср"), thursday("Чт"), friday("Пт"), saturday("Сб"), sunday("Вс");
		private DayOfWeek(String titleRu) {
			this.titleRu = titleRu;
		}

		private String titleRu;

		public String getTtitleRu() {
			return titleRu;
		}
	}