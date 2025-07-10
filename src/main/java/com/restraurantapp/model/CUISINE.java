package com.restraurantapp.model;

public enum CUISINE {
		SI("SOUTH INDIAN"),
		NI("NORTH INDIAN"),
		II(" ITALIAN"),
		CON("CONTENENTAL "),
		CH("CHINESE");

		private String cuisineType;

		private CUISINE(String cuisineType) {
			this.cuisineType = cuisineType;
		}

		public String getCuisineType() {
			return cuisineType;
		}

		
}
