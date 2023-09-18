public class App {
    public static void main(String[] args) throws Exception {
        //Declaracion de arreglos
        int arreglo1[]=new int[5];//0.1.2.3.4
        //arreglo1={0.0.0.0.0}
        int []arreglo2=new int[10];//0.1.2.3.4.5.6.7.8.9
        //arreglo1={0.0.0.0.0.0.0.0.0.0}
        //Declaracion de iniciacion de arreglos
        int arreglo3[]={1,2,3,4,5,6,7};//0.1.2.3.4.5.6
        int[]arreglo5=new int[] {10,20,30,40,50};//0.1.2.3.4
        //acceder e imprimir elementos
        System.out.println(arreglo1[2]);//0
        System.out.println(arreglo2[7]);//0
        System.out.println(arreglo3[5]);//6
        System.out.println(arreglo5[4]);//50
        //Asignar valores a los arreglos
        arreglo1[0]=18;
        arreglo1[1]=9;
        arreglo1[2]=5;
        arreglo1[3]=14;
        arreglo1[4]=20;
        System.out.println("Arreglo 1[0]= "+arreglo1[0]);
        System.out.println("Arreglo 1[1]= "+arreglo1[1]);
        System.out.println("Arreglo 1[2]= "+arreglo1[2]);
        System.out.println("Arreglo 1[3]= "+arreglo1[3]);
        System.out.println("Arreglo 1[4]= "+arreglo1[4]);
        
    }
}
