package dto;

public class BuildingDTO extends BaseDTO {
	
	private Long id;
	private String name;
	private String address;
	private String district;
	private String street;
	private String ward;
	private String rentAreas;
	public String getRentAreas() {
		return rentAreas;
	}
	public void setRentAreas(String rentAreas) {
		this.rentAreas = rentAreas;
	}
	private Integer floorArea;

	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public Integer getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(Integer floorArea2) {
		this.floorArea = floorArea2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
