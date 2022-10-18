import java.time.LocalDate;

import java.util.Objects;

public class Employee {

  /*  Java'da "Employee" adında fabrika çalışanlarını temsil eden ve metotları ile
    çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız.
    Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.
    Sizden konsol çıktısı halinde Adı, maaşı, çalışma saati, başlangıç yılı, vergi, bonus,
    maaş artışı, vergi ve bonuslarla birlikte maaş, toplam maaş değerlerini konsola yazdırmanızı bekliyoruz.

    Sınıfın Nitelikleri
    name : Çalışanın adı ve soyadı
    salary : Çalışanın maaşı
    workHours : Haftalık çalışma saati
    hireYear : İşe başlangıç yılı

    Sınıfın Metotları
    Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.

    tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.

    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan
    çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.

    raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.

    toString() : Çalışana ait bilgileri ekrana bastıracaktır.
            Not: raiseSalary() hesaplarken vergi ve bonusları dikkate almalısınız. */

      static String name = "Ahmet";
      static double salary = 1100;
      static int workHours = 45;
      static int hireYear = 2013;
      public static void main(String[] args) {
         toString1();
         System.out.println("odeyecegi vergi = " + tax());
         System.out.println("kazandıgı bonus = " + bonus());
         System.out.println("maas artısı = " + raiseSalary());
      }
      public static double tax() {
         double tax = 0;
         if (salary < 1000) {
            return tax;
         } else if (salary > 1000) {
            tax = (salary * 3) / 100;
         }
         return tax;
      }
      public static double bonus() {
         double bonus = 0;
         if (workHours > 40) {
            return ((workHours - 40) * 30)*4;
         } else {
         }
         return bonus;
      }
      public static double raiseSalary(){
         double raiseSalary;
         int currentYear= LocalDate.now().getYear();
         if(currentYear-hireYear<10){
            raiseSalary=(salary*5)/100;
            return raiseSalary;
         }
         else if(currentYear-hireYear>9&& currentYear-hireYear<20){
            raiseSalary=(salary*10)/100;
            return raiseSalary;
         }
         else if(currentYear-hireYear>19){
            raiseSalary=(salary*15)/100;
            return raiseSalary;
         }
         return raiseSalary();
      }

      public static void toString1(){
         double toplam_maas=salary+bonus()+raiseSalary();
         double vergili_toplam_maas=toplam_maas+tax();

         System.out.println("calisanin ismi:"+name);
         System.out.println("calisanin maasi:"+salary);
         System.out.println("haftalık calısma saati:"+workHours);
         System.out.println("ise basladıgı yıl:"+hireYear);
         System.out.println("toplam maas:" + toplam_maas);
         System.out.println("vergili_toplam_maas:"+ vergili_toplam_maas);

      }

   }









