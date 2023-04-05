package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.Game;
import sample.MyBean;

public class SpringExam02 {

	public static void main(String[] args) {
		System.out.println("ApplicationContext 생성전!!");
		ApplicationContext context = new ClassPathXmlApplicationContext("diceGame.xml");
		System.out.println("ApplicationContext 생성후!!");
		
		Game game = context.getBean(Game.class);
		
		game.play();
	}

}
