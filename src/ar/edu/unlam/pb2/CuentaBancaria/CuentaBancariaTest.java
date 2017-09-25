package ar.edu.unlam.pb2.CuentaBancaria;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaBancariaTest {
	
	CuentaBancaria unaCuentaNueva = new CuentaBancaria();
	CuentaSueldo unaCuentaSueldo = new CuentaSueldo();
	CajaDeAhorros unaCajaDeAhorros = new CajaDeAhorros();
	CuentaCorriente unaCuentaCorriente = new CuentaCorriente();

	@Test
	public void testDeposito() {
		unaCuentaNueva.setDepositar(1500.0);
		double saldoActual = unaCuentaNueva.getSaldo();
		double esperado = 1500;
		assertEquals(esperado, saldoActual, 0.0001);
	}
	
	@Test
	public void testSaldo(){
		unaCuentaNueva.setSaldo(500.0);
		double saldoActual = unaCuentaNueva.getSaldo();
		double esperado = 500.0;
		assertEquals(esperado, saldoActual, 0.0001);
	}
	
	@Test
	public void tesCuentaSueldo(){
		unaCuentaSueldo.setSaldo(500.0);
		unaCuentaSueldo.setRetirar(100.0);
		double saldoActual = unaCuentaSueldo.getSaldo();
		double esperado = 400;
		assertEquals(esperado, saldoActual, 0.0001);
	}
	@Test
	public void testUnaCajaDeAhorros(){
		unaCajaDeAhorros.setSaldo(1000.0);
		unaCajaDeAhorros.setRetirar(200.0);
		double saldoActual = unaCajaDeAhorros.getSaldo();
		double esperado = 800.0;
		assertEquals(esperado, saldoActual, 0.0001);
	}
	@Test
	public void testUnaCuentaCorriente(){
		unaCuentaCorriente.setSaldo(2000.0);
		unaCuentaCorriente.setRetirar(2150.0);/*Dinero a retirar con descubierto*/
		double saldoActual = unaCuentaCorriente.getSaldo();
		double esperado = -157.5;/*saldo en cuenta con comisión calculada*/
		assertEquals(esperado, saldoActual, 0.0001);
	}
}
