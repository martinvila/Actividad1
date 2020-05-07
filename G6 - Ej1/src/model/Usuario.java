package model;

public class Usuario {

	private String nombre;
	private String contraseña;

	public Usuario(String nombre, String contraseña) throws NombreInvalidoException, ContrasenaInvalidaException {
		this.setNombre(nombre);
		this.setContraseña(contraseña);
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) throws ContrasenaInvalidaException {
		if (contraseña == null)
			throw new ContrasenaInvalidaException("Contraseña incorrecta");
		else if (contraseña.length() < 6)
			throw new ContrasenaInvalidaException("La contraseña debe tener 6 caracteres como minimo");
		else if ((contraseña.charAt(0) < 65 && contraseña.charAt(0) > 122)
				|| (contraseña.charAt(0) > 90 && contraseña.charAt(0) < 97)) // 65 a 90 y 97 a 122
			throw new ContrasenaInvalidaException("El primer caracter debe ser una letra");
		else
			this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Usuario [Nombre = " + nombre + ", Contraseña = " + contraseña + "]";
	}

}
