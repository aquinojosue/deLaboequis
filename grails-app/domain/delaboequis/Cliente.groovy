package delaboequis

class Cliente {
    String nombre_cliente
    String email
    String telefono
    String dui
    Date dateCreated

    static constraints = {
        nombre_cliente()
        email()
        dui()
        telefono()
        dateCreated()
    }
}
