package com.application.game_management;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.application.game.GameRunner;

public class AppGaming {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfiguration.class);
        context.getBean(GameRunner.class).run();
        context.close();
        // var marioGame = new MarioGame();
        // var superContraGame = new SuperContraGame(); // 1: Object Creation
        // var gameRunner = new GameRunner(superContraGame);
        //  2: Object creation and wiring together (injected)
        // Game is a dependency of GameRunner
        // gameRunner.run();
    }
}
