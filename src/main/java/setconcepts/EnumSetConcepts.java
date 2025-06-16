package setconcepts;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {

    /**
     * Its not synchronized
     * Its highly performance java collection member
     * faster than HashSet
     * All the methods are implemented using bitwise arthematic operations
     */

    enum Lang {
        JAVA,
        CSHARP,
        JAVASCRIPT,
        PYTHON,
        RUBY
    }

    public static void main(String[] args) {

        EnumSet<Lang> enumSet = EnumSet.allOf(Lang.class);
        System.out.println(enumSet);

        //Create the Empty EnumSet
        EnumSet<Lang> enumSet1 = EnumSet.noneOf(Lang.class);
        System.out.println(enumSet1);

        //Range method
        EnumSet<Lang> enumSet2 = EnumSet.range(Lang.JAVA, Lang.PYTHON);
        System.out.println(enumSet2);

        //of method
        EnumSet<Lang> csharpEnum = EnumSet.of(Lang.CSHARP);
        System.out.println(csharpEnum);

        EnumSet<Lang> multipleEnum = EnumSet.of(Lang.CSHARP, Lang.RUBY, Lang.JAVA);
        System.out.println(multipleEnum);

        //add and addAll methods
        EnumSet<Lang> lang1 = EnumSet.allOf(Lang.class);
        EnumSet<Lang> lang2 = EnumSet.noneOf(Lang.class);
        lang2.add(Lang.JAVA);
        System.out.println(lang2);
        lang2.addAll(lang1);
        System.out.println(lang2);

        //how to use the iterator Enumset

        EnumSet<Lang> fullLang = EnumSet.allOf(Lang.class);
        Iterator<Lang> it = fullLang.iterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            System.out.print(", ");
        }

        //remove the specific elements --> remove()
        // remove all the elements --> removeAll();

        EnumSet<Lang> newLang = EnumSet.allOf(Lang.class);
        System.out.println(newLang);

        boolean b = newLang.remove(Lang.JAVA);
        System.out.println(b);
        System.out.println(newLang);

        boolean b1 = newLang.removeAll(newLang);
        System.out.println(newLang);
    }
}
