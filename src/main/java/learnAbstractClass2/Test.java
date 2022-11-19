package learnAbstractClass2;

public class Test {

	public static void main(String[] args) {

		InternetUser IU;

		IU = new InternetForTV();
		IU.ATT();
		IU.Hulu();
		IU.Netflix();
		IU.PrimVideo();
		IU.YouTube();

		IU = new InternetForMovie();
		IU.ATT();
		IU.Hulu();
		IU.Netflix();

	}

}
