import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;


public class ListTests {
    @Test
    public void testFilter(){
    
        ListLengthChecker lengthChecker = new ListLengthChecker();
        lengthChecker.holdshortLength("gabber");
        List<String> newstringlist = new ArrayList<>();
        newstringlist.add("Supercalifragilisticexpialidocious");
        newstringlist.add("handkerchief");
        newstringlist.add("abbreviations");
        newstringlist.add("Ant");
        List<String> comparestringlist = new ArrayList<>();
        comparestringlist.add("Supercalifragilisticexpialidocious");
        comparestringlist.add("handkerchief");
        comparestringlist.add("abbreviations");
        assertArrayEquals(comparestringlist.toArray(),ListExamples.filter(newstringlist,lengthChecker).toArray());

        


    }
}
