import java.text.DecimalFormat

fun main() {

    val ages = intArrayOf(0,4,2,7,5,11,18)

    println("Minimum value: ${ages.minOrNull()}")
    println("Maximum value: ${ages.maxOrNull()}")
    println("Average: ${DecimalFormat("#.##").format(ages.average())}")
    println(ages.count { it in 7..12 })


    /*
    val names = Array(3){""}

    names[0]="Maria"
    names[1]="Bruno"
    names[2]="Fátima"

    names.sort()

    names.forEach { println(it) }
     */

    /*
    val values = intArrayOf(2,5,1,9,0)
    values.forEach { println(it) }
    */

    /*
    val values = IntArray(5)

    values[0]=5
    values[1]=7
    values[2]=2
    values[3]=0
    values[4]=5

    for(value in values){
        println(value)
    }

    println("----------------")

    values.sort()
    values.forEach { println(it) }
     */


}