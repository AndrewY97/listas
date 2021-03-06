import scala.io.StdIn.{readInt, readLine}
import scala.collection.mutable.ListBuffer
import java.util.stream.Collectors
import scala.collection.mutable.ListBuffer
object ProgListas {
  def main(args: Array[String]): Unit = {
    val lista= new ListBuffer[String]()
    repetido(lista)

  }
  def repetido(x:ListBuffer[String]):Unit={
    println("Programa 1 Busca Palabras")
    var xx = x
    println("Cuantas palabras vas a agregar:")
    val c= readInt()
    for(i<-1 to c){
      println("Dame una palabra:")
      val pal = readLine()
      x += pal
    }
    for (name <- xx) print(name+" ")
    println("")
    println("Dame palabra a buscar:")
    var pala=readLine()
    var count=0
    for(i<-xx){
      if (i == pala){
        count+=1
      }
    }
    println("La palabra "+pala+" aparecio: "+ count+" veces")
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    sustituir(xx)
  }
  def sustituir(x:ListBuffer[String]):Unit={
    println("Programa 2 Sustituir")
    println("Dame la palabra 1:")
    val p1= readLine()
    println("Dame la palabra 2:")
    val p2=readLine()
    for(i<- 0 to x.length-1){
      if (x(i)==p1){
        x.update(i,p2)
      }
    }
    for (name <- x) print(name+" ")
    println("")
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    borrar(x)
  }
  def borrar(x:ListBuffer[String]):Unit={
    val lista2= new ListBuffer[String]()
    println("Programa 3 Borrar")
    println("Dame la palabra a borrar:")
    var c=0
    val p= readLine()
    for(i<- 0 to x.length-1){
      if (x(i)==p){
        c=i
      }
    }
    x.remove(c)
    for (name <- x) print(name+" ")
    println("")
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    eliminarlista(x,lista2)
  }
  def eliminarlista(x:ListBuffer[String],y:ListBuffer[String]):Unit={
    println("Programa 4 Borrar en base a lista")
    for(i<- 1 to x.length){
      println("Dame una palabra:")
      val pal = readLine()
      y += pal
    }
    var cc=0
    for(i<- y){
      for (j<- 0 to x.length-1){
        if (x(j)==i){
          cc = j
        }
      }
    }
    x.remove(cc)
    for (name <- x) print(name+" ")
    println("")
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    cinco(x,y)
  }
  def cinco(x:ListBuffer[String],y:ListBuffer[String]):Unit={
    println("Programa 5")
    val l1= new ListBuffer[String]()
    val l2= new ListBuffer[String]()
    val l3= new ListBuffer[String]()
    var sin = x.distinct
    var sin2 =y.distinct
    println(sin)
    println(sin2)
    for(i<-sin){
      for(j<-0 to sin2.length-1){
        if(i==sin2(j)){
          //println("En ambas listas: "+i)
          l1 += i

        }
        if(i!=sin2(j)){
          l2 += i
        }
        if(i !=sin2(j)){
          l2+=sin2(j)
        }
      }
    }
    println("En ambas listas: ")
    for (i<-l1){
      print(i+" ")
    }
    println("")
    println("Solo en la primer lista: ")
    for (i<-l2.distinct){
      print(i+" ")
    }
    println("")
    println("solo en la segunda lista:")
    for (i<-l3.distinct){
      print(i+" ")
    }
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    suma()
  }
  def suma():Unit={
    println("Programa 6 Suma acumulada")
    val listaN= List(11,85,98,17,65,24,32)
    println(listaN)
    var xx=0
    println("Suma acumulada:")
    for(i<- listaN){
      xx+=i
      print(xx+",")
    }
    println("")
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    Palindromas()
  }
  def Palindromas():Unit={
    val l1= new ListBuffer[String]()
    println("Programa 6 Palindromas")
    println("Cuantas palabras vas a agregar:")
    val c= readInt()
    for(i<-1 to c){
      println("Dame una palabra:")
      val pal = readLine()
      l1 += pal
    }
    for (name <- l1) print(name+" ")
    println("")
    print("Palindromos:")
    for (i<-l1){
      if(i.reverse == i){
        print(i.reverse+" ")
      }
    }
    println("")
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    capicuas()
  }
  def capicuas():Unit={
    val l1= new ListBuffer[Int]()
    println("Programa 7 capicuas")
    println("Cuantos numeros vas a agregar:")
    val c= readInt()
    for(i<-1 to c){
      println("Dame un numero:")
      val pal = readInt()
      l1 += pal
    }
    for (name <- l1) print(name+" ")
    println("")
    print("Numeros capicuas:")
    for (i<-l1){
      if(i.toString.reverse == i.toString){
        print(i.toString.reverse+" ")
      }
    }
    println("")
    println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX")
    nueve(l1)
  }
  def nueve(x:ListBuffer[Int]):Unit={
    println("Programa 9 Operaciones con listas")
    var xx=0
    for(i<- x){
      xx+=i
    }
    println("Promedio: "+xx/x.length)
    for(i<-x){
      var iFactorial = 1
      var x = 2
      while ( {
        x <= i
      }) {
        iFactorial = iFactorial * x
        x += 1
      }
      println("Factorial de "+ i +": " + iFactorial)
    }
    for(i<-x){
      var contador = 0

      var I = 1
      while ( {I <= i}) {
        if ((i % I) == 0) contador += 1
        I += 1
      }
      if(contador==2){
        println("Numeros primos: "+ i)
      }
    }
  }


}
