fun main() {
            var R2D2Pos: List<Int>
            R2D2Pos =moverrobot(10, 5, -2)
            println("x: ${R2D2Pos[0]} y: ${R2D2Pos[1]} dir: ${orientacion(R2D2Pos[2])}")
            R2D2Pos =moverrobot(0, 0, 0)
            println("x: ${R2D2Pos[0]} y: ${R2D2Pos[1]} dir: ${orientacion(R2D2Pos[2])}")
            R2D2Pos =moverrobot()
            println("x: ${R2D2Pos[0]} y: ${R2D2Pos[1]} dir: ${orientacion(R2D2Pos[2])}")
            R2D2Pos =moverrobot(-10, -5, 2)
            println("x: ${R2D2Pos[0]} y: ${R2D2Pos[1]} dir: ${orientacion(R2D2Pos[2])}")
            R2D2Pos =moverrobot(-10, -5, 2, 4, -8)
            println("x: ${R2D2Pos[0]} y: ${R2D2Pos[1]} dir: ${orientacion(R2D2Pos[2])}")
            do{
                    println("dame una lista con comas, numeros separados por comas")
                    var texto = readln()
            
                } while(texto != "")
        

        }
    fun orientacion(dir:Int) = when (dir){
                0-> "POSITIVEY"
                1-> "NEGATIVEX"
                2-> "NEGATIVEY"
                3-> "POSITIVEX"
                else-> ""
            }

    -    // Try adding program arguments via Run/Debug configuration.
    -    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    -    println("Program arguments: ${args.joinToString()}")
    fun moverrobot(vararg movs:Int): List<Int>{
            var posX = 0
            var posY = 0
            var dir = 0 //0 => arriba 1 => izquierda 2 => abajo 3 => derecha
            for (pasos in movs){
                    when (dir){
                            0-> posY = pasos
                            1-> posX -= pasos
                            2-> posY -= pasos
                            3-> posX = pasos
                
                        }
                    if (dir== 3) dir = 0 else dir
                }
            return listOf(posX, posY, dir)
    }