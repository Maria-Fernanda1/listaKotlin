class calcuculadora 
	fun somar(a: Int,b:Int):Int {
        return a + b
    }
    
    fun subtrair(a:Int,b:Int):Int {
        return a - b
    }
    
    fun multiplicar(a:Int, b:Int):Int {
        return a * b
    }
    
    fun dividir(a:Int, b:Int):Int {
        if (b == 0){
            throw
    ArithmeticException("Não é possível dividir por zero")  
        }
        return a/b 
    }
}
