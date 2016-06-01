package blusno.SpringInActionFour.knights;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.Test;

/**
 * Created by root on 16-6-1.
 */
public class BraveKnightTest {
    @Test
    public void KnightShouldEmbarkOnQuest() throws Exception {

        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();

    }

}