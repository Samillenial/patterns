package structural.bridge

fun main (){
    val so = WindowsLite(X64())
    so.checkHadware()
    so.loadkernel()
    so.startService()
    so.login()
}