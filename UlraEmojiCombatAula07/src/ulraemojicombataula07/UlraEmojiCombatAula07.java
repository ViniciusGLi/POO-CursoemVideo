package ulraemojicombataula07;

public class UlraEmojiCombatAula07 {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75,68.9,11,2,1);
        l[1] = new Lutador("Putscrip", "Brasil", 29, 1.68,57.8,14,2,3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65,80.9,12,2,1);
        l[3] = new Lutador("Dead  Code", "Austrália", 28, 1.93,81.6,13,0,2);
        l[4] = new Lutador("UF0COBOL", "Brasil", 37, 1.70,119.3,5,4,3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81,105.7,12,2,4);

       /* l[0].apresentar();
        l[1].apresentar();
        l[2].apresentar();
        l[3].apresentar();
        l[4].apresentar();
        l[5].apresentar();
        l[0].Status();
        l[1].Status();
        l[2].Status();
        l[3].Status();
        l[4].Status();
        l[5].Status();
        */
       Luta UEC01 = new Luta();
       UEC01.marcarLuta(l[0], l[1]);
       UEC01.lutar();
    }
    
}
