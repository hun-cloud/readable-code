package cleancode.studycafe.bymyself;

import cleancode.studycafe.bymyself.machine.Machine;

public class MachineApplication {

    public static void main(String[] args) {
        Machine machine = new StudyCafePassMachineRunnable();
        machine.run();
    }

}
