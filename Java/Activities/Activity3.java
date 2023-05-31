package Activities;
/*Given an age in secs, calculate how old someone would be on:

Earth: orbital period 365.25 Earth days, or 31557600 secs
Mercury: orbital period 0.2408467 Earth years
Venus: orbital period 0.61519726 Earth years
Mars: orbital period 1.8808158 Earth years
Jupiter: orbital period 11.862615 Earth years
Saturn: orbital period 29.447498 Earth years
Uranus: orbital period 84.016846 Earth years
Neptune: orbital period 164.79132 Earth years
So if you were told someone were 1,000,000,000 secs old,
you should be able to say that they're 31.69 Earth-years old.*/


class Activity3 {
    public static void main(String args[]) {
        double secs = 1000000000;

        double Earthsecs = 31557600;
        float Mercurysecs = 0.2408467F;
        double Venussecs = 0.61519726;
        double Marssecs = 1.8808158;
        double Jupitersecs = 11.862615;
        double Saturnsecs = 29.447498;
        double Uranussecs = 84.016846;
        double Neptunesecs = 164.79132;

        System.out.println("Age on Mercury: " + secs  / Mercurysecs);
        System.out.println("Age on Venus: " + secs  / Venussecs);
        System.out.println("Age on Earth: " + secs / Earthsecs);
        System.out.println("Age on Mars: " + secs  / Marssecs);
        System.out.println("Age on Jupiter: " + secs  / Jupitersecs);
        System.out.println("Age on Saturn: " + secs  / Saturnsecs);
        System.out.println("Age on Uranus: " + secs  / Uranussecs);
        System.out.println("Age on Neptune: " + secs  / Neptunesecs);
    }
}