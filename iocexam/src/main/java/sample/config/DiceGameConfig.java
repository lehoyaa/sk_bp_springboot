package sample.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import sample.Dice;
import sample.Game;
import sample.Player;
@PropertySource({"classpath:game.properties"})
public class DiceGameConfig {
	@Bean
	public Dice dice(@Value("${face}") int face ) {
		return new Dice(face);
	}

	@Bean
	public Player kang(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
		player.setName("강경미");
		return player;
	}
	@Bean
	public Player kim(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
		player.setName("김둘리");
		return player;
	}
	@Bean
	public Player hong(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
		player.setName("홍길동");
		return player;
	}
	@Bean
	public Player lee(Dice dice) {
		Player player = new Player();
		player.setDice(dice);
		player.setName("이효리");
		return player;
	}
	
	@Bean
	public Game game(List<Player> playerList) {
		Game game = new Game();
		game.setPlayerList(playerList);
		return game;
	}
}
