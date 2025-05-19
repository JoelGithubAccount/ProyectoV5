package Main;

import java.util.Scanner;

import Implementacion.ImplementacionIngCivil;
import Modelo.IngCivil;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = null;
		
		
		long cedula;
		String carrera;
		String grado;
		float salario;
		
		IngCivil civil = null;
		
		int menuPrincipal, menuPrincipalIngCivil;
		
	
		
		ImplementacionIngCivil impCivil = new ImplementacionIngCivil();
		
		do {
			
			System.out.println("Menu Principal");
			System.out.println("1.--- Crud Ing Civil");
			System.out.println("2.--- Crud Lic en Informatica");
			System.out.println("3.--- Salir");
			
			
			scan = new Scanner(System.in);
			menuPrincipal = scan.nextInt();
			
			switch (menuPrincipal) {
			
			case 1: // Crud ING Civil
				
				do {
					
					System.out.println("Crud Ing civil");
					System.out.println("1.--- Alta");
					System.out.println("2.--- Mostrar");
					System.out.println("3.--- Buscar");
					System.out.println("4.--- Editar");
					System.out.println("5.--- Eliminar");
					System.out.println("6.--- Regresar M. P.");
					
					scan = new Scanner(System.in);
					menuPrincipalIngCivil = scan.nextInt();
					
					switch(menuPrincipalIngCivil) {
					
					case 1:
						
						try {
							
							System.out.println("Ingresa el numero de cedula Profesional");
							scan = new Scanner(System.in);
							cedula = scan.nextLong();
							
							System.out.println("Ingrese la carrera");
							scan = new Scanner(System.in);
							carrera = scan.nextLine();
							
							System.out.println("Ingrese el grado");
							scan = new Scanner(System.in);
							grado = scan.nextLine();
							
							System.out.println("Ingrese el salario");
							scan = new Scanner(System.in);
							salario = scan.nextFloat();
							
							
							//Creamos el objeto
							civil = new IngCivil(cedula, carrera, grado, salario);
							
							//Agregamos el objeto al hashMap
							impCivil.guardar(civil);
							System.out.println("Se guardo exitosamente al profesionista");
							
							
							
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Error al intentar guardar al profesionista: "+ e.getMessage() );
						}
						
						break;
						
					case 2:
						
						impCivil.mostrar();
						
						break;
						
					case 3: //Buscar los registros por busqueda de cedula
						
						try {
							
							System.out.println("Ingresa la cedula del ingeniero a buscar");
							scan = new Scanner(System.in);
							cedula = scan.nextLong();
							
							//Invocamos el metodo 
							civil = impCivil.buscar(cedula);
							System.out.println("Registro encontrado: " + civil);
							
							
							
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Error desconocido verifique su datos: " + e.getMessage());
						}
						
						break;
						
					case 4:
						
						try {
							

							System.out.println("Ingrese la cedula a editar");
							scan = new Scanner(System.in);
							cedula = scan.nextLong();
							
							//Buscar
							civil = impCivil.buscar(cedula);
							System.out.println("Se encontro: " + civil.getCedula());
							
							//Actualizamos 
							System.out.println("Ingrese el nuevo salario");
							scan = new Scanner(System.in);
							salario = scan.nextFloat();
							
							//Actualizamos el objeto
							civil.setSalario(salario);
							
							//Actualizamos el hashMap
							impCivil.editar(civil);
							System.out.println("Se edito");
							
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Error desconocido verifique su datos: " + e.getMessage());
						}
						
						break;
						
					case 5:
						
						try {
							
							System.out.println("Ingrese la cedula a eliminar");
							scan = new Scanner(System.in);
							cedula = scan.nextLong();
							
							//Invocacion del metodo para eliminar 
							impCivil.eliminar(cedula);
							System.out.println("Se elimino");
							
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Error desconocido verifique su datos: " + e.getMessage());
						}
						
						break;
					
					case 6:
						
						System.out.println("Saliendo del menu Ing Civil");
						System.out.println("Porfavor Vuelva Pronto");
						
						break;
						
					
					}
					
				} while(menuPrincipalIngCivil < 6);
				
				
				
				break;
				
			case 2: // Crud Ing lic. Informatica
				
				break;
				
			case 3: // Salir
				System.out.println("Saliendo del menu profesionistas");
				break;
			
			}
			
		} while(menuPrincipal < 3);
		
	}

}
