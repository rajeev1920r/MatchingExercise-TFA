package org.tfa.test.matching;

import org.junit.Assert;
import org.junit.Test;
import org.tfa.test.matching.Matcher;

public class MatcherTest {
    @Test
    public void SingleMatchTest(){
        Matcher matcher = new Matcher();
        String res = matcher.getBestMatch("NY","Blue","Advertising","Male");
        Assert.assertEquals("ID = 1 Score = 4",res);
    }
    @Test
    public void zeroMatchTest(){
        Matcher matcher = new Matcher();
        //BLUE != Blue
        String res = matcher.getBestMatch(null,"BLUE",null,null);
        Assert.assertEquals("ID = null Score = 0",res);
    }
}
