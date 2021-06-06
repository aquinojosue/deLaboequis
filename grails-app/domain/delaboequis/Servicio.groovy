package delaboequis

class Servicio {
    String nombre
    String servicio_descripcion
    static constraints = {
        nombre()
        servicio_descripcion()
    }
}
