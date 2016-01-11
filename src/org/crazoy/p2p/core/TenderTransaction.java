package org.crazoy.p2p.core;

import java.math.BigDecimal;

public class TenderTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private BigDecimal calculateMonthlyRevenue(BigDecimal capital,
			BigDecimal rate, int periods) {
		return capital.multiply(rate).multiply(new BigDecimal(periods))
				.divide(new BigDecimal(12), 2, BigDecimal.ROUND_DOWN);

	}
}
