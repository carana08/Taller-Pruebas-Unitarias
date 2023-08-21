package tallerpruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	Employee empleado;

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
