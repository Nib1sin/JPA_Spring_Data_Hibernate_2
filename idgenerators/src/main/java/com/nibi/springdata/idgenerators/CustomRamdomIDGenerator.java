package com.nibi.springdata.idgenerators;

import java.io.Serializable;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomRamdomIDGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SharedSessionContractImplementor si, Object obj) throws HibernateException {

		Random random = null;
		int id = 0;
		
		random = new Random();
		id = random.nextInt(10000);
		return new Long(id);
	}

	

}