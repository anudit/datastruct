package lab3;

public class Batsmen {
	
	String name;
	int ones;
	int twos;
	int threes;
	int fours;
	int sixes;
	
	public Batsmen(
		String _name,
		int _ones,
		int _twos,
		int _threes,
		int _fours,
		int _sixes
	) {
		this.name = _name;
		this.ones = _ones;
		this.twos = _twos;
		this.threes = _threes;
		this.fours = _fours;
		this.sixes = _sixes;
	}
	
	public int getRank() {
		int rank = 0;
		rank += 1* this.ones;
		rank += 2* this.twos;
		rank += 4* this.threes;
		rank += 6* this.fours;
		rank += 8* this.sixes;
		return rank;
	}
	
	public void delete() {
		this.name = null;
		this.ones = 0;
		this.twos = 0;
		this.threes = 0;
		this.fours = 0;
		this.sixes = 0;
    }
	
}
