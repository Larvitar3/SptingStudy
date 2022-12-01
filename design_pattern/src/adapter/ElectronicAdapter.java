package adapter;

//110v녀석을 220v 콘센트에 연결 가능하도록 설계
public class ElectronicAdapter implements Electronic220v {

	Electronic110v electronic110v;
	
	public ElectronicAdapter(Electronic110v electronic110v) {
		this.electronic110v = electronic110v;
	}
	
	@Override
	public void connect() {
		electronic110v.connect();
		
	}

	
}
