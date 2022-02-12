package uaslp.objetos.time;

public class Main {

    public static void main(String[] args) {
        Time tiempo = new Time(10,10,10);
        System.out.println("Hora: " + tiempo.getHour() + " Minuto: " + tiempo.getMinute() + " Second: " + tiempo.getSecond());

        tiempo.addSecond(110);
        System.out.println(tiempo.toString());

        tiempo.addMinute(48);
        System.out.println(tiempo.toString());

        tiempo.addHour(14);
        System.out.println(tiempo.toString());

        tiempo.SetTime(12,12,12);
        System.out.println(tiempo.toString());
    }
}
