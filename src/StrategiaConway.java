import java.util.Arrays;

public class StrategiaConway implements Strategia {
	//StrategiaConway - klasa implementujaca int. Strategia i realizujaca reguly wg Conwaya:
	//      Martwa komórka, która ma dokładnie 3 żywych sąsiadów, staje się żywa w następnej jednostce czasu (rodzi się)
	//      Żywa komórka z 2 albo 3 żywymi sąsiadami pozostaje nadal żywa; przy innej liczbie sąsiadów umiera (z „samotności” albo „zatłoczenia”)
	//boolean czyOzywic(boolean[][]) -
	// czy komórkę o podanym sąsiedztwie (tablica 3x3, gdzie true oznacza żywą komórkę) należy ożywić;
	//                          komórka której dotyczy decyzja znajduje się na środku
	public boolean czyOzywic(boolean[][] table) {
		//table is 3 by 3
		if (table[1][1]) return false;
		var iloscZywych = Arrays.deepToString(table).split("true", -1).length - 1;
		return iloscZywych == 3;
	}

	public boolean czyZabic(boolean[][] table) {
		if (!table[1][1]) return false;
		var iloscZywych = Arrays.deepToString(table).split("true", -1).length - 2;
		return !(iloscZywych == 2 || iloscZywych == 3);
	}
}
