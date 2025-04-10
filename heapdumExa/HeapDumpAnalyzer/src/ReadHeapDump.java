import com.sun.tools.visualvm.application.Application;
import com.sun.tools.visualvm.core.ui.DataSourceView;
import com.sun.tools.visualvm.tools.jmx.HeapDumpAction;
import com.sun.tools.visualvm.tools.jmx.JmxModel;

import java.io.File;
public class ReadHeapDump {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Usage: ReadHeapDump <heapdump_file>");
            return;
        }

        File heapDumpFile = new File(args[0]);

        try {
            // Load the heap dump file
            Application app = Application.createApplication(heapDumpFile);

            // Create a JMX model for the application
            JmxModel jmxModel = new JmxModel(app);

            // Get the heap dump action
            HeapDumpAction heapDumpAction = new HeapDumpAction(jmxModel);

            // Execute the action, which will open the heap dump in VisualVM
            heapDumpAction.performAction();

        } catch (Exception e) {
            System.err.println("Error reading heap dump: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
