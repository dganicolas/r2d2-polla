class Robot(val nombre:String){
        var posx: Int = 0
        var posy:Int =0
        var dir:Int = 0
        fun mover(movs:IntArray){
                var posX = 0
                var posY = 0
                var dir = 0 //0 => arriba 1 => izquierda 2 => abajo 3 => derecha
                for (pasos in movs){
                        when (this.dir){
                                0-> this.posy = pasos
                                1-> this.posx -= pasos
                                2-> this.posy -= pasos
                                3-> this.posx = pasos
                
                            }
                        if (this.dir== 3) this.dir = 0 else this.dir
                    }
        
            }
        fun mostrarPosicion(){
                println("${this.nombre} esta en (${this.posx} ${this.posx}) ${obtenerDireccion()}")
        
            }
        fun obtenerDireccion() =
                when (this.dir) {
                        0 -> "POSITIVEY"
                        1 -> "NEGATIVEX"
                        2 -> "NEGATIVEY"
                        3 -> "POSITIVEX"
                        else -> ""
                    }
    }

fun main(){
        val r2d2 = Robot("r2d2")
        val movimientos = arrayOf(
                intArrayOf(10,2,-2),
        
            )
        for (movimientos in movimientos){
                r2d2.mover(movimientos)
                r2d2.mostrarPosicion()
            }}