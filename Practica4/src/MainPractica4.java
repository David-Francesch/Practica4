package Practicas3erTri.Practica4.Practica4.src;

import java.util.ArrayList;
import java.util.Scanner;

public class MainPractica4 {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        ArrayList <Jugador> equipo = new ArrayList<>();

        int opcion;

        do {

            System.out.println("Selecciona una opcion:");
            System.out.println("1. Añadir jugador.");
            System.out.println("2. Contabilizar gol.");
            System.out.println("3. Contabilizar pase.");
            System.out.println("4. Contabilizar recuperacion.");
            System.out.println("5. Contabilizar parada.");
            System.out.println("6. Mostrar jugador.");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    newJugador(equipo);
                break;
                
                case 2:
                    ContabilizarGol(equipo);
                break;
                case 3:
                    // do{
                    //     System.out.println("Introduce el num del jugador:");
                    //     dorsal = sc.nextInt();
                    //     if (!equipo.contains(dorsal)||equipo.getClass(dorsal)) {
                    //         System.out.println("El numero introducido no corresponde a ningun jugador");
                    //     }else{
                    //         System.out.println("Introduce cuantos pases ha hecho");
                    //         goles = sc.nextInt();
                    //         //To-do : hacer que se guarde en el registro adecuado
                    //         // equipo.get(dorsal);
                        
                    //     }
                    break;
                
                case 4:
                    
                    break;
                
                case 5:
                    
                    break;
                
                case 6:
                    MostrarJugadores(equipo);
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion < 8);
        
    }

    public static void newJugador(ArrayList <Jugador> equipo) {
        Scanner sc= new Scanner(System.in);
        Scanner scs= new Scanner(System.in);
        int opcionj;
        int dorsal;
        String nombre;

        System.out.println("Seleccion el tipo de jugador:");
        System.out.println("1. Atacante.");
        System.out.println("2. Defensor.");
        System.out.println("3. Portero.");

        opcionj = sc.nextInt();
            switch (opcionj) {
                case 1:                  
                        System.out.println("Escribe el nombre del jugador:");
                        nombre = scs.nextLine();
                        System.out.println("Escribe el num del dorsal:");
                        dorsal = sc.nextInt();
                        if (equipo.contains(dorsal)) {
                            System.out.println("Ya has introducido un jugador con este dorsal");
                        }else{
                            equipo.add(new JugadorDeCampo(nombre, dorsal, true)); 
                        }
                    break;

                case 2:                   
                    System.out.println("Escribe el nombre del jugador:");
                    nombre = scs.nextLine();
                    System.out.println("Escribe el num del dorsal:");
                    dorsal = sc.nextInt();
                    if (equipo.contains(dorsal)) {
                        System.out.println("Ya has introducido un jugador con este dorsal");
                    }else{
                        equipo.add(new JugadorDeCampo(nombre, dorsal, false));
                    }
                    break;

                case 3:  
                    
                    System.out.println("Escribe el nombre del jugador:");
                    nombre = scs.nextLine();
                    System.out.println("Escribe el num del dorsal:");
                    dorsal = sc.nextInt();
                    if (equipo.contains(dorsal)) {
                        System.out.println("Ya has introducido un jugador con este dorsal");
                    }else{
                        equipo.add(new Portero(nombre, dorsal));
                    }
                    break;

                default:

                    System.out.println("Opcion no valida");
                    break;
            }
        }

        public static void ContabilizarGol(ArrayList <Jugador> equipo) {
            Scanner sc= new Scanner(System.in);
            int goles;
            
            System.out.println("Introduce el num del jugador:");
            int dorsal = sc.nextInt();
            if (!equipo.contains(dorsal)) {
                System.out.println("El numero introducido no corresponde a ningun jugador");
            }else{
                System.out.println("Introduce cuantos goles a marcado");
                goles = sc.nextInt();
                for (int i = 0; i < equipo.size(); i++) {
                    if (equipo.get(i).getDorsal() == dorsal) {
                        equipo.get(i).setNumGoles(goles);
                    }
                }
            }
        }

    public static void MostrarJugadores(ArrayList <Jugador> equipo) {
        Scanner sc= new Scanner(System.in);
        int dorsal;
        System.out.println("Escribe el num del dorsal:");
        dorsal = sc.nextInt();
        for (int i = 0; i < equipo.size(); i++) {
            if (jugador.getDorsal() == dorsal) {
                System.out.println(jugador.toString()+"\nValoración: "+jugador.getValoracion());
            }  
        }
    }

}

