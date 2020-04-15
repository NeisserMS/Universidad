package Empleado_BD;

public class Direccion {

    private String calle;
    private String ciudad;
    private String departamento;
    private String codigoPostal;

    public Direccion(String calle, String ciudad, String departamento, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "\nCalle:" + calle + "\nCiudad:" + ciudad + "\nDepartamento:" + departamento + "\nCodigo Postal:" + codigoPostal;
    }

}
