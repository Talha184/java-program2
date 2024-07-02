import java.util.Scanner;
public class program
{
    public static void main(String [] args)
    {
        Scanner src=new Scanner(System.in);
        System.out.println("Marks in percentage of class 9th");
        //next      1
        System.out.print("Enter the Marks of English:");
        float english=src.nextFloat();
        float marks1=english*100/75;
        System.out.println("Your percentage in English is:"+marks1);
        //next      2
        System.out.print("Enter the marks of Mathematics:");
        float math=src.nextFloat();
        float marks2=math*100/75;
        System.out.println("Your percentage in Mathematics is:"+marks2);
        //next      3
        System.out.print("Enter the marks of Urdu:");
        float urdu=src.nextFloat();
        float marks3=urdu*100/75;
        System.out.println("Your percentage in Urdu is:"+marks3);
        //next      4
        System.out.print("Enter the marks of Chemistry:");
        float chemistry=src.nextFloat();
        float marks4=chemistry*100/60;
        System.out.println("Your percentage in Chemistry is:"+marks4);
        //next       5
        System.out.print("Enter the marks of Physics:");
        float physics=src.nextFloat();
        float marks5=physics*100/60;
        System.out.println("Your percentage in Physics is:"+marks5);
        //next       6
        System.out.print("Enter the marks of Computer:");
        float computer=src.nextFloat();
        float marks6=computer*100/50;
        System.out.println("Your percentage in computer is:"+marks6);
        //next        7
        System.out.print("Enter the marks of Islamiat:");
        float islamiat=src.nextFloat();
        float marks7=islamiat*100/50;
        System.out.println("Your percentage in Islamiatis:"+marks7);
        //next        8
        System.out.print("Enter the marks of Pakiatan studies:");
        float sst=src.nextFloat();
        float marks8=sst*100/50;
        System.out.println("Your percentage in Pakiatan studies is:"+marks8);
        //next        9
        System.out.print("Enter the marks of Tarjuma-Tul-Quran:");
        float book=src.nextFloat();
        float marks9=book*100/50;
        System.out.println("Your percentage in Tarjuma-Tul-Quran is:"+marks9);
                                        //  End.
    }
}