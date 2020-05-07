package model;

public class Usuario {

	private String nombre;
	private String contrase�a;

	public Usuario(String nombre, String contrase�a) throws NombreInvalidoException, ContrasenaInvalidaException {
		this.setNombre(nombre);
		this.setContrase�a(contrase�a);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NombreInvalidoException {
		if (nombre == null || nombre.isEmpty())
			throw new NombreInvalidoException("Nombre incorrecto");
		else
			this.nombre = nombre;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) throws ContrasenaInvalidaException {
		if (contrase�a == null)
			throw new ContrasenaInvalidaException("Contrase�a incorrecta");
		else if (contrase�a.length() < 6)
			throw new ContrasenaInvalidaException("La contrase�a debe tener 6 caracteres como minimo");
		else if ((contrase�a.charAt(0) < 65 && contrase�a.charAt(0) > 122)
				|| (contrase�a.charAt(0) > 90 && contrase�a.charAt(0) < 97)) // 65 a 90 y 97 a 122
			throw new ContrasenaInvalidaException("El primer caracter debe ser una letra");
		else
			this.contrase�a = contrase�a;
	}

	@Override
	public String toString() {
		return "Usuario [Nombre = " + nombre + ", Contrase�a = " + contrase�a + "]";
	}

}
