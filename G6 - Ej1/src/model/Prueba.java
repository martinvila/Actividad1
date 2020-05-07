package model;

public class Prueba {

	public static void main(String[] args) {

		Usuario nuevo = null;
		try {
			nuevo = new Usuario("Martin", "123456");
		} catch (NombreInvalidoException e) {
			e.printStackTrace();
		} catch (ContrasenaInvalidaException e) {
			e.printStackTrace();
		} finally {
			if (nuevo != null)
				System.out.println(nuevo);
		}

	}

}
