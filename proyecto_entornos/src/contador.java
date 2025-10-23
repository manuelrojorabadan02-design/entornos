public class contador {
    int inicio;
    int fin;

    //constructor
    public contador (int inicio, int fin){
        this.inicio = inicio;
        this.fin = fin;
    }
    //Solución 1
    public void contar(){
        for (int i = inicio; i <= fin; i++){
            System.out.println(i);
        }
    }

    //Solución 2
    public void contar2(){
        int i = inicio;
        while (i <= fin){
            System.out.println(i);
            i++;
        }
    }

    //Solución 3
    public int sumar(){
        int suma = 0;
        for (int i = inicio; i <= fin; i++){
            suma += i;
        }
        return suma;
    }
}

