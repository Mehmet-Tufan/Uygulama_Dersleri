package weel06.day03.entities;

import weel06.day03.utility.EColor;
import weel06.day03.utility.ESize;

public class UstGiyim extends Kiyafet{
	public UstGiyim(Double fiyat, Integer stokAdet, String urunAdi, ESize size, EColor color) {
		super(fiyat, stokAdet, urunAdi,size,color);
	}
}