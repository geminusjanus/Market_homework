

import java.util.LinkedList;
import java.util.Queue;

public interface i_QueueBehaviour {
    Queue<Customer> QUEUE = new LinkedList<>();

    void addCustomerToQueue(Customer newCustomer);

    Customer pullFirstFromQueue();
    void queueToString();
}