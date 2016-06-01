package blusno.SpringInActionFour.knights;

import org.springframework.context.annotation.Bean;

/**
 * Created by root on 16-6-1.
 */
public class KnightMain {

    public static void main(String[] args) {

        KnightConfig config = new KnightConfig();

        config.knight().embarkOnQuest();

    }
}
