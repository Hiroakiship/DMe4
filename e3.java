import java.util.Random;

public class e3{

public static void main(String[] args) {
int h = 0;
System.out.println("Tossing a coin...");
Random r = new Random();
int a[] = new int[3];

for(int i = 0;i < 3;i++){
a[i] = r.nextInt(2);
if(a[i] == 0){
    System.out.printf("Round %d: Heads\n",i+1);
h++;
}
else System.out.printf("Round %d: Tails\n",i+1);
}

System.out.printf("Heads: %d, Tails: %d\n",h ,3-h);
if(h > 3-h)System.out.println(""+ str +" won");
else System.out.println(""+ str +" lost");
}
}
