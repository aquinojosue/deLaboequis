package delaboequis

class OrdenDeTrabajo {
    Tecnico tecnico
    Cliente cliente
    String orden_descripcion
    Date fecha_de_servicio
    int tiempo_de_reparacion
    BigDecimal presupuesto
    BigDecimal costo_total
    static constraints = {
        tecnico()
        cliente()
        orden_descripcion()
        fecha_de_servicio()
        tiempo_de_reparacion()
        presupuesto()
        costo_total()
    }
}
