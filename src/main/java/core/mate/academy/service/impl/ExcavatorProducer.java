package core.mate.academy.service.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("excavator1", "orange"));
        excavators.add(new Excavator("excavator2", "indigo"));
        excavators.add(new Excavator("excavator3", "olive"));
        return excavators;
    }
}