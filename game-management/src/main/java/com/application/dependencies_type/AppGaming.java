package com.application.dependencies_type;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class BusinessClass {
    Dependency1 dependency1;
    Dependency2 dependency2; 
 
    // @Autowired
    BusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public void setDependency1(Dependency1 dependency1) {
        this.dependency1 = dependency1;
    }
    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
    }

    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class AppGaming {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppGaming.class);
        // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println(context.getBean(BusinessClass.class));
        context.close();
        // var marioGame = new MarioGame();
        // var superContraGame = new SuperContraGame(); // 1: Object Creation
        // var gameRunner = new GameRunner(superContraGame);
        //  2: Object creation and wiring together (injected)
        // Game is a dependency of GameRunner
        // gameRunner.run();
    }
}
