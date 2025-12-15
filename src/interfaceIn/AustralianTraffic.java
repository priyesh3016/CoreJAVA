package interfaceIn;

public class AustralianTraffic implements centralTrafic {
	public static void main(String[] args) {

	
	
	centralTrafic a = new AustralianTraffic();
	a.greenGo();
	a.redGo();
	a.yellowFlash();
	}
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo implementation");
	}

	@Override
	public void redGo() {
		// TODO Auto-generated method stub
		System.out.println("redGo implementation");
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("yellowFlash implementation");
	}

	}

