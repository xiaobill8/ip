package handlers;

import exceptions.DukeException;
import models.Deadline;
import models.Event;
import models.Task;
import models.TaskList;

import static services.Ui.dukePrint;

public class EventHandler {
    public static void handle(TaskList list, String input) throws DukeException {
        String[] eventInputs = input.split(" /at ", 2);
        if (eventInputs.length < 2 || eventInputs[1].trim().equals("")) {
            throw new DukeException("☹ OOPS!!! The description of a event cannot be empty.");
        }
        Task newTask = new Event(eventInputs[0], eventInputs[1]);
        list.add(newTask);
        dukePrint("Event Added!");
    }
}
