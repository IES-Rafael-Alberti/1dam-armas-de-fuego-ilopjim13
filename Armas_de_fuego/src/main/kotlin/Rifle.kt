class Rifle(
    municion: Int,
    tipoDeMunicion: String,
    override val danio: Int,
    override val radio: TipoRadio,
    nombre: String = "Rifle"): ArmaDeFuego(nombre,municion, tipoDeMunicion) {

    override val municionARestar: Int = 1
    init {
        require(this.danio in 5..10) {"El daño debe ser entre 5 y 10"}
        require(this.radio == TipoRadio.Intermedio || this.radio == TipoRadio.Corto) {"El radio debe ser intermedio o corto"}
    }
}