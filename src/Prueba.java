public class Prueba {

	public static void main(String[] args) {
		Fecha miFecha = Fecha.crear((byte) 31, (byte) 11, (short) 2025);
		System.out.println("Día: " + miFecha.getDia());
		System.out.println("Mes: " + miFecha.getMes());
		System.out.println("Año: " + miFecha.getAnio());
	}

}
