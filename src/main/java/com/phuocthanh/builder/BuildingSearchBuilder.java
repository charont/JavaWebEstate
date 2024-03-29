package com.phuocthanh.builder;

public class BuildingSearchBuilder {
	private String name;
	private String district;
	private String numberOfBasement;
	private String floorArea;
	private String rentAreaFrom;
	private String rentAreaTo;
	private String[] types=new String[] {};
	private String rentCostFrom;
	private String rentCostTo;
	private Long staffId;
	private BuildingSearchBuilder(Builder builder) {
		this.name=builder.name;
		this.district=builder.district;
		this.floorArea=builder.floorArea;
		this.numberOfBasement=builder.numberOfBasement;
		this.rentAreaFrom=builder.rentAreaFrom;
		this.rentAreaTo=builder.rentAreaTo;
		this.types=builder.types;
		this.rentCostFrom=builder.rentCostFrom;
		this.rentCostTo=builder.rentCostTo;
		this.staffId=builder.staffId;
	}
	public String getRentAreaFrom() {
		return rentAreaFrom;
	}
	public String getRentAreaTo() {
		return rentAreaTo;
	}
	public String getName() {
		return name;
	}
	public String getDistrict() {
		return district;
	}

	public String getNumberOfBasement() {
		return numberOfBasement;
	}
	
	public String getFloorArea() {
		return floorArea;
	}
	
	 public String[] getTypes() {
		return types;
	}

	public String getRentCostFrom() {
		return rentCostFrom;
	}
	public String getRentCostTo() {
		return rentCostTo;
	}

	public Long getStaffId() {
		return staffId;
	}

	public static class Builder{
		 	private String name;
			private String district;
			private String numberOfBasement;
			private String floorArea;
			private String rentAreaFrom;
			private String rentAreaTo;
			private String[] types=new String[] {};
			private String rentCostFrom;
			private String rentCostTo;
			private Long staffId;
			public Builder setName(String name) {
				this.name = name;
				return this;
			}
			public Builder setDistrict(String district) {
				this.district = district;
				return this;
			}
			public Builder setNumberOfBasement(String numberOfBasement) {
				this.numberOfBasement = numberOfBasement;
				return this;
			}
			public Builder setFloorArea(String floorArea) {
				this.floorArea = floorArea;
				return this;
			}
			public Builder setRentAreaFrom(String rentAreaFrom) {
				this.rentAreaFrom = rentAreaFrom;
				return this;
			}
			public Builder setRentAreaTo(String rentAreaTo) {
				this.rentAreaTo = rentAreaTo;
				return this;
			}
			public BuildingSearchBuilder build() {
				
				return new BuildingSearchBuilder(this);
			}
			public Builder setTypes(String[] types) {
				this.types = types;
				return this;
			}
			public Builder setRentCostFrom(String rentCostFrom) {
				this.rentCostFrom = rentCostFrom;
				return this;
			}
			public Builder setRentCostTo(String rentCostTo) {
				this.rentCostTo = rentCostTo;
				return this;
			}
			public Builder setStaffId(Long staffId) {
				this.staffId = staffId;
				return this;
			}
			
			
			
	 }
}
