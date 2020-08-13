import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    print("Masukan Nilai : ")
    val nilai : Int = reader.nextInt()
    val result = if (nilai > 90){
        'A'
    } else if (nilai >= 80){
        'B'
    } else if (nilai >= 70){
        'C'
    } else if (nilai >= 60){
        'D'
    } else{
        'E'
    }
    print("Nilai mu $nilai Akreditasinya adalah $result")
}