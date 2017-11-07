/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /** Name of employee. */
    private String name;

    /** Name of manager. */
    private String manager;

    /**
     * Constructor for initialization.
     * @param setName Name of employee
     * @param setManager Name of manager
     */
    public Employee(final String setName, final String setManager) {
        this.name = setName;
        this.manager = setManager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param setName New name of employee
     */
    public void setName(final String setName) {
        this.name = setName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param setManager New name of manager;
     */
    public void setManager(final String setManager) {
        this.manager = setManager;
    }
}
