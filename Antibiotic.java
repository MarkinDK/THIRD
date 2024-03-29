public class Antibiotic extends Medicine {
    Antibiotic(String name, Type type, Application application, int dosage) {
        super(name, type, application, dosage);
    }

    @Override
    public void medicate(TakeMedicine recipient) {
        recipient.inflammationCure(this);
    }

    /*@Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }*/
}
