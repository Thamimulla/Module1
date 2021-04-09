package D5;

public class CarApp {
	public static void main(String[] args) {
		
		CarClassDemo Audi = new CarClassDemo();
		CarClassDemo bmw = new CarClassDemo();
		CarClassDemo tata = new CarClassDemo();
		CarClassDemo hyundai = new CarClassDemo();
		CarClassDemo dodge = new CarClassDemo();
		
		
		Audi.setCarName("Audi R8");
		Audi.setChasisNumber(123456);
		Audi.setMileage(10.5f);
		Audi.setModelNumber(2021);
		Audi.setModeofTrans("Auto Transmission");
		Audi.setPrice(45_00_000);
		Audi.setSalesman("Thamim");
		
		Audi.changePrice();
		System.out.println(Audi.getPrice());
		System.out.println(Audi.getPrice()+"\n"+
		Audi.getCarName()+"\n"+
		Audi.getModeofTrans());


}
}