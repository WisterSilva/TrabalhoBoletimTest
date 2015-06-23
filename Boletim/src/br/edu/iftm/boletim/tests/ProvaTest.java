package br.edu.iftm.boletim.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.iftm.boletim.Boletim;
import br.edu.iftm.boletim.Prova;

public class ProvaTest {


	@Test
	public void testProvaValendoMaisQueCem() {
		Prova p = new Prova();
		
		p.setNota_max(180.0);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual, 0.0);
		
	}

	@Test
	public	void testProvaValendoMenosQuemZero(){
		
		
		Prova p = new Prova ();
		p.setNota_max(-10.0);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual, 0.0);
			
	}
	
	@Test
	public void testProvaValendoValorAceito(){
		
		Prova p = new Prova();
		p.setNota_max(80.0);
		
		double experado = 80.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual, 0.0);
		
	}
	
	@Test
	public void AlunoAprovado(){
		
	Prova p = new Prova();
	Boletim b = new Boletim();
	
	p.setNota_max(100);
	
	p.setNota_obtida(60.0);
	b.adicionaProva(p);
	
	boolean experado = true;
	boolean atual = b.foiAprovado();
	
	assertEquals (experado, atual);

	}
	
	
	@Test
	public void AlunoNãoAprovado(){
		
		Prova p = new Prova();
		Boletim b = new Boletim();
		
		p.setNota_max(100);
		
		p.setNota_obtida(40.0);
		b.adicionaProva(p);
		
		boolean experado = false;
		boolean atual = b.foiAprovado();
		
		assertEquals (experado, atual);
		
	}
	
	
	
	
}


