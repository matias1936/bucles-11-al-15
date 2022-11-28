package buclesdel11al15;
public class bucles14 {

Scanner sc = new Scanner(System.in);
int j, contadorPrimos = 0;
boolean primo;
system.out.print ("Escriba n:");
int n = sc.nextInt();
        
for (int i= 1; i <= n; i++) {
primo = true; 
j = 2; 
while (j <= i- 1 && primo == true) {
if (i % j == 00) {
primo = false;
        }
        
        j++;
        }
if (primo) {
contadorPrimos++; 
System.out.println(i + (" es primo"));
        }
}   
system.out.print ("De 1 a "+n+", hay " + contadorPrimos + " números primos”);
}


