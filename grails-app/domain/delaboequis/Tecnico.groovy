package delaboequis

class Tecnico {
    String nombre_tecnico
    String codigo_empleado
    static constraints = {
        nombre_tecnico()
        codigo_empleado()
    }
}
