class Pistola(
    municion: Int,
    tipoDeMunicion: String,
    override val danio: Int,
    override val radio: TipoRadio,
    nombre: String = "Pistola"): ArmaDeFuego(nombre,municion, tipoDeMunicion) {

    override val municionARestar: Int = 1
    init {
        require(this.danio in 1..5) {"El daño debe ser entre 1 y 5"}
        require(this.radio == TipoRadio.Reducido || this.radio == TipoRadio.Corto) {"El radio debe ser reducido o corto"}
    }
}