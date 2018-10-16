import work.Work;
import work.Works;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * The whole extension SPI mechanism is in the work package.
 * An example of a service (ie extension) is located in the workExtension package.
 * The extension registration occurs by placing a file (in this example work.WorkProvider) in the resources/META-INF/services directory. It contains a list of work provider class (In this example, to HelloWorkprovider)
 */
public class Main {

    public static void main(String[] args) throws URISyntaxException {

        URI uri = new URI("hello");
        //The Works factory method (Works.getWork) will trigger the search and load of all WorkProviders service.
        //When it finds the "hello" service provider, it will call its getWork function in order to get an instance of the service object (in this example: the workExtension.HelloWorld)

        Work work = Works.getWork(uri);
        work.execute();

    }
}
