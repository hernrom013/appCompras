package programacion_avanzada.tp;

import java.time.LocalDate;
public class Producto {

    private String nombre;
    private String descripcion;
    private LocalDate fechaAlta;

    private Double precio;
    private static final Double minPrecio = 0.1;

    public Producto(String nombre) {
        this.nombre = nombre;
        this.fechaAlta = LocalDate.now();
        this.precio = minPrecio;
    }

    public Producto() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
