public class MediosTransporte {
	
	public static void main(String[] args) {

		Tren t = new Tren("grande",100, 10);
		System.out.println(t);
		t.transportaPersonas(400);
		t.generarSonido();

	}


}