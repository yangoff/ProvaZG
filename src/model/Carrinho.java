package model;

import java.util.List;

public class Carrinho {

	private List<Sku_produto> SkuA;
	private List<Sku_produto> SkuB;
	private List<Sku_produto> SkuC;
	private List<Sku_produto> SkuD;
	private int prodSD_A;
	private int prodSD_B;
	private int prodSD_C;
	private List<List> SkuCar;

	Sku_produto a = new Sku_produto("a", 50f);

	Sku_produto b = new Sku_produto("b", 30f);

	Sku_produto c = new Sku_produto("c", 20f);

	Sku_produto d = new Sku_produto("c", 15f);

	public void addSku(Sku_produto p) {

		if (p.getId().equalsIgnoreCase("a")) {
			if (SkuA.size() % 3 == 0) {

				SkuA.add(p);

			} else {
				SkuA.add(p);
				prodSD_A = SkuA.size() % 3;
			}

		} else if (p.getId().equalsIgnoreCase("b")) {
			if (SkuB.size() % 2 == 0) {

				SkuB.add(p);

			} else {
				SkuB.add(p);
				prodSD_B = SkuB.size() % 2;
			}

		} else if (p.getId().equalsIgnoreCase("c")) {

			if (SkuC.size() % 3 == 0) {

				SkuC.add(p);

			} else {
				SkuC.add(p);
				prodSD_C = SkuC.size() % 3;
			}

		} else if (p.getId().equalsIgnoreCase("d")) {

			SkuD.add(p);

		}

	}

	public void checkout() {
		SkuCar.add(SkuA);
		SkuCar.add(SkuB);
		SkuCar.add(SkuC);
		SkuCar.add(SkuD);

		int precoTotalSemD = 0;

		if (!SkuA.isEmpty()) {
			precoTotalSemD += (SkuA.size() * 50);
		}
		if (!SkuB.isEmpty()) {
			precoTotalSemD += (SkuB.size() * 30);
		}
		if (!SkuC.isEmpty()) {
			precoTotalSemD += (SkuC.size() * 20);
		}
		if (!SkuD.isEmpty()) {
			precoTotalSemD += (SkuD.size() * 15);
		}

		int desconto = descontoTo();

		System.out.println("O preço total seria " + precoTotalSemD);
		System.out.println("O desconto total e " + desconto);
		System.out.println("Logo seu checkout sera de " + precoTotalSemD + desconto);
	}

	private int descontoTo() {
		int desconto = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int tt;
		if (!SkuA.isEmpty()) {
			a = (int) Math.round((((SkuA.size() - (SkuA.size() - prodSD_A)) * 50) * 0.86));
		}
		if (!SkuB.isEmpty()) {
			b = (int) Math.round(((SkuB.size() - (SkuB.size() - prodSD_B)) * 30) * 0.75);
		}
		if (!SkuC.isEmpty()) {
			c = (int) Math.round(((SkuC.size() - (SkuC.size() - prodSD_C)) * 20) * 0.3);
		}

		tt = a + b + c;

		if (!SkuA.isEmpty()) {
			desconto += (SkuA.size() * 50);
		}
		if (!SkuB.isEmpty()) {
			desconto += (SkuB.size() * 30);
		}
		if (!SkuC.isEmpty()) {
			desconto += (SkuC.size() * 20);
		}

		return desconto - tt;
	}

}