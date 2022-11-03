public class Start {
    public static void main(String[] args) {
//        Computer komp1 = new Computer();
//        komp1.procesor = "AMD";
//        komp1.memory = 4;
//
//        Computer komp2 = new Computer();
//        komp2.procesor = "Intel";
//        komp2.memory = 8;

        ComputerFactory factory = new ComputerFactory();
        Computer komp1 = factory.create("Amd",4);
        Computer komp2 = factory.create("Intel",8);

        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(komp2,2);
        upgrade.addMemory(komp1,2);

        komp1.print();
        komp2.print();
    }
}
