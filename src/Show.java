import java.util.ArrayList;
public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }
    public void printDirectorInformation() {
        System.out.println(director.toString());
    }
    public void printActorsInformation() {
        System.out.println(listOfActors);
    }
    public void addActorToShow(Actor actor){
        for (Actor a : listOfActors){
            if (actor.equals(a)) {
                System.out.println("Такой актёр уже есть!");
                return;
            }
        }
        listOfActors.add(actor);
    }

    public void substituteActor(Actor actor, String surname) {
        int index = 0;
        int numbOfNamesakes = 0;
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surname)) {
                index = i;
                numbOfNamesakes++;
                if (numbOfNamesakes > 1) break;
            }
        }
        if (numbOfNamesakes == 1) {
            listOfActors.remove(index);
            listOfActors.add(actor);
            System.out.println("Артист успешно заменён!");
        } else if (numbOfNamesakes > 1) {
            System.out.println("В списке актеров есть однофамильцы, замена не возможна!");
        } else {
            System.out.println("Не найден артист для замены!");
        }
    }
}
