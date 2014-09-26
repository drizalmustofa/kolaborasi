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
abstract class BangunDatar1
{
	abstract double CariLuas();
	abstract double CariKeliling();
}
class PersegiPanjang extends BangunDatar
{
	private int lebar = 1;
	private int panjang = 1;

    PersegiPanjang(int p, int l)
	{
		panjang = p;
		lebar = l;
	}
	double CariLuas()
	{
		return panjang*lebar;
    }
    double CariKeliling()
	{
		return (2*panjang)+(2*lebar);
    }
}
class BujurSangkar extends BangunDatar
{
	private int sisi = 1;
	BujurSangkar (int s) 
	{
		sisi = s;
	}
	double CariLuas()
	{
        return sisi*sisi;
    }

    double CariKeliling() 
	{
        return 4*sisi;
    }
}
class SegiTiga extends BangunDatar
{
	private int alas = 1;
	private int tinggi = 1;
	private int sisi = 1;
	SegiTiga (int a,int t,int s)
	{
		alas = a;
		tinggi = t;
		sisi = s;
	}
	double CariLuas()
	{
		return 0.5*alas*tinggi;
    }
    double CariKeliling()
	{
		return alas+(2*sisi);
    }
}