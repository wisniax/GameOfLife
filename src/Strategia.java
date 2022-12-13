public interface Strategia {
	//	Strategia:
//	boolean czyOzywic(boolean[][]) - czy komórkę o podanym sąsiedztwie (tablica 3x3, gdzie true oznacza żywą komórkę)
//      należy ożywić; komórka której dotyczy decyzja znajduje się na środku
//	boolean czyZabić(boolean[][])
	boolean czyOzywic(boolean[][] table);
	boolean czyZabic(boolean[][] table);
}
