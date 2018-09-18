package pkgStats;

public class Main {

	public static void main(String[] args) {
		//Babe Ruth 1926 stats
		int H = 184;
		int dub = 30;
		int tri = 5;
		int AB = 495;
		int BB = 144;
		int HR = 47;
		int HBP = 3;
		System.out.println(battingAverage(AB,H));
		System.out.println(onBasePerc(AB,H, BB, HBP));
		System.out.println(sluggingPerc(AB,H, dub, tri, HR));
		System.out.println(onBaseSlug(AB,H, BB, dub, tri, HR, HBP));
		System.out.println(totalBases(H, dub, tri, HR));
	}
	
	public static double battingAverage(int AB, int H) {
		return (double)H / AB;
	}

	public static double onBasePerc(int AB, int H, int BB, int HBP) {
		int nonHit = BB + HBP;
		int onBase = H + nonHit;
		return (double)onBase / (AB + nonHit); //* 100?
	}
	
	public static double sluggingPerc(int AB, int H, int dub, int tri, int HR) {
		return totalBases(H, dub, tri, HR)/(double)AB;
	}
	
	public static double onBaseSlug(int AB, int H, int BB, int dub, int tri, int HR, int HBP) {
		return onBasePerc(AB, H, BB, HBP) + sluggingPerc(AB, H, dub, tri, HR);
	}
	
	public static int totalBases(int H, int dub, int tri, int HR) {
		int singles = H - (dub + tri + HR);
		return singles + dub*2 + tri*3 + HR*4;
	}
	
}
