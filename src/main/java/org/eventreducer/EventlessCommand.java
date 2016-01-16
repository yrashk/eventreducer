package org.eventreducer;

import java.util.Collections;
import java.util.List;

public class EventlessCommand extends Command {
    @Override
    public List<Event> events(Endpoint endpoint) throws Exception {
        return Collections.emptyList();
    }
}