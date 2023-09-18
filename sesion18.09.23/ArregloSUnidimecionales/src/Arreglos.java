import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) throws Exception {
        System.out.println("Cantidad de notas");
        Scanner lector= new Scanner(System.in);
        int CantidadDeNotas=lector.nextInt();
        while(CantidadDeNotas<=0){
            System.out.println("No puede ingresar valores menores o iguales a cero");
            System.out.println("Cantidad de notas");
            CantidadDeNotas=lector.nextInt();
        }
        int[] notas=new int[CantidadDeNotas];

        int SumaNotas =0;
        
        System.out.println("Ingrese el nombre del estudiante y su nota: ");

        String[] NombreDeEstudiantes = new String[CantidadDeNotas];

        for(int i=0; i<notas.length; i++){
            System.out.print("Estudiante["+ (i+1) +"] = ");
            NombreDeEstudiantes[i]=lector.next();
            
            System.out.print("Nota["+(i+1)+"] = ");
            notas[i]=lector.nextInt();
            SumaNotas += notas[i];
        }
        for(int i=0;i<NombreDeEstudiantes.length; i++){
            System.out.println(NombreDeEstudiantes[i]+" "+notas[i]);
        }

        //double promedio=0.0;
        System.out.println("El promedio de las notas es= "+(((double)SumaNotas)/(CantidadDeNotas)));
        lector.close();

    }
    
}
