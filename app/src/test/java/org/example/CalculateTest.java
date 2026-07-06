package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
	@Test
	public void testSum() {
		Calculate calculate = new Calculate();
		int expected = 5;
		assertEquals(expected, calculate.sum(2, 3));
	}

	// ==========================================
	// getIndividualFee メソッドのテスト
	// ==========================================

	@Test
	public void testGetIndividualFee_AgeTwelveOrLess_ReturnsOneThousand() {
		Calculate calc = new Calculate();
		// 12歳でテスト（age <= 12 の真）
		assertEquals(1000, calc.getIndividualFee(12));
	}

	@Test
	public void testGetIndividualFee_AgeThirteenOrMore_ReturnsTwoThousand() {
		Calculate calc = new Calculate();
		// 13歳でテスト（age <= 12 の偽）
		assertEquals(2000, calc.getIndividualFee(13));
	}

	// ==========================================
	// getTotalFee メソッドのテスト
	// ==========================================

	@Test
	public void testGetTotalFee_GroupSizeLessThanTen_ReturnsNormalTotal() {
		Calculate calc = new Calculate();
		// 13歳以上(2000円) × 9人 = 18000円（groupSize >= 10 の偽）
		assertEquals(18000, calc.getTotalFee(25, 9));
	}

	@Test
	public void testGetTotalFee_GroupSizeTenOrMore_ReturnsDiscountedTotal() {
		Calculate calc = new Calculate();
		// 12歳以下(1000円) × 10人 = 10000円 -> 10%引きで 9000円（groupSize >= 10 の真）
		assertEquals(9000, calc.getTotalFee(10, 10));
	}
}
