/**
 * 
 */
package mockito.example.services;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import mockito.example.exceptions.ZeroDivisionException;
import mockito.example.services.impl.BasicOperationsServiceImpl;
import mockito.example.services.impl.CalculatorServiceImpl;
import mockito.example.services.impl.DataServiceImpl;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {
	
	@Mock	
	BasicOperationsService basicOperationsServiceMock;
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	CalculatorServiceImpl calculatorServiceInjected;
	
	CalculatorServiceImpl calculatorService;
	
	@BeforeEach
	void beforeEach() {
		calculatorService = new CalculatorServiceImpl();
	}
	
	
	@Test
	void addTest() {
		
		int a = 3;
		int b = 4;		
		
		when(basicOperationsServiceMock.add(a, b)).thenReturn(7.0);
		
		assertEquals(7.0, calculatorServiceInjected.calculateSum(a, b));
		
		verify(basicOperationsServiceMock).add(a, b);
	}
	
	@Test
	void substractionTest() {
		
		int a = 3;
		int b = 4;
		
		when(basicOperationsServiceMock.subtract(a, b)).thenReturn(-1.0);
		
		double c = calculatorServiceInjected.calculateSubstraction(a, b);
		
		assertEquals(-1, c);
		
		Mockito.verify(basicOperationsServiceMock).subtract(a, b);
	}
	
	@Test
	void divisionTest() throws ZeroDivisionException {
		
		int a = 10;
		int b = 2;
		
		when(basicOperationsServiceMock.divide(a, b)).thenReturn(5.0);
		
		double c = calculatorServiceInjected.calculateDivision(a, b);
		
		assertEquals(5, c);
		
		Mockito.verify(basicOperationsServiceMock).divide(a, b);
	}
	
	@Test
	void multiplicationTest() {
		
		int a = 10;
		int b = 2;
		
		when(basicOperationsServiceMock.multiply(a, b)).thenReturn(20.0);
		
		double c = calculatorServiceInjected.calculateMultiplication(a, b);
		
		assertEquals(20.0, c);
		
		Mockito.verify(basicOperationsServiceMock).multiply(a, b);
	}
	
	@Test
	void averageTest() {
		
		int arrayInt[] = {1,2,3,4,5};
		
		Mockito.when(dataServiceMock.getListOfNumbers()).thenReturn(arrayInt);
		
		double avg = calculatorServiceInjected.calculateAverage();
		
		assertEquals(3, avg);
		
	}
	
	@Test
	void averageTestZero() {
		
		int arrayInt[] = {};
		
		Mockito.when(dataServiceMock.getListOfNumbers()).thenReturn(arrayInt);
		
		double avg = calculatorServiceInjected.calculateAverage();
		
		assertEquals(0, avg);
		
	}
	
	@Test
	void averageTestNullPointerTest() {		
		
			when(dataServiceMock.getListOfNumbers()).thenReturn(null);
		
			assertThrows(NullPointerException.class, ()-> calculatorServiceInjected.calculateAverage());		
	}
	
	@Test
	void divisionExceptionTest() {
		
		int a = 5;
		int b = 0;
		
		//Se podria haber hecho de otra forma? ya que tengo que poner Thrown al metodo
		assertThrows(ZeroDivisionException.class,()->calculatorServiceInjected.calculateDivision(a, b));
		
		Mockito.verify(basicOperationsServiceMock, never()).divide(a, b);
	}
	
	@Test
	void printTest() {
		
		int a = 5;
		int b = 7;
		
		//Es asi?
		Mockito.when(basicOperationsServiceMock.add(a, b)).thenReturn((double) (a+b));
		
		double c =calculatorServiceInjected.calculateSum(a, b);
		
		String result = calculatorServiceInjected.printResult(c);
		
		assertEquals("El resultado es: " + (double)(a+b), result);
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,5,7,9})
	void siOddTest(int input) {
		assertTrue(calculatorServiceInjected.isOdd(input));
	}
	

	
	@Test
	void spyBasicOperationsTest() {
		
	BasicOperationsService basicOperationsService = new BasicOperationsServiceImpl();
	
	BasicOperationsService spyBasicOperationsService = spy(basicOperationsService);
	
	calculatorServiceInjected.setBasicOperationsService(spyBasicOperationsService);
	
	int a = 5;
	int b = 7;
	
	calculatorServiceInjected.calculateSum(a, b);
		
	verify(spyBasicOperationsService).add(5.0, 7.0);
	}
	
	@Test
	void listOfNumbersTest() {	
		
		DataServiceImpl dataService = new DataServiceImpl();
		
		DataServiceImpl spyDataService = spy(dataService);
		
		calculatorServiceInjected.setDataService(spyDataService);
		
		when(spyDataService.getListOfNumbers()).thenReturn(new int[] {1,2,3,4,5,6});
		
		int[] spyListOfNumbers = calculatorServiceInjected.getDataService().getListOfNumbers();
		
		
		
		spyDataService.setListOfNumbers(new int[] {1,2,3});
		
		assertEquals(6, spyListOfNumbers.length);
		
	}
	
}
