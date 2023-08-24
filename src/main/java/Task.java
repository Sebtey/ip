public class Task {
    private boolean isDone;
    private String description;

    Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getTask(){
     return this.description;
    }

    /**
     * updateCompletionStatus will change the current completion status of the task
     * to true or false if it is currently false or true respectively.
     */
    public void updateCompletionStatus() {
        //If done, change to not done or false
        //Else, change to done or true
        this.isDone = !(this.isDone);
    }

    public String getStatusIcon() {
        //Task is marked as done with an "X"
        return isDone
                ? "X"
                : " ";
    }
}
