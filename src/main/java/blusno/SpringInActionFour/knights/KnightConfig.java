package blusno.SpringInActionFour.knights;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by root on 16-6-1.
 */
@Configuration
@EnableAspectJAutoProxy
public class KnightConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

    @Bean
    public Minstrel minstrel() { return new Minstrel(System.out); }

}
