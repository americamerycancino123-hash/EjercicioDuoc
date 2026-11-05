package cl.duoc.LlanquihueTour.model;

    //   Atributos


public class Tour {
    private String nombre;
    private String direccion;
    private int telefono;
    private String ciudad;

    //  Constructor Tour
    public Tour (String nombre, String direccion, int telefono, String ciudad){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }
    // Getter Setter

    public String getNombre(String nombre) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion(String direccion) {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public int getTelefono(int telefono) {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCiudad (String ciudad) {
        return ciudad;
    }

     public void setCiudad (String ciudad){
            this.ciudad = ciudad;
     }

    //Override
    public String toString() {
        return "Tour: " + nombre
                + " | Dirección: " + direccion
                + " | Teléfono: " + telefono
                + " | Ciudad: " + ciudad;
    }
}