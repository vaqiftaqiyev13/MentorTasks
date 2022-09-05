import java.lang.Integer.sum
import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    /** Task 1 */

   /* var cem = 0
    for(i in 1 until 101){
        cem+=i
    }
    println("Cem: $cem")*/

    /** Task 2 */
   /* var cem = 0
    for(i in 1 until 101){
        if (i % 3 == 0 && i % 5 == 0){
            cem+=i
        }
    }
    println("Cem: $cem")*/

    /** Task 3 */
   /*var max = 0

    val numbers = listOf<Int>(5,34,35,55)

    for (i in numbers){
        if (max < i){
            max = i

        }
    }
    print("Max value: $max")*/


   /** Task 4 */
    /*var cem = 0
    val listNum = listOf<Int>(5,100,25,45,87)

    for (i in listNum){
        cem += i
    }
    println("Cem: $cem")*/

   /** Task 5 */
   /*val star = listOf<String>("*","**","***","****")
    for (i in star){
        println(i)
    }*/

    /** Task 6 */
    /*val message = " Men Kotlin yaxsi bilirem ona gore menim ucun Kotlin dilinde laxihe yazmag problem deyil . "
     println(message.replace("Kotlin","java").replace("yaxsi","normal"))*/

    /** Task 8 */
  /*  val bettaList = listOf<Int>(5,34,56,14,17)
    val alphaList = listOf<Int>(3,45,0,9,12)

    var min = Int.MAX_VALUE
    var max = 0

    for(i in bettaList){
        if (max < i){
            max = i
        }
    }
    println("Max value in bettaList is $max")

    for (i in alphaList){
        if (min > i){
            min = i
        }
    }
    println("Min value in alphalist is $min")*/


    /** Task 9 */
   /*println(sum(5,10))

    fun sum(x: Int,y: Int):Int {
         return x+ y
    }*/

   /** Task 10 */
   //trueCounter()
    /** Task 11 */
   //wordsCounter()
    /** Task 12 */
    //kvadratTenlikHesabla(5.0,2.0,-10.0)

 }

/** Task 10 */
fun trueCounter(){
 val scanner = Scanner(System.`in`)
 print("Enter a number of range: ")
 val n = scanner.nextInt()
 var booleanList = arrayListOf<Boolean>()

 for (i in 0 until n){
  print("\n${i + 1}) Enter a boolean: ")
  val bool = scanner.nextBoolean()

  booleanList.add(i,bool)


 }

 var boolList = booleanList.filter { b: Boolean -> b }
  println("True: sayi: ${boolList.size}")
}

/**Task 11 */


fun wordsCounter(){
    var wordsCount = 0
    val scan = Scanner(System.`in`)
    print("Enter a phrase: ")
    val str = scan.nextLine().trim().split(" ").toList()
    for(i in str){
        wordsCount += 1
    }
    print("wordsCount: $wordsCount")

}

/** Task 12 */
fun kvadratTenlikHesabla(a : Double,b: Double,c:Double){
    println("Misal: $a * x^2 + $b * x + $c ")
    val d = sqrt((b).pow(2) - 4 * (a * c))
    println("Discriminat: $d")

    val x1 = (-(b) + d) / (2 * (a))

    val x2 = (-(b) - d) / (2 * (a))

    println("X1: $x1 ,X2: $x2")




}

