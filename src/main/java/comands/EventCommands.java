package comands;

public interface EventCommands {

    int EXIT = 0;
    int ADD_EVENT = 1;
    int ADD_USER = 2;
    int SHOW_ALL_EVENT = 3;
    int SHOW_ALL_USER = 4;

       static void printCommands() {
        System.out.println("please input " + EXIT + "foe EXIT");
        System.out.println("please input " + ADD_EVENT + "for ADD_EVENT");
        System.out.println("please input " + ADD_USER + "for ADD_USER");
        System.out.println("please input " + SHOW_ALL_EVENT + "for SHOW_ALL_EVENT");
        System.out.println("please input " + SHOW_ALL_USER + "for SHOW_ALL_USER");
    }
}
