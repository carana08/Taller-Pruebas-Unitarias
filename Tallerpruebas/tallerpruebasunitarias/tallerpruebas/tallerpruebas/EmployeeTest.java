package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	Employee empleado;
	
	/************************************
	 * Del metodo cs:
	 * -Se evalua a un empleado "Worker"
	 * -Con moneda en "USD", con los casos por si el mes es par o impar
	 */                                            
    @DisplayName( "Calcular el salario de un empleado de tipo "+"Worker"+" con moneda en USD") 
	@Test
	void testSalarioTrabajador() {
		Employee worker = new Employee(1000,"USD",0,EmployeeType.Worker);
		float valorEsperado;
		Date date = new Date();
		LocalDate localDate;
		localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int month = localDate.getMonthValue();
		if (month % 2 == 0) {
			valorEsperado = 1000;
		} else {
			valorEsperado = 1064.3334f;
		}
		assertEquals(valorEsperado, worker.cs());
	}
    
    /************************************
	 * Del metodo cs:
	 * -Se evalua a un empleado "Supervisor"
	 * -Con moneda en "USD", con los casos por si el mes es par o impar
	 */                                            
    @DisplayName( "Calcular el salario de un empleado de tipo "+"Supervisor"+" con moneda en USD") 
	@Test
	void testSalarioSupervisor() {
		Employee supervisor = new Employee(1500,"USD",0.1f,EmployeeType.Supervisor);
		float valorEsperado;
		Date date = new Date();
		LocalDate localDate;
		localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int month = localDate.getMonthValue();
		if (month % 2 == 0) {
			valorEsperado = 1500.035f;
		} else {
			valorEsperado = 1564.3684f;
		}
		assertEquals(valorEsperado, supervisor.cs());
	}
    /************************************
   	 * Del metodo cs:
   	 * -Se evalua a un empleado "Manager"
   	 * -Con moneda en "USD", con los casos por si el mes es par o impar
   	 */                                            
       @DisplayName( "Calcular el salario de un empleado de tipo "+"Manager"+" con moneda en USD") 
   	@Test
   	void testSalarioManager() {
   		Employee manager = new Employee(2000,"USD",0.2f,EmployeeType.Manager);
   		float valorEsperado;
   		Date date = new Date();
   		LocalDate localDate;
   		localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
   		int month = localDate.getMonthValue();
   		if (month % 2 == 0) {
   			valorEsperado = 2000.14f;
   		} else {
   			valorEsperado = 2064.4734f;
   		}
   		assertEquals(valorEsperado, manager.cs());
   	}
       /************************************
      	 * Del metodo cs:
      	 * -Se evalua a un empleado "Supervisor"
      	 * -Con moneda en "Euro", con los casos por si el mes es par o impar
      	 */                                            
          @DisplayName( "Calcular el salario de un empleado de tipo "+"Supervisor"+" con moneda en Euro") 
      	@Test
      	void testSalarioOtraMoneda() {
      		Employee supervisor = new Employee(1500,"Euro",0.15f,EmployeeType.Supervisor);
      		float valorEsperado;
      		Date date = new Date();
      		LocalDate localDate;
      		localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
      		int month = localDate.getMonthValue();
      		if (month % 2 == 0) {
      			valorEsperado = 1425.0525f;
      		} else {
      			valorEsperado = 1489.3859f;
      		}
      		assertEquals(valorEsperado, supervisor.cs());
      	}

	/**********************************
	 * Del metodo CalculateYearBonus:
	 * -Se evalua a un empleado "WORKER"
	 * -Con moneda en "DOLARES - USD"
	 */
	@Test                                               
    @DisplayName("Calcular bonus anual del Worker con moneda en Dolares")   
    void testCalculateYearBonusWorker() {
		empleado = new Employee((float)1000,"USD", (float)0.2, EmployeeType.Worker);
		float bonus = empleado.CalculateYearBonus();
		assertEquals((float)386.0, bonus);
    }
	
	
	/*************************************
	 * Del metodo CalculateYearBonus:
	 * -Se evalua a un empleado "SUPERVISOR"
	 * -Con moneda en "DOLARES - USD"
	 */
	@Test                                               
    @DisplayName("Calcular bonus anual del Supervisor con moneda en Dolares")   
    void testCalculateYearBonusSupervisor() {
		empleado = new Employee((float)2000,"USD", (float)0.3, EmployeeType.Supervisor);
		float bonus = empleado.CalculateYearBonus();
		assertEquals((float)2193, bonus);  
    }
	
	
	/************************************
	 * Del metodo CalculateYearBonus:
	 * -Se evalua a un empleado "MANAGER"
	 * -Con moneda en "DOLARES - USD"
	 */
	@Test                                               
    @DisplayName("Calcular bonus anual del Manager con moneda en Dolares")   
    void testCalculateYearBonusManager() {
		empleado = new Employee((float)3000,"USD", (float)0.4, EmployeeType.Manager);
		float bonus = empleado.CalculateYearBonus();
		assertEquals((float)3386, bonus);  
    }
	
	
	/************************************
	 * Del metodo CalculateYearBonus:
	 * -Se evalua a un empleado "MANAGER"
	 * -Con moneda en "EUROS"
	 */
	@Test                                               
    @DisplayName( "Calcular bonus anual del Manager con moneda en Euros")   
    void testCalculateYearBonusMonedaDistinta() {
		empleado = new Employee((float)3000,"Euro", (float)0.4, EmployeeType.Manager);
		float bonus = empleado.CalculateYearBonus();
		assertEquals((float)3236, bonus);  
    }

}
