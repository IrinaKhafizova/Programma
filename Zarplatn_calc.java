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

System.out.println("vvedite kolichestvo rabochih dnei v mesyace");
krm=Double.parseDouble(kb.readLine());

System.out.println("vvedite kolichestvo otrabotannih dney");
kod=Double.parseDouble(kb.readLine());

System.out.println("vvedite oklad");
oklad=Double.parseDouble(kb.readLine());
esn=((oklad/krm)*kod)*0.036;
esn=Math.round(esn);

System.out.println("ESN sostavit (rub):"+esn);
ndfl=((oklad/krm)*kod)*0.13;
ndfl=Math.round(ndfl);

System.out.println("NDFL sostavit (rub):"+ndfl);
pf=((oklad/krm)*kod)*0.02;
pf=Math.round(pf);

System.out.println("PF sostavit (rub):"+pf);
  fssbezrab=((oklad/krm)*kod)*0.006;
  fssbezrab=Math.round(fssbezrab);
  
System.out.println("FSS po bezrabotitse sostavit (rub):"+fssbezrab);
fssneschsl=((oklad/krm)*kod)*0.01;
fssneschsl=Math.round(fssneschsl);

System.out.println("FSS po neschastnim sluchayam sostavit (rub):"+fssneschsl);
summanalogov=esn+ndfl+pf+fssbezrab+fssneschsl;
summanalogov=Math.round(summanalogov);

System.out.println("Itogo nalogi (rub):"+summanalogov);
  itogo=((oklad/krm)*kod)-summanalogov;
  itogo=Math.round(itogo);
  System.out.println("Itogo k vidache (rub):"+itogo);
  
}
}
