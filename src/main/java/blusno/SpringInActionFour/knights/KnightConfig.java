package blusno.SpringInActionFour.knights;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by root on 16-6-1.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class KnightConfig {


    public @Bean Knight knight(){
        return new BraveKnight(quest());
    }

    public @Bean Quest quest(){
        return new SlayDragonQuest(System.out);
    }

    public @Bean Minstrel minstrel() { return new Minstrel(System.out); }

}
