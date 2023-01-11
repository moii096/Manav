package Manav;

import java.util.Scanner;

public class Manav {
	public static void main(String[] args) {
		double armut =2.14 , elma =3.67 , domates =1.11 , muz = 0.95 , patlican = 5.00 ;
		 int kgarmut , kgelma ,kgdomates ,kgmuz , kgpatlican ;
		 double farmut , felma , fmuz, fdomates, fpatlican ;
		 double toplam ;
		
		 Scanner scan=new Scanner (System.in);
		 
		 System.out.print("elma miktarini giriniz  :");
		 kgelma=scan.nextInt();
		 felma=kgelma*elma ;
		 
		 System.out.print("armut miktarini giriniz  : ");
		 kgarmut=scan.nextInt();
		 farmut= armut*kgarmut;
		 
		 System.out.print("domates miktarini giriniz  :");
		 kgdomates=scan.nextInt();
		 fdomates=kgdomates* domates ;
		 
		 System.out.print("muz miktarini giriniz  :");
		 kgmuz=scan.nextInt();
		 fmuz=kgmuz * muz ;
		
		 System.out.print("patlican miktarini giriniz  :");
		 kgpatlican= scan.nextInt();
		 fpatlican =kgpatlican*patlican ;
		 
		 toplam =farmut + felma + fmuz + fdomates + fpatlican ;
		 System.out.println("Toplam fiyat : " + toplam);
		
	}
}
