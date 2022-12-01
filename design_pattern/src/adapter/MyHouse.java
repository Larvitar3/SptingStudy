package adapter;

public class MyHouse {

	public static void main(String[] args) {
		// 에어컨
		// 드라이기

		AirConditioner airConditioner = new AirConditioner();
		HairDryer hairDryer = new HairDryer();
		
		Cleaner cleaner = new Cleaner();

		// 전기연결
		connect(airConditioner);
		connect(hairDryer);
		
		// 어뎁터 사와야 한다.
		ElectronicAdapter adapter = new ElectronicAdapter(cleaner);
		connect(adapter);
	}

	// 전기 콘센트
	public static void connect(Electronic220v electronic220v) {
		electronic220v.connect();
		
	}
}
