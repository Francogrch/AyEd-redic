package punto3;

public class Test {
	public static void main(String[] args) {
		Estudiante[] arrayEstu = new Estudiante[2];
		Profesor[] arrayProfe = new Profesor[3];
		arrayEstu[0] = new Estudiante("Franco","San",2,"f@edu.com","calle 2");
		arrayEstu[1] = new Estudiante("Carla","San",2,"c@edu.com","calle 22");
		arrayProfe[0] = new Profesor("Luciano","Marx","ISO","f@iso.com","calle 60");
		arrayProfe[1] = new Profesor("Luck","Sky","CADP","lu@sky.com","calle 623");
		arrayProfe[2] = new Profesor("Uriel","Marzo","TdP","uri@tdp.com","calle 12");
		
		for (Estudiante estudiante: arrayEstu) {
			System.out.println(estudiante.tusDatos());
		}	
		for (Profesor profesor: arrayProfe) {
			System.out.println(profesor.tusDatos());
		}
	}
}
