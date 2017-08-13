val file = io.Source.fromFile("/home/vinicius/Documentos/desenv/workspaces/sandbox/ScalaLessons/src/main/resources/example.csv")
val lines = file.getLines();

case class ExampleClass(policyId: String, stateCode: String, county:String)

def organizeLine(line : String ): ExampleClass={
   val itemsArr =  line.split(",");
   return ExampleClass(itemsArr(0),itemsArr(1),itemsArr(2))
}
//header
println(lines.next())
val arrLines = lines.map(i=>organizeLine(i)).toArray
arrLines.map(println)
//closing the file
file.close()


