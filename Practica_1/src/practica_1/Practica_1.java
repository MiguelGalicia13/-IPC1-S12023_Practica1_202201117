
package practica_1;

import java.util.Scanner;
public class Practica_1 {

    static String usuario="cajero_202201117";// Ponemos como constantes el usuario y contraseña para ingreso al programa
    static String contra="ipc1_202201117";
    static String codigodescuentos[]= new String [50];// array para almacenar codigo de descuentos
    static int descuento[] = new int [50]; // array que almacena el % de descuento de los codigos
    static int numdesc=0;
    static int pin=0;
    static int ppre=0;
    static int pcant=0;
    //variables para ir agregando a productos
    static String inventario[] = new String[50];
    static double precios[]= new double[50];
    static int cantidad[]=new int[50];
    static String nombre_clientes[]=new String[1000];
    static String nitclientes[]=new String[1000];
    static int nclientes=0;
    static int nits=0; 
    static int vendidos[]=new int[50];
    static int nventas[]=new int[50];
    static String ventas[]= new String [50];
     // ir almacenando datos de los clientes de las ventas
    
 
    public static void main(String[] args) {    
    programa();
     
    }
    public static void programa(){
        existencias();  
        inicio_Sesion();
        while(true){
        //condicion para que el programa continue ejecutandose hasta el el usuario lo cierre
        Scanner sc = new Scanner(System.in);
        menu();
            System.out.println("Desea volver al menu o desea salir?");
            String res= sc.nextLine();
            if(res.equals("salir")){
                System.out.println("Cerrando sesión");
                // Si el texto que escirbe es salir se ejecuta el break y acaba el programa, si no lo escribe se sigue ejecutando
                break;
            }
        }
    }
    public static void inicio_Sesion(){
        Scanner sc = new Scanner(System.in);
        while(true){            // mientras el usuatio y/o contraseña sean incorrecta el programa se seguira ejecutando
            System.out.println("Ingrese su usuario");
        String ingre_usuario= sc.nextLine();
            System.out.println("Ingrese su contraseña");
        String ingre_contra=sc.nextLine();
        if(ingre_usuario.equals(usuario)&& ingre_contra.equals(contra)){            // Al iniciar sesion correctamente  se ejecuta el break y se corta el ciclo
            System.out.println("inicio de sesion exitoso");
            break;
        }else System.out.println("Usuario y/o contraseña incorrecto");
        }
    }
    public static void existencias(){
        //definimos existencias
    inventario[0]="Leche";
    precios[0]=12.50;
    cantidad[0]=10;
    inventario[1]="Camisa";
    precios[1]=34;
    cantidad[1]=10;
    inventario[2]="Jeans";
    precios[2]=50;
    cantidad[2]=10;
    inventario[3]="Jabon de manos";
    precios[3]=20;
    cantidad[3]=10;
    inventario[4]="CocaCola";
    precios[4]=8;
    cantidad[4]=30;
    inventario[5]="Cervezas";
    precios[5]=40;
    cantidad[5]=30;
    inventario[6]="Pan";
    precios[6]=12;
    cantidad[6]=45;
    inventario[7]="Pringles";
    precios[7]=10;
    cantidad[7]=50;
    inventario[8]="Sprite";
    precios[8]=6;
    cantidad[8]=15;
    inventario[9]="Tortix";
    precios[9]=1.5;
    cantidad[9]=40;
    inventario[10]="Ketchup";
    precios[10]=15;
    cantidad[10]=20;
    inventario[11]="Sal";
    precios[11]=5;
    cantidad[11]=20;
    inventario[12]="Tortillas";
    precios[12]=12;
    cantidad[12]=20;
    inventario[13]="Agua";
    precios[13]=5;
    cantidad[13]=25;
    inventario[14]="Tenis";
    precios[14]=150;
    cantidad[14]=25;
    inventario[15]="Calcetines";
    precios[15]=25;
    cantidad[15]=20; // en pares
    inventario[16]="Camiseta";
    precios[16]=25;
    cantidad[16]=20;
    inventario[17]="Sandalias";
    precios[17]=30;
    cantidad[17]=20;
    inventario[18]="Pelota";
    precios[18]=15;
    cantidad[18]=20;
    inventario[19]="Chicle";
    precios[19]=10;
    cantidad[19]=20;        
    codigodescuentos[0]="afsg";
    descuento[0]=15;
    codigodescuentos[1]="altf";
    descuento[1]=25;
    codigodescuentos[2]="f4f5";
    descuento[2]=50;
    codigodescuentos[3]="ffez";  
    descuento[3]=5;
    codigodescuentos[4]="ggez";  
    descuento[4]=80;
    codigodescuentos[5]="momy";  
    descuento[5]=13;
    codigodescuentos[6]="1300";  
    descuento[6]=50;
    codigodescuentos[7]="valo";  
    descuento[7]=33;
    codigodescuentos[8]="ggez";  
    descuento[8]=80;
    codigodescuentos[9]="ch4m";  
    descuento[9]=15;
    codigodescuentos[10]="ch4m";  
    descuento[10]=66;
    codigodescuentos[11]="hspr";  
    descuento[11]=23;
    codigodescuentos[12]="asct";  
    descuento[12]=30;
    codigodescuentos[13]="bind";  
    descuento[13]=90;
    codigodescuentos[14]="gesa";  
    descuento[14]=30;
    codigodescuentos[15]="wobb";  
    descuento[15]=6;
    codigodescuentos[16]="hnzo";  
    descuento[16]=36;
    codigodescuentos[17]="ovw2";  
    descuento[17]=22;
    codigodescuentos[18]="ltus";  
    descuento[18]=23;
    codigodescuentos[19]="csgo";  
    descuento[11]=25;
    }
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu principal");
        System.out.println("1. Agregar nuevos productos");
        System.out.println("2. Agregar codigos de descuento");
        System.out.println("3. Facuracion");
        System.out.println("4. Generar reporte");
        System.out.println("Ingrese su opcion");
        int opcion=sc.nextInt();
        while(opcion!=1&&opcion!=2&&opcion!=3&&opcion!=4){
            System.out.println("Ingrese una opcion valida");
            opcion=sc.nextInt();
        }
        //Creamos el menu y el while se asegura que la opcion sea una de las correctas
        switch(opcion){
            case 1:
                System.out.println("Agregar productos");
                agregar_productos();
                break;
            case 2:
                System.out.println("Agregar descuentos");
                descuentos();
                break;
            case 3:
                System.out.println("Facturacion");
                factura();
                break;
            case 4:
                System.out.println("Generar reporte");
                generar_reporte();
                break;
        }
    }
    public static void descuentos(){
        Scanner sc = new Scanner(System.in);
        String codigo_desc;
        codigo_desc = sc.nextLine();
        System.out.println("ingrese el nuevo codigo");
        for(int n=0;n<=codigodescuentos.length-1;n++){        
        int longitud = codigo_desc.length();            // Almacena la longitud del codigo
        while(longitud!=4 || codigo_desc.equals(codigodescuentos[n])){         // Verifica quue los codigos si tienen 4 digitos
            System.out.println("Codigo invalido intente nuevamente");
            System.out.println("Intente nuevamente");
            codigo_desc = sc.nextLine();
            longitud = codigo_desc.length();
        }
        }
        System.out.println("De cuanto es el descuento?");
        int des=sc.nextInt();
        while(des>100||des<0){
            System.out.println("Cantidad de descuento invalido, intente nuevamente");
            des=sc.nextInt();
        }
        codigodescuentos[numdesc]=codigo_desc;          // Almacena el codigo en la posicion inicial
        descuento[numdesc]=des;
        numdesc++;          //Esto se hace con la finalidad de que se cada codigo se vaya almacenando en el array
        System.out.println("Se registro el codigo de descuento: "+codigo_desc+" Que aplica un descuento del: "+des+"%");
    }
    public static void agregar_productos(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la nueva mercancia");
            String nueva = sc.nextLine();
            for(int i = 0;i<=precios.length-1;i++){
                if(nueva.equals(inventario[i])){// Revisa si el producto esta en existencias
                    System.out.println(nueva+" Se encuentra en exisatencia");
                    break;
                }else{
                inventario[pin]=nueva;
                System.out.println("Cual es el precio");
                float nprecio = sc.nextFloat();
                precios[ppre]=nprecio;
                System.out.println("Que cantidad se registra");
                int cant = sc.nextInt();
                cantidad[pcant]=cant;// almacena en el espacio del arrary el nuevo prodructo
                pin++;
                ppre++;
                pcant++;//sube una posicion en el array para el siguente dato
                return;
                }
            }
    }
    public static void generar_reporte(){
        System.out.println("MERCADERIAS: ");
        System.out.println("Cantidad       "+"Mercaderia  "+"      Precio  ");
        for(int i=0;i<=inventario.length-1;i++){
            //Revisa espacio por espacio en el arrya y si en cantidad es mayo a 0 lo imprime 
        if(cantidad[i]!=0){
            System.out.println(cantidad[i]+"--------------"+inventario[i]+"----------Q"+precios[i]);
        }else if(cantidad[i]==0){
            System.out.println("No mas hay existencias");
            break;
        }    
                    
        }
        System.out.println("DESCUENTOS: ");
        System.out.println("Codigo de descuento  "+"  % de descuento");
        for(int i=0;i<=codigodescuentos.length-1;i++){
        if(descuento[i]!=0){
            System.out.println(codigodescuentos[i]+"  "+"-----------------------"+descuento[i]);
        }else if(descuento[i]==0){
            System.out.println("No mas hay existencias");
            break;
        }
        }
            System.out.println("VENTAS");
           
            
            for(int n=0;n<=nventas.length;n++){
                System.out.println("Cantidad       "+"Mercaderia  ");
                if(nventas[n]!=0){

                    
                    System.out.println(nventas[n]+"--------------"+ventas[n]);
                }else if(nventas[n]==0){
                    System.out.println("No hay ventas");
                    break;
                }     
        }
    }
    public static void factura(){
        Scanner sc = new Scanner(System.in);
        double subtotal=0;
        System.out.println("Ingrese los datos del cliente");
        System.out.println("Nombre del cliente:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el nit del cliente");
        String nit=sc.nextLine();
        nombre_clientes[nclientes]=nombre;//agrega los datos del cliente al array
        nitclientes[nits]=nit;
        nclientes++;
        nits++;
        boolean continuar=true;
        while(continuar){// sirve para indicar si tenemos que agregar un nuevo producto
            System.out.println("Ingrese producto");
            String producto=sc.nextLine();
            for(int i=0;i<=inventario.length-1;i++){
                if(producto.equals(inventario[i])){
                    System.out.println("Ingrese cantidad");
                    int n=sc.nextInt();
                    double subproducto = n*precios[i];
                    System.out.println(n+"  "+producto+"   "+subproducto);
                    subtotal=subtotal+subproducto;
                    sc.nextLine();
                    vendidos[i]=n;
                    System.out.println("Ingresar nuevo producto, si o no?");
                    cantidad[i]=cantidad[i]-n;
                    nventas[i]=n;
                    ventas[i]=producto;
                    String cont=sc.nextLine();
                    continuar = cont.equals("si");   
                }
            } 
        }
        System.out.println("Nombre: "+nombre);
        System.out.println("NIT: "+nit);
        System.out.println("Hay codigo de descuento, si o no?");
        String respuesta= sc.nextLine();
        if(respuesta.equals("si")){
            System.out.println("Ingrese el codigo");
            String code=sc.nextLine();
            for(int r=0;r<=codigodescuentos.length-1;r++){
                
                if(code.equals(codigodescuentos[r])){// revisa si existe el codigo de descuento y nos iduica de cuanto es y realiza los calculos
                    System.out.println("Codigo: "+codigodescuentos[r]+" con un descuento del: "+descuento[r]+"%");
                    double descontar =descuento[r];
                    System.out.println("El subtotal es de: Q"+subtotal);
                    double subdescuento=(descontar/100)*subtotal;
                    System.out.println("Descuento: Q"+subdescuento);
                    double totalpagar=subtotal-subdescuento;
                    System.out.println("Total a pagar: Q"+totalpagar);
                    System.out.println("Imprimiendo factura");
                    break;
            }//realiza calculos sin descuentos
            }                 
        }     
        
        for(int j=0;j<=nventas.length-1;j++){
            System.out.println(vendidos[j]+"-----"+ventas[j]+"----"+nventas[j]);
        }
        System.out.println("El subtotal es de: Q"+subtotal);
                System.out.println("Descuento: Q0.00");
                System.out.println("Total a pagar: Q"+subtotal);
    }
}// ultimo corchete
