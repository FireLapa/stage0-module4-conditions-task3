package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        char first = 'r';
        char second = 'R';
        if (symbol == first || symbol == second){
            System.out.println("English");
        }else{
            System.out.println("Non English");
        }
    }
}
