import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        //Создать трёх актеров и двух режиссёров. Также создайте одного автора музыки и одного хореографа
        Actor actor1 = new Actor("Ivan","Ivanov",Gender.MALE,180);
        Actor actor2 = new Actor("Ivanka","Ivanova",Gender.FEMALE,185);
        Actor actor3 = new Actor("Sergey","Kuznetsov",Gender.MALE,163);
        Director director1 = new Director("James","Cameron",Gender.MALE,20);
        Director director2 = new Director("Stanley","Kubrick",Gender.MALE,15);
        Person musicAuthor = new Person("Svyatoslav","Richter",Gender.MALE);
        Person choreographer = new Person("Michail","Fokin",Gender.MALE);
        //Создать три спектакля: обычный, оперный и балет

        Show show = new Show("Shining",120,director1,new ArrayList<>());
        Opera opera = new Opera("Rigoletto",130,director2,new ArrayList<>(),musicAuthor,
                "Cool libretto!",10);
        Ballet ballet = new Ballet("Swan lake",110,director1,new ArrayList<>(),musicAuthor,
                "Better libretto!",choreographer);

        //Распределить актёров по спектаклям. Используйте для этого метод добавления нового актёра в спектакль.
        // Один актёр может участвовать в нескольких спектаклях.
        show.addActorToShow(actor1);

        opera.addActorToShow(actor1);
        opera.addActorToShow(actor2);

        ballet.addActorToShow(actor1);
        ballet.addActorToShow(actor2);
        ballet.addActorToShow(actor3);
        //Для каждого спектакля выведите на экран список актёров.
        show.printActorsInformation();
        opera.printActorsInformation();
        ballet.printActorsInformation();
        //Замените актёра в одном из спектаклей на актёра из другого спектакля и
        // ещё раз выведите для него список актёров.
        show.substituteActor(actor2,"Ivanov");
        show.printActorsInformation();
        //Попробуйте заменить в другом спектакле несуществующего актёра
        opera.substituteActor(actor3,"Sapogov");
        opera.printActorsInformation();
        //Для оперного и балетного спектакля выведите на экран текст либретто.
        opera.printLibretto();
        ballet.printLibretto();

    }
}
