package com.nelioalves.cursomc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	
	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instatePedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(instatePedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(cal.getTime());
	}
}
