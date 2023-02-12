import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
    int dia;
    Scanner tecla = new Scanner(System.in);
    System.out.print("Ingrese un día de la semana :");
    dia = tecla.nextInt();    //1 , 2 , etc hasta 7
    String dia_semana;   //lu, ma , mier, etc
    
    /*if (dia == 1) {
        dia_semana = "Lunes";
    } else {
        if (dia == 2) {
            dia_semana = "Martes";            
        } else {
            if (dia == 3) {
                dia_semana = "Miércoles";
            } else {
                if (dia == 4) {
                    dia_semana = "Jueves";
                } else {
                    if (dia == 5) {
                        dia_semana = "Viernes";
                    } else {
                        if (dia == 6) {
                            dia_semana = "Sábado";
                        } else {
                            if (dia == 7) {
                                dia_semana = "domingo";
                            } else {
                                dia_semana = "Día incorrecto - Valor corresponde entre 1 y 7.";
                            }
                        }
                    }
                }
            }
        }
    }
/* */
    switch (dia) {
        case 1:
            dia_semana = "Lunes";
            break;
        case 2:
            dia_semana = "Martes";
            break;
        case 3:
            dia_semana = "Miércoles";
            break;
        case 4:
            dia_semana = "Jueves";
            break;
        case 5:
            dia_semana = "Viernes";
            break;
        case 6:
            dia_semana = "Sábado";   
            break;
        case 7:
            dia_semana = "Domingo";
            break;
            default: dia_semana = "Incorrecto, valores entre 1 y 7.";
            break;
    }


    System.out.println(dia_semana);
    
    }
}
