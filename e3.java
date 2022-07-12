import java.util.Random;

class e3{

public static void main(String[] args) {
int h = 0;
System.out.print("Tossing a coin...");
Random r = new Random();

for(int i = 0;i < 3;i++){
int a[i] = r.nextInt(2);
if(a[i] == 0){
System.out.print("Round i+1: Heads");
h++;
}
else System.out.print("Round i+1: Tails");
}

System.out.print(Heads: h, Tails: 3-h);
}
}
}
