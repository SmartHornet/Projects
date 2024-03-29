import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {

    //Runtime.getRuntime().exec("run.bat");
    //Runtime.getRuntime().exec("cmd /c run.bat");

    //val p = ProcessBuilder()
    //p.command("notepad.exe")

    //p.command("D:\\Projects\\KotlinProjects\\YandexCoderun\\src\\main\\kotlin\\wallet.exe dump-unencrypted-data")

    //p.start()

    /*val process =
        ProcessBuilder("D:\\Projects\\KotlinProjects\\YandexCoderun\\src\\main\\kotlin\\wallet.exe","dump-unencrypted-data")
*/

    val processBuilder =
        ProcessBuilder("cmd.exe")
    /*.redirectOutput(ProcessBuilder.Redirect.INHERIT)
    .redirectError(ProcessBuilder.Redirect.INHERIT)
    .redirectInput(ProcessBuilder.Redirect.INHERIT)
    .start()
    .waitFor()*/



    val process = processBuilder.start()
    //process.waitFor()
    val obuff = OutputStreamWriter(process.outputStream)
    obuff.write("ping 8.8.8.8")
    obuff.write("\\r\\n")
    obuff.flush()

    val ibuff = BufferedReader(InputStreamReader(process.inputStream))
    var str: String;

    do{
        str = ibuff.readLine()
        println(str)
    }
    while(!str.isEmpty())







    println("Program arguments: ${args.joinToString()}")
}