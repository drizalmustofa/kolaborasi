import java.io.*;
import java.util.Scanner;
public class BangunDatar {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int s,p,l,a,t,sm;
		System.out.print ("\n\nInputkan sisi bujur sangkar: ");
		s = scn.nextInt();
		System.out.print ("Inputkan panjang persegi panjang: ");
		p = scn.nextInt();
		System.out.print ("masukan lebar persegi panjang: ");
		l = scn.nextInt();
		System.out.print ("masukan alas segitiga: ");
		a = scn.nextInt();
		System.out.print ("masukan tinggi segitiga: ");
		t = scn.nextInt();
		System.out.print ("masukan sisi miring seitiga: ");
		sm = scn.nextInt();
		System.out.println ();
		
		BujurSangkar bs = new BujurSangkar(s);
        System.out.println ("\nLuas Bujur Sangkar dengan s = "+s+" adalah " + bs.CariLuas());
		PersegiPanjang pp = new PersegiPanjang(p,l);
        System.out.println ("Luas Persegi Panjang dengan p = "+p+" dan l = "+l+" adalah "+ pp.CariLuas());
		SegiTiga st = new SegiTiga(a,t,sm);
		System.out.println ("Luas Segitiga sama kaki dengan a = "+a+", t = "+t+", dan sm = "+sm+" adalah "+st.CariLuas());
		System.out.println ();
		
		BujurSangkar b = new BujurSangkar(s);
		System.out.println ("\nKeliling Bujur Sangkar dengan s = "+s+" adalah "+b.CariKeliling());
		PersegiPanjang pj = new PersegiPanjang(p,l);
		System.out.println ("Keliling Persegi Panjang dengan p = "+p+" dan l = "+l+" adalah "+pj.CariKeliling());
		SegiTiga sg = new SegiTiga(a,t,sm);
		System.out.println ("Keliling Segitiga sama kaki dengan a = "+a+", t = "+t+", dan sm = "+sm+" adalah "+sg.CariKeliling());
		System.out.println ();
	}
}
