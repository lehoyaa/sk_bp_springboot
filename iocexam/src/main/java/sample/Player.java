package sample;

public class Player {
	private String name;
	private Dice dice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDice(Dice dice) {
		this.dice = dice;
	}
	
	public void play() {
		System.out.println(name + "은 주사위를 던저셔 "+dice.getNumber() +"가 나왔습니다.");
	}
	
}
