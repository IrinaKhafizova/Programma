import java.io.*; 

/* Выполнение всех приложений Java начинается с вызова метода main () (точка начала выполнения программы).
Ключевое слово p u b l i c — модификатор доступа, который позволяет управлять
видимостью членов класса. Ключевое слово static позволяет вызывать метод
main () без конкретизации экземпляра класса. Часть String args [ ] объявляет
параметр args, который представляет собой массив экземпляров класса String.*/

class zp {
//Строка IOException необходима для обработки ошибок ввода
public static void main(String args[]) throws IOException {
double krm,kod,oklad,esn,ndfl,pf,fssbezrab,fssneschsl,otraboklad,summanalogov,itogo;
BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
