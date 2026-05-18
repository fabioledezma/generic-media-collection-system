package dev.flq.genericsI;


public class Main {

    public static void main(String[] args) {

        BaseballTeam turbana = new BaseballTeam("Los Invensibles de Turbana");
        BaseballTeam turbaco = new BaseballTeam("Los tira piedra de Turbaco");

        scoreResult(turbana, 3, turbaco, 5);

        var fabio = new BaseballPlayer("Fabio", "Medio Campo");
        var keiner = new BaseballPlayer("Keier G", "Delantero");

        turbana.addMember(fabio);
        turbaco.addMember(keiner);
        System.out.println();
        turbana.listMembersName();
        turbaco.listMembersName();

    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);

        System.out.printf("%s %s %s %n", team1, message, team2);

    }
}