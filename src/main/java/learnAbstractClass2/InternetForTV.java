package learnAbstractClass2;

public class InternetForTV extends InternetUser {
	
	@Override
	void ATT() {
		System.out.println("ATT Subscription");
	}
    @Override
	void PrimVideo() {
		System.out.println("Prime for TV");
	}

	@Override
	void Hulu() {
		System.out.println("Hulu for TV");	
	}

}

