package com.skiply.feecollection.services;

import com.skiply.feecollection.entities.Fees;

public interface FeeCollectionService {

	public Fees collectFees(Fees fees );
	
	public Fees viewReceipt(int studentID);
}
