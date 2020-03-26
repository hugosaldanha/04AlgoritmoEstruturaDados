package buscaBinariaRecursiva;


public class busca {
	public static void main(String[] args) {
		int[] iVetor = new int[] { 100, 115, 130, 145, 160, 175, 190, 205, 220, 235, 250, 265, 280, 295, 310, 325, 340,
				355, 370, 385, 400, 415, 430, 445, 460, 475, 490, 505, 520, 535, 550, 565, 580, 595, 610, 625, 640, 655,
				670, 685, 700, 715, 730, 745, 760, 775, 790, 805, 820, 835, 850, 865, 880, 895, 910, 925, 940, 955, 970,
				985, 1000, 1015, 1030, 1045, 1060, 1075, 1090, 1105, 1120, 1135, 1150, 1165, 1180, 1195, 1210, 1225,
				1240, 1255, 1270, 1285, 1300, 1315, 1330, 1345, 1360, 1375, 1390, 1405, 1420, 1435, 1450, 1465, 1480,
				1495, 1510, 1525, 1540, 1555, 1570, 1585, 1600, 1615, 1630, 1645, 1660, 1675, 1690, 1705, 1720, 1735,
				1750, 1765, 1780, 1795, 1810, 1825, 1840, 1855, 1870, 1885, 1900, 1915, 1930, 1945, 1960, 1975, 1990,
				2005, 2020, 2035, 2050, 2065, 2080, 2095, 2110, 2125, 2140, 2155, 2170, 2185, 2200, 2215, 2230, 2245,
				2260, 2275, 2290, 2305, 2320, 2335, 2350, 2365, 2380, 2395, 2410, 2425, 2440, 2455, 2470, 2485, 2500,
				2515, 2530, 2545, 2560, 2575, 2590, 2605, 2620, 2635, 2650, 2665, 2680, 2695, 2710, 2725, 2740, 2755,
				2770, 2785, 2800, 2815, 2830, 2845, 2860, 2875, 2890, 2905, 2920, 2935, 2950, 2965, 2980, 2995, 3010,
				3025, 3040, 3055, 3070, 3085, 3100, 3115, 3130, 3145, 3160, 3175, 3190, 3205, 3220, 3235, 3250, 3265,
				3280, 3295, 3310, 3325, 3340, 3355, 3370, 3385, 3400, 3415, 3430, 3445, 3460, 3475, 3490, 3505, 3520,
				3535, 3550, 3565, 3580, 3595, 3610, 3625, 3640, 3655, 3670, 3685, 3700, 3715, 3730, 3745, 3760, 3775,
				3790, 3805, 3820, 3835, 3850, 3865, 3880, 3895, 3910, 3925, 3940, 3955, 3970, 3985, 4000, 4015, 4030,
				4045, 4060, 4075, 4090, 4105, 4120, 4135, 4150, 4165, 4180, 4195, 4210, 4225, 4240, 4255, 4270, 4285,
				4300, 4315, 4330, 4345, 4360, 4375, 4390, 4405, 4420, 4435, 4450, 4465, 4480, 4495, 4510, 4525, 4540,
				4555, 4570, 4585, 4600, 4615, 4630, 4645, 4660, 4675, 4690, 4705, 4720, 4735, 4750, 4765, 4780, 4795,
				4810, 4825, 4840, 4855, 4870, 4885, 4900, 4915, 4930, 4945, 4960, 4975, 4990, 5005, 5020, 5035, 5050,
				5065, 5080, 5095, 5110, 5125, 5140, 5155, 5170, 5185, 5200, 5215, 5230, 5245, 5260, 5275, 5290, 5305,
				5320, 5335, 5350, 5365, 5380, 5395, 5410, 5425, 5440, 5455, 5470, 5485, 5500, 5515, 5530, 5545, 5560,
				5575, 5590, 5605, 5620, 5635, 5650, 5665, 5680, 5695, 5710, 5725, 5740, 5755, 5770, 5785, 5800, 5815,
				5830, 5845, 5860, 5875, 5890, 5905, 5920, 5935, 5950, 5965, 5980, 5995, 6010, 6025, 6040, 6055, 6070,
				6085, 6100, 6115, 6130, 6145, 6160, 6175, 6190, 6205, 6220, 6235, 6250, 6265, 6280, 6295, 6310, 6325,
				6340, 6355, 6370, 6385, 6400, 6415, 6430, 6445, 6460, 6475, 6490, 6505, 6520, 6535, 6550, 6565, 6580,
				6595, 6610, 6625, 6640, 6655, 6670, 6685, 6700, 6715, 6730, 6745, 6760, 6775, 6790, 6805, 6820, 6835,
				6850, 6865, 6880, 6895, 6910, 6925, 6940, 6955, 6970, 6985, 7000, 7015, 7030, 7045, 7060, 7075, 7090,
				7105, 7120, 7135, 7150, 7165, 7180, 7195, 7210, 7225, 7240, 7255, 7270, 7285, 7300, 7315, 7330, 7345,
				7360, 7375, 7390, 7405, 7420, 7435, 7450, 7465, 7480, 7495, 7510, 7525, 7540, 7555, 7570, 7585, 7600,
				7615, 7630, 7645, 7660, 7675, 7690, 7705, 7720, 7735, 7750, 7765, 7780, 7795, 7810, 7825, 7840, 7855,
				7870, 7885, 7900, 7915, 7930, 7945, 7960, 7975, 7990, 8005, 8020, 8035, 8050, 8065, 8080, 8095, 8110,
				8125, 8140, 8155, 8170, 8185, 8200, 8215, 8230, 8245, 8260, 8275, 8290, 8305, 8320, 8335, 8350, 8365,
				8380, 8395, 8410, 8425, 8440, 8455, 8470, 8485, 8500, 8515, 8530, 8545, 8560, 8575, 8590, 8605, 8620,
				8635, 8650, 8665, 8680, 8695, 8710, 8725, 8740, 8755, 8770, 8785, 8800, 8815, 8830, 8845, 8860, 8875,
				8890, 8905, 8920, 8935, 8950, 8965, 8980, 8995, 9010, 9025, 9040, 9055, 9070, 9085, 9100, 9115, 9130,
				9145, 9160, 9175, 9190, 9205, 9220, 9235, 9250, 9265, 9280, 9295, 9310, 9325, 9340, 9355, 9370, 9385,
				9400, 9415, 9430, 9445, 9460, 9475, 9490, 9505, 9520, 9535, 9550, 9565, 9580, 9595, 9610, 9625, 9640,
				9655, 9670, 9685, 9700, 9715, 9730, 9745, 9760, 9775, 9790, 9805, 9820, 9835, 9850, 9865, 9880, 9895,
				9910, 9925, 9940, 9955, 9970, 9985 };

		long TI = System.nanoTime();

		busca(iVetor, 0, iVetor.length - 1, 9970);

		long TF = System.nanoTime();

		System.out.println("Tempo de execu��o: " + (TF - TI) + " nanosegundos");

	}

	public static int busca(int iV[], int iB, int iA, int iK) {
		int iM = (iB + iA) / 2;
		if (iB <= iA)
			if (iK < iV[iM])
				return busca(iV, iB, iM - 1, iK);
			else if (iK > iV[iM])
				return busca(iV, iM + 1, iA, iK);
			else
				return iM;
		return -1;
	}
}
