
package buclesdel11al15;


public class ejerciciobucles12 {
    Scanner sc= new Scanner(System.in);
    boolean desaprobados = false;
    
    for (int i=0 < 5; i++){
    int notas = sc.nextInt();
    
    if (notas <5) {
        desaprobados = true;
        
    }
}
    if (desaprobados){
    System.out.println("Hay alumnos desaprobados");
}else{
    System.out.println("No hay alumnos desaprobados.");
    
}
}
