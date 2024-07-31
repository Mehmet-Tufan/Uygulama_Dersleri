package weel06.day03.database;

import weel06.day03.entities.Urun;

import java.util.ArrayList;
import java.util.List;

public class SepetDB {
	static List<Urun> sepetList = new ArrayList<>();
	
	public static void urunSave(Urun urun){
		sepetList.add(urun);
	}
	
	public static void urunListAll() {
		for (Urun urun: sepetList){
			System.out.println(urun);
		}
	}
}