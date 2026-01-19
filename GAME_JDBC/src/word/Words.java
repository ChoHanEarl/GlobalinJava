package word;

public class Words {
	private int wordId;
	private String japanese;
	private String korean;
	private String romaji;
	private String category;
	private int difficulty;
	
	public Words() {}
	
	public Words(int wordId, String japanese, String korean, String romaji, String category, int difficulty) {
		this.wordId = wordId;
		this.japanese = japanese;
		this.korean = korean;
		this.romaji = romaji;
		this.category = category;
		this.difficulty = difficulty;
	}
	
	public int getWordId() {return wordId;}
	public void setWordId(int wordId) {this.wordId = wordId;}
	
	public String getJapanese() {return japanese;}
	public void setJapanese(String japanese) {this.japanese = japanese;}
	
	public String getKorean() {return korean;}
	public void setKorean(String korean) {this.korean = korean;}
	
	public String getRomaji() {return romaji;}
	public void setRomaji(String romaji) {this.romaji = romaji;}
	
	public String getCategory() {return category;}
	public void setCategory(String category) {this.category = category;}
	
	public int getDifficulty() {return difficulty;}
	public void setDifficulty(int difficulty) {this.difficulty = difficulty;}
	
	@Override
	public String toString() {
		return "Word{" +
				"wordId=" + wordId +
				", japanese='" + japanese + '\'' +
				", korean='" + korean +'\'' +
				", romaji='" + romaji + '\'' +
				", category='" + category + '\'' +
				", difficulty='" + difficulty + '}';
	}
}
