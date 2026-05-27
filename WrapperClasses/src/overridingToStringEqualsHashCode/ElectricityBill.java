package overridingToStringEqualsHashCode;

public class ElectricityBill {

	private int meterNo;
	private String Name;
	private String Address;
	
	public int getMeterNo() {
		return meterNo;
	}
	public void setMeterNo(int meterNo) {
		this.meterNo = meterNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	@Override
	public String toString() {
		return meterNo+Name+Address;
	}
	
	@Override
	public boolean equals(Object o) {
		ElectricityBill e =(ElectricityBill) o;
		if (e.getMeterNo()==this.meterNo)return true;
		else return false;
	}

	public static void main(String[] args) {
		ElectricityBill e = new ElectricityBill();
		e.setMeterNo(10);
		e.setName("AAA");
		e.setAddress("XXXX");
		System.out.println(e.toString());
		System.out.println(e.equals(e));
		
		ElectricityBill e1 = new ElectricityBill();
		e1.setMeterNo(12);
		e1.setName("AAA");
		e1.setAddress("XXXX");
		System.out.println(e.equals(e1));
	}
	

}
