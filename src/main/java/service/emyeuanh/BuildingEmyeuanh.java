package service.emyeuanh;

public class BuildingEmyeuanh {

	private Long id;
	private String name;
	private String address;
	private Integer floorArea;
	private String ward;
	private String street;
	private String dicstrict;

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
	public Integer getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(Integer floorArea) {
		this.floorArea = floorArea;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDicstrict() {
		return dicstrict;
	}
	public void setDicstrict(String dicstrict) {
		this.dicstrict = dicstrict;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
