package com.application.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GamingConsole {
    public void up() {
        System.out.println("PacMan moves up");
    }
    public void down() {
        System.out.println("PacMan moves down");
    }
    public void left() {
        System.out.println("PacMan moves left");
    }
    public void right() {
        System.out.println("PacMan moves right");
    }
}
