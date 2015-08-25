package es.cea.servicioCalculadora;

import org.testng.annotations.Test;

import es.cea.servicio.calculadora.CalculadoraImplEuropea;

public class CalculadoraImplEuropeaTest {
	@Test
	public void pruebaCalculadoraEuropea(){
		CalculadoraImplEuropea calculadora=new CalculadoraImplEuropea();
		String res=calculadora.CalcularMultiplicacion(2, 2);
		assert (res.equals("4Euros")):"ha salido "+res;
}
}
