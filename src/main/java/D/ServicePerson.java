package D;

public class ServicePerson {
    private final Save save;

    public ServicePerson (Save repository){
        this.save = repository;
    }

    public void savePerson(Person person) {
        save.savePerson(person);
    }

}
