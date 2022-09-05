package src

fun operator(age: Int) {
    if(age < 18){
        println("Criança!!!")
    }else if(age in 18..60){
        println("Adulto!!!")
    }else {
        println("Idoso")
    }
}

fun operatorElvis(age: Int?){
    val ageFormat = age ?: "Não definido";
    println(ageFormat)
}

fun operatorWhen(a: Int, b: Int, op: String): Int {
    return when(op){
        "soma" -> a + b;
        "sub" -> a - b;
        else -> 0;
    }
}


fun main () {
    operator(20)
    operatorElvis(20);
    operatorElvis(null);
    println(operatorWhen(1,2,"soma"))
    println(operatorWhen(1,2,"sub"))
    println(operatorWhen(1,2,"any"))
}