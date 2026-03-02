void main() {
    Djur[] djurfält = new Djur[5];

    Hund doggo1 = new Hund();
    Hund doggo2 = new Hund();

    Katt cathrine1 = new Katt();
    Katt cathrine2 = new Katt();

    Mus mice = new Mus();

    djurfält[0] = doggo1;
    djurfält[1] = doggo2;
    djurfält[2] = cathrine1;
    djurfält[3] = cathrine2;
    djurfält[4] = mice;

    for (Djur djur : djurfält) {
        djur.läte();

        if (djur instanceof Hund) {
            ((Hund)djur).spåra("Musen");
            ((Hund)djur).apport();
            ((Hund)djur).kom();
            ((Hund)djur).sitt();
        } else if (djur instanceof Katt) {
            ((Katt)djur).leka("Hejsan");
        } else if (djur instanceof Mus) {
            ((Mus)djur).klättra();
        } else {
            IO.println("Inget djur hittades");
        }
    }
}
