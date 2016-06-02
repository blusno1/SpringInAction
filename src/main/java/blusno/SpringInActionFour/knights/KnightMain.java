package blusno.SpringInActionFour.knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by root on 16-6-1.
 */
public class KnightMain {

    public static void main(String[] args) {

        /**
         * 通过java config 获取bean
         */
        KnightConfig config = new KnightConfig();

        config.knight().embarkOnQuest();

        /**
         * 通过xml 获取bean
         */
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knights.xml");
        Knight knight = (Knight) context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();*/

    }
}
