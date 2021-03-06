package polimorfismoinversionistas;

import java.util.Scanner;

public class EjecutaInversionista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String opcion2, numCuenta, nombre, cadena = "\t\tREPORTE DE INVERSIONES\nNo. Cliente\t\tNombre\t\tNo. Cue" +
                "nta\t\tInteres ganado\n";
        double cuenta, invert, totalInv = 0;
        int plazoAnual, opcion, intAnual, numCli = 0;
        boolean bandera = true;
        while (bandera){
            System.out.println("CALCULO DE BENEDICIO EN INVERSIONES BANCARIAS\n");
            System.out.println("Elija la opcion pertinente\n1. Cuenta de ahorros\n2. Pagare\n3. Cuenta maestra\n4. Sa" +
                    "lir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese su numero de cuenta: ");
                    numCuenta = scanner.nextLine();

                    System.out.println("Ingrese su nombre: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrese el saldo de su cuenta");
                    cuenta = scanner.nextDouble();

                    System.out.println("Ingrese su inversion mensual: ");
                    invert = scanner.nextDouble();

                    System.out.println("Ingrese su plazo anual: ");
                    plazoAnual = scanner.nextInt();

                    System.out.println("Ingrese el interes anual de su banco: ");
                    intAnual = scanner.nextInt();
                    scanner.nextLine();

                    numCli = numCli + 1;

                    CuentaAhorro cuentaAhorro = new CuentaAhorro(numCli, nombre, numCuenta, invert, intAnual,
                            plazoAnual, cuenta);
                    cuentaAhorro.calcularIntGanado();


                    cadena = String.format("%s\t%d\t\t\t%s\t\t%s\t\t\t%.2f\n", cadena, cuentaAhorro.getNumCl(),
                            cuentaAhorro.getNom(), cuentaAhorro.getNumCu(), cuentaAhorro.getIntGanado());

                    totalInv += cuentaAhorro.getIntGanado();

                    System.out.println("¿Desea ingresar otro calculo? Si / No");
                    opcion2 = scanner.nextLine().toLowerCase();

                    if(opcion2.equals("no")) {
                        bandera = false;
                    }
                    break;
                case 2:
                    System.out.println("Ingrese su numero de cuenta: ");
                    numCuenta = scanner.nextLine();

                    System.out.println("Ingrese su nombre: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrese su inversion: ");
                    invert = scanner.nextDouble();

                    System.out.println("Ingrese su plazo anual: ");
                    plazoAnual = scanner.nextInt();

                    System.out.println("Ingrese el interes anual de su banco: ");
                    intAnual = scanner.nextInt();
                    scanner.nextLine();

                    numCli = numCli + 1;

                    Pagare pagareP = new Pagare(numCli, nombre, numCuenta, invert, plazoAnual, intAnual);
                    pagareP.calcularIntGanado();

                    cadena = String.format("%s\t%d\t\t\t%s\t\t%s\t\t\t%.2f\n", cadena, pagareP.getNumCl(),
                            pagareP.getNom(), pagareP.getNumCu(), pagareP.getIntGanado());

                    totalInv += pagareP.getIntGanado();

                    System.out.println("¿Desea ingresar otro calculo? Si / No");
                    opcion2 = scanner.nextLine().toLowerCase();

                    if(opcion2.equals("no")){
                        bandera = false;
                    }
                    break;
                case 3:
                    System.out.println("Ingrese su numero de cuenta: ");
                    numCuenta = scanner.nextLine();

                    System.out.println("Ingrese su nombre: ");
                    nombre = scanner.nextLine();

                    System.out.println("Ingrese su inversion: ");
                    invert = scanner.nextDouble();

                    System.out.println("Ingrese su plazo anual: ");
                    plazoAnual = scanner.nextInt();
                    scanner.nextLine();

                    numCli = numCli + 1;

                    CuentaMaestra cuentaMaestra = new CuentaMaestra(numCli, nombre, numCuenta, invert, plazoAnual);
                    cuentaMaestra.calcularIntGanado();

                    cadena = String.format("%s\t%d\t\t\t%s\t\t%s\t\t\t%.2f\n", cadena, cuentaMaestra.getNumCl(),
                            cuentaMaestra.getNom(), cuentaMaestra.getNumCu(), cuentaMaestra.getIntGanado());

                    totalInv += cuentaMaestra.getIntGanado();

                    System.out.println("¿Desea ingresar otro calcula? Si / No");
                    opcion2 = scanner.nextLine().toLowerCase();


                    if(opcion2.equals("no")){
                        bandera = false;
                    }
                    break;
                case 4:
                    bandera = false;
                    break;

                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
        System.out.print(cadena);
        System.out.println("TOTAL "+numCli+" inversiones\t\t\t\t\t\t\t"+totalInv);
    }
}
