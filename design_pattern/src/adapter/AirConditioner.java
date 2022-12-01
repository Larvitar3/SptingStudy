package adapter;

public class AirConditioner  implements Electronic220v{

	//전기 꼽기

	@Override
	public void connect() {
		System.out.println("에어컨 연결  220v ON");
	}

		

}
