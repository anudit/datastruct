package exp1;

public class Batsmen {
	
	static int columnSize = 8;
	static String sep = "|";
	
	public static String getFixed(String st) {
		
		if(st == null) {
			st = "null";
		}
		
		String fix = "";
		int spCnt = (columnSize - st.length())/2;
		for (int i=0; i<=spCnt; i++) {
			fix+=" ";
		}
		fix += st;
		for (int i=0; i<=spCnt-1; i++) {
			fix+=" ";
		}
		int diff = columnSize - (spCnt*2) - st.length();
		for (int i=0; i<diff; i++) {
			fix+=" ";
		}
		fix+=sep;
		return fix;
		
	}
	public String getFixed(int num) {

		String st = Integer.toString(num);
		return getFixed(st);
		
	}
	
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
	
	public Batsmen(Batsmen obj) {
		this.name = obj.name;
		this.ones = obj.ones;
		this.twos = obj.twos;
		this.threes = obj.threes;
		this.fours = obj.fours;
		this.sixes = obj.sixes;
	}

	public int getScore() {
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
	
	public static String header() {
		
		String temp = sep;
		temp += getFixed("Name");
		temp += getFixed("Score");
		temp += getFixed("Ones");
		temp += getFixed("Twos");
		temp += getFixed("Threes");
		temp += getFixed("Fours");
		temp += getFixed("Sixes");
		return temp;
    }
	
	public static String heading(String title) {
		
		int columns = 8;
		int totCnt = (columnSize * columns) + columns;
		int spCnt = ((totCnt - title.length())/2);
		
		String temp = "";
		for (int i=0; i<spCnt; i++) {
			temp+=" ";
		}
		temp+=title;
		for (int i=0; i<spCnt; i++) {
			temp+=" ";
		}
		return temp;
    }

	@Override
    public String toString() {
		
		String temp = sep;
		temp += getFixed(this.name);
		temp += getFixed(getScore());
		temp += getFixed(this.ones);
		temp += getFixed(this.twos);
		temp += getFixed(this.threes);
		temp += getFixed(this.fours);
		temp += getFixed(this.sixes);
		return temp;
    }
	
}
