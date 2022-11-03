public class Computer {
    String procesor;
    int memory;

    Computer(String proc){
        procesor = proc;
        memory = 8;
        System.out.println("Tworzę nowy komputer");
    }

    void print() {
        System.out.println(procesor + " " + memory);
    }
    String print2() {
        return procesor + " " + memory;
    }

}
