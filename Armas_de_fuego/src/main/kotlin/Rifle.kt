/**
 * Clase hija de ArmaDeFuego.
 * @param nombre :String nombre del tipo de arma
 * @param municion :Int cantidad de municion del arma
 * @param tipoDeMunicion :String tipo de municion que utiliza el arma
 * @param danio :Int Daño del arma
 * @param radio :TipoRadio indica el radio del arma
 * @param municionARestar :Int municion que gasta el arma cada vez que dispara
 */
class Rifle(
    municion: Int,
    tipoDeMunicion: String,
    override val danio: Int,
    override val radio: TipoRadio,
    nombre: String = "Rifle"): ArmaDeFuego(nombre,municion, tipoDeMunicion) {

    override val municionARestar: Int = 1
    init {
        require(this.danio in 5..10) {"El daño debe ser entre 5 y 10"}
        require(this.radio == TipoRadio.INTERMEDIO || this.radio == TipoRadio.CORTO) {"El radio debe ser intermedio o corto"}
    }
}